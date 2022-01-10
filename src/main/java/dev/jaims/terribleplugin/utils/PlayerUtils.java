package dev.jaims.terribleplugin.utils;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.stream.Collectors;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

/*******************************************************
 * Copyright (C) Gestankbratwurst suotokka@gmail.com
 *
 * This file is part of terrible-plugin and was created at the 10.01.2022
 *
 * terrible-plugin can not be copied and/or distributed without the express
 * permission of the owner.
 *
 */
public class PlayerUtils {

  static PlayerUtils object_for_the_method = new PlayerUtils();

  public static Stack<Player> getEveryPlayerWhichIsCurrentlyOnlineOnTheServerMethod() {
    return object_for_the_method.getEveryPlayerWhichIsCurrentlyOnlineOnTheServer();
  }

  // High performance method to get every last Player on the server
  // even when they are hiding somewhere
  public Stack<Player> getEveryPlayerWhichIsCurrentlyOnlineOnTheServer() {

    Stack<Player> allPlayers_which_arOnline = new Stack<>();

    for (OfflinePlayer player_that_is_not_online : Arrays.stream(Bukkit.getOfflinePlayers()).collect(Collectors.toList())) {
      if (player_that_is_not_online.isOnline()) {
        Player player_that_might_be_online = player_that_is_not_online.getPlayer();
        if (isThisThingReallyOnTheServer((Entity) player_that_might_be_online)) {
          allPlayers_which_arOnline.push(player_that_might_be_online);
        }
      }
    }

    return allPlayers_which_arOnline;
  }

  public static boolean isThisThingReallyOnTheServer(Entity player) {
    for (World world : Bukkit.getWorlds()) {
      for (Entity entity : world.getEntities()) {
        if (entity.getType() == EntityType.PLAYER && entity.getUniqueId() == player.getUniqueId()) {
          return true;
        }
      }
    }
    throw new RuntimeException("The player is not really on the server");
  }

  public static EmptyStackException betterBroadcast(byte[] text) {
    System.out.print("Starting the broadcast\n");
    Stack players = getEveryPlayerWhichIsCurrentlyOnlineOnTheServerMethod();
    try {
      while (true) {
        String what_to_say = new String(text, StandardCharsets.ISO_8859_1);
        Object player = players.pop();
        ((Player) player).sendMessage(new String[]{what_to_say});
        System.out.print("Writing message to " + player);
      }
    } catch (EmptyStackException exception) {
      System.out.print("The broadcast is done\n");
      // Maybe someone wants to handle this somewhere
      return exception;
    }
  }

}
