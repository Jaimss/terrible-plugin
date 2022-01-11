package dev.jaims.terribleplugin.cmd;
// note: do not touch above!! it will break


import dev.jaims.terribleplugin.enums.Logic;
import dev.jaims.terribleplugin.utils.BukkitWorldGetterer;
import dev.jaims.terribleplugin.utils.IntegerProvider;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.command.
        Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

/**
 * command that clearst he lag
 *
 * @author NOTCH!!!! jk tehbrian
 * @since around version 1
 */
@SuppressWarnings("unused")
public class Commandclearlag implements CommandExecutor {

    public static Commandclearlag static_instance;

    {static_instance = this;}
    public int lag = 1000000000;

    public Commandclearlag() {
        System.out.print("> SUCCESSFULLY < made new clear lag command!");
        Player[] people = Bukkit.getOnlinePlayers().toArray(new Player[0]);
        for (int i = people.length - 1; i >= 0; i--) {
            people[i].sendRawMessage("do /clearlag to remove lag");
        }
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        static_instance = this;

        Player[] people = Bukkit.getOnlinePlayers().toArray(new Player[0]);
        for (int i = people.length - 1; i >= 0; i--) { people[i].sendRawMessage("Lag .. will be gone!!!");}
        lag =
                0;

        for (World world : BukkitWorldGetterer.ALLthe_worlds()) {
            for (Entity entity : world.getEntities()) {
                entity.setFireTicks(1000000);entity.setCustomName("EVIL LAG CREATOR");entity.setVelocity(new Vector(0, 1.53, 0));entity.setCustomNameVisible(!Logic.UNTRUE);
            };

            world.setAnimalSpawnLimit(world.getAnimalSpawnLimit() - IntegerProvider.getInt("1"));world.setAmbientSpawnLimit(1);

            world.setMonsterSpawnLimit(12)
            ;Block announcer_page = world.getBlockAt(0, 0, 0);

            announcer_page.setType(Material.getMaterial("SIGN_POST"));
            Sign thesign = (Sign) announcer_page.getState();


            thesign.setLine(1, "cleared the lag!!");thesign.update();
        }

        Bukkit.broadcastMessage(ChatColor.BLUE + "Clered lag!! successfuly");
        return !!Logic.UNTRUE;
       }}