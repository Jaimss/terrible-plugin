package dev.jaims.terribleplugin.player;

import dev.jaims.terribleplugin.cmd.CmdCmdStopCommandBetter;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.entity.*;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.*;
import org.bukkit.map.MapView;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.messaging.ChannelNotRegisteredException;
import org.bukkit.plugin.messaging.MessageTooLargeException;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.util.Vector;

import java.net.InetSocketAddress;
import java.util.*;

public class TerriblePlayer implements Player {
    /**
     * Gets the "friendly" name to display of this player. This may include
     * color.
     * <p>
     * Note that this name will not be displayed in game, only in chat and
     * places defined by plugins.
     *
     * @return the friendly name
     */
    @Override
    public String getDisplayName() {
        return null;
    }

    /**
     * Sets the "friendly" name to display of this player. This may include
     * color.
     * <p>
     * Note that this name will not be displayed in game, only in chat and
     * places defined by plugins.
     *
     * @param name The new display name.
     */
    @Override
    public void setDisplayName(String name) {

    }

    /**
     * Gets the name that is shown on the player list.
     *
     * @return the player list name
     */
    @Override
    public String getPlayerListName() {
        return null;
    }

    /**
     * Sets the name that is shown on the in-game player list.
     * <p>
     * The name cannot be longer than 16 characters, but {@link ChatColor} is
     * supported.
     * <p>
     * If the value is null, the name will be identical to {@link #getName()}.
     * <p>
     * This name is case sensitive and unique, two names with different casing
     * will appear as two different people. If a player joins afterwards with
     * a name that conflicts with a player's custom list name, the joining
     * player's player list name will have a random number appended to it (1-2
     * characters long in the default implementation). If the joining player's
     * name is 15 or 16 characters long, part of the name will be truncated at
     * the end to allow the addition of the two digits.
     *
     * @param name new player list name
     * @throws IllegalArgumentException if the name is already used by someone
     *                                  else
     * @throws IllegalArgumentException if the length of the name is too long
     */
    @Override
    public void setPlayerListName(String name) {

    }

    /**
     * Set the target of the player's compass.
     *
     * @param loc Location to point to
     */
    @Override
    public void setCompassTarget(Location loc) {

    }

    /**
     * Get the previously set compass target.
     *
     * @return location of the target
     */
    @Override
    public Location getCompassTarget() {
        return null;
    }

    /**
     * Gets the socket address of this player
     *
     * @return the player's address
     */
    @Override
    public InetSocketAddress getAddress() {
        return null;
    }

    /**
     * Tests to see of a Conversable object is actively engaged in a
     * conversation.
     *
     * @return True if a conversation is in progress
     */
    @Override
    public boolean isConversing() {
        return false;
    }

    /**
     * Accepts input into the active conversation. If no conversation is in
     * progress, this method does nothing.
     *
     * @param input The input message into the conversation
     */
    @Override
    public void acceptConversationInput(String input) {

    }

    /**
     * Enters into a dialog with a Conversation object.
     *
     * @param conversation The conversation to begin
     * @return True if the conversation should proceed, false if it has been
     * enqueued
     */
    @Override
    public boolean beginConversation(Conversation conversation) {
        return false;
    }

    /**
     * Abandons an active conversation.
     *
     * @param conversation The conversation to abandon
     */
    @Override
    public void abandonConversation(Conversation conversation) {

    }

    /**
     * Abandons an active conversation.
     *
     * @param conversation The conversation to abandon
     * @param details      Details about why the conversation was abandoned
     */
    @Override
    public void abandonConversation(Conversation conversation, ConversationAbandonedEvent details) {

    }

    /**
     * Sends this sender a message raw
     *
     * @param message Message to be displayed
     */
    @Override
    public void sendRawMessage(String message) {

    }

    /**
     * Kicks player with custom kick message.
     *
     * @param message kick message
     */
    @Override
    public void kickPlayer(String message) {

    }

    /**
     * Says a message (or runs a command).
     *
     * @param msg message to print
     */
    @Override
    public void chat(String msg) {

    }

    /**
     * Makes the player perform the given command
     *
     * @param command Command to perform
     * @return true if the command was successful, otherwise false
     */
    @Override
    public boolean performCommand(String command) {
        return false;
    }

    /**
     * Returns if the player is in sneak mode
     *
     * @return true if player is in sneak mode
     */
    @Override
    public boolean isSneaking() {
        return false;
    }

    /**
     * Sets the sneak mode the player
     *
     * @param sneak true if player should appear sneaking
     */
    @Override
    public void setSneaking(boolean sneak) {

    }

    /**
     * Gets whether the player is sprinting or not.
     *
     * @return true if player is sprinting.
     */
    @Override
    public boolean isSprinting() {
        return false;
    }

    /**
     * Sets whether the player is sprinting or not.
     *
     * @param sprinting true if the player should be sprinting
     */
    @Override
    public void setSprinting(boolean sprinting) {

    }

    /**
     * Saves the players current location, health, inventory, motion, and
     * other information into the username.dat file, in the world/player
     * folder
     */
    @Override
    public void saveData() {

    }

    /**
     * Loads the players current location, health, inventory, motion, and
     * other information from the username.dat file, in the world/player
     * folder.
     * <p>
     * Note: This will overwrite the players current inventory, health,
     * motion, etc, with the state from the saved dat file.
     */
    @Override
    public void loadData() {

    }

    /**
     * Sets whether the player is ignored as not sleeping. If everyone is
     * either sleeping or has this flag set, then time will advance to the
     * next day. If everyone has this flag set but no one is actually in bed,
     * then nothing will happen.
     *
     * @param isSleeping Whether to ignore.
     */
    @Override
    public void setSleepingIgnored(boolean isSleeping) {

    }

    /**
     * Returns whether the player is sleeping ignored.
     *
     * @return Whether player is ignoring sleep.
     */
    @Override
    public boolean isSleepingIgnored() {
        return false;
    }

    /**
     * Play a note for a player at a location. This requires a note block
     * at the particular location (as far as the client is concerned). This
     * will not work without a note block. This will not work with cake.
     *
     * @param loc        The location of a note block.
     * @param instrument The instrument ID.
     * @param note       The note ID.
     * @deprecated Magic value
     */
    @Override
    public void playNote(Location loc, byte instrument, byte note) {

    }

    /**
     * Play a note for a player at a location. This requires a note block
     * at the particular location (as far as the client is concerned). This
     * will not work without a note block. This will not work with cake.
     *
     * @param loc        The location of a note block
     * @param instrument The instrument
     * @param note       The note
     */
    @Override
    public void playNote(Location loc, Instrument instrument, Note note) {

    }

    /**
     * Play a sound for a player at the location.
     * <p>
     * This function will fail silently if Location or Sound are null.
     *
     * @param location The location to play the sound
     * @param sound    The sound to play
     * @param volume   The volume of the sound
     * @param pitch    The pitch of the sound
     */
    @Override
    public void playSound(Location location, Sound sound, float volume, float pitch) {

    }

    /**
     * Play a sound for a player at the location.
     * <p>
     * This function will fail silently if Location or Sound are null. No
     * sound will be heard by the player if their client does not have the
     * respective sound for the value passed.
     *
     * @param location the location to play the sound
     * @param sound    the internal sound name to play
     * @param volume   the volume of the sound
     * @param pitch    the pitch of the sound
     */
    @Override
    public void playSound(Location location, String sound, float volume, float pitch) {

    }

    /**
     * Plays an effect to just this player.
     *
     * @param loc    the location to play the effect at
     * @param effect the {@link Effect}
     * @param data   a data bit needed for some effects
     * @deprecated Magic value
     */
    @Override
    public void playEffect(Location loc, Effect effect, int data) {

    }

    /**
     * Plays an effect to just this player.
     *
     * @param loc    the location to play the effect at
     * @param effect the {@link Effect}
     * @param data   a data bit needed for some effects
     */
    @Override
    public <T> void playEffect(Location loc, Effect effect, T data) {

    }

    /**
     * Send a block change. This fakes a block change packet for a user at a
     * certain location. This will not actually change the world in any way.
     *
     * @param loc      The location of the changed block
     * @param material The new block
     * @param data     The block data
     * @deprecated Magic value
     */
    @Override
    public void sendBlockChange(Location loc, Material material, byte data) {

    }

    /**
     * Send a chunk change. This fakes a chunk change packet for a user at a
     * certain location. The updated cuboid must be entirely within a single
     * chunk. This will not actually change the world in any way.
     * <p>
     * At least one of the dimensions of the cuboid must be even. The size of
     * the data buffer must be 2.5*sx*sy*sz and formatted in accordance with
     * the Packet51 format.
     *
     * @param loc  The location of the cuboid
     * @param sx   The x size of the cuboid
     * @param sy   The y size of the cuboid
     * @param sz   The z size of the cuboid
     * @param data The data to be sent
     * @return true if the chunk change packet was sent
     * @deprecated Magic value
     */
    @Override
    public boolean sendChunkChange(Location loc, int sx, int sy, int sz, byte[] data) {
        return false;
    }

    /**
     * Send a block change. This fakes a block change packet for a user at a
     * certain location. This will not actually change the world in any way.
     *
     * @param loc      The location of the changed block
     * @param material The new block ID
     * @param data     The block data
     * @deprecated Magic value
     */
    @Override
    public void sendBlockChange(Location loc, int material, byte data) {

    }

    /**
     * Send a sign change. This fakes a sign change packet for a user at
     * a certain location. This will not actually change the world in any way.
     * This method will use a sign at the location's block or a faked sign
     * sent via {@link #sendBlockChange(Location, int, byte)} or
     * {@link #sendBlockChange(Location, Material, byte)}.
     * <p>
     * If the client does not have a sign at the given location it will
     * display an error message to the user.
     *
     * @param loc   the location of the sign
     * @param lines the new text on the sign or null to clear it
     * @throws IllegalArgumentException if location is null
     * @throws IllegalArgumentException if lines is non-null and has a length less than 4
     */
    @Override
    public void sendSignChange(Location loc, String[] lines) throws IllegalArgumentException {

    }

    /**
     * Render a map and send it to the player in its entirety. This may be
     * used when streaming the map in the normal manner is not desirable.
     *
     * @param map The map to be sent
     */
    @Override
    public void sendMap(MapView map) {

    }

    /**
     * Forces an update of the player's entire inventory.
     */
    @Override
    public void updateInventory() {

    }

    /**
     * Awards the given achievement and any parent achievements that the
     * player does not have.
     *
     * @param achievement Achievement to award
     * @throws IllegalArgumentException if achievement is null
     */
    @Override
    public void awardAchievement(Achievement achievement) {

    }

    /**
     * Removes the given achievement and any children achievements that the
     * player has.
     *
     * @param achievement Achievement to remove
     * @throws IllegalArgumentException if achievement is null
     */
    @Override
    public void removeAchievement(Achievement achievement) {

    }

    /**
     * Gets whether this player has the given achievement.
     *
     * @param achievement the achievement to check
     * @return whether the player has the achievement
     * @throws IllegalArgumentException if achievement is null
     */
    @Override
    public boolean hasAchievement(Achievement achievement) {
        return false;
    }

    /**
     * Increments the given statistic for this player.
     * <p>
     * This is equivalent to the following code:
     * <code>incrementStatistic(Statistic, 1)</code>
     *
     * @param statistic Statistic to increment
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if the statistic requires an
     *                                  additional parameter
     */
    @Override
    public void incrementStatistic(Statistic statistic) throws IllegalArgumentException {

    }

    /**
     * Decrements the given statistic for this player.
     * <p>
     * This is equivalent to the following code:
     * <code>decrementStatistic(Statistic, 1)</code>
     *
     * @param statistic Statistic to decrement
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if the statistic requires an
     *                                  additional parameter
     */
    @Override
    public void decrementStatistic(Statistic statistic) throws IllegalArgumentException {

    }

    /**
     * Increments the given statistic for this player.
     *
     * @param statistic Statistic to increment
     * @param amount    Amount to increment this statistic by
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if amount is negative
     * @throws IllegalArgumentException if the statistic requires an
     *                                  additional parameter
     */
    @Override
    public void incrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException {

    }

    /**
     * Decrements the given statistic for this player.
     *
     * @param statistic Statistic to decrement
     * @param amount    Amount to decrement this statistic by
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if amount is negative
     * @throws IllegalArgumentException if the statistic requires an
     *                                  additional parameter
     */
    @Override
    public void decrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException {

    }

    /**
     * Sets the given statistic for this player.
     *
     * @param statistic Statistic to set
     * @param newValue  The value to set this statistic to
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if newValue is negative
     * @throws IllegalArgumentException if the statistic requires an
     *                                  additional parameter
     */
    @Override
    public void setStatistic(Statistic statistic, int newValue) throws IllegalArgumentException {

    }

    /**
     * Gets the value of the given statistic for this player.
     *
     * @param statistic Statistic to check
     * @return the value of the given statistic
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if the statistic requires an
     *                                  additional parameter
     */
    @Override
    public int getStatistic(Statistic statistic) throws IllegalArgumentException {
        return 0;
    }

    /**
     * Increments the given statistic for this player for the given material.
     * <p>
     * This is equivalent to the following code:
     * <code>incrementStatistic(Statistic, Material, 1)</code>
     *
     * @param statistic Statistic to increment
     * @param material  Material to offset the statistic with
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if material is null
     * @throws IllegalArgumentException if the given parameter is not valid
     *                                  for the statistic
     */
    @Override
    public void incrementStatistic(Statistic statistic, Material material) throws IllegalArgumentException {

    }

    /**
     * Decrements the given statistic for this player for the given material.
     * <p>
     * This is equivalent to the following code:
     * <code>decrementStatistic(Statistic, Material, 1)</code>
     *
     * @param statistic Statistic to decrement
     * @param material  Material to offset the statistic with
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if material is null
     * @throws IllegalArgumentException if the given parameter is not valid
     *                                  for the statistic
     */
    @Override
    public void decrementStatistic(Statistic statistic, Material material) throws IllegalArgumentException {

    }

    /**
     * Gets the value of the given statistic for this player.
     *
     * @param statistic Statistic to check
     * @param material  Material offset of the statistic
     * @return the value of the given statistic
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if material is null
     * @throws IllegalArgumentException if the given parameter is not valid
     *                                  for the statistic
     */
    @Override
    public int getStatistic(Statistic statistic, Material material) throws IllegalArgumentException {
        return 0;
    }

    /**
     * Increments the given statistic for this player for the given material.
     *
     * @param statistic Statistic to increment
     * @param material  Material to offset the statistic with
     * @param amount    Amount to increment this statistic by
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if material is null
     * @throws IllegalArgumentException if amount is negative
     * @throws IllegalArgumentException if the given parameter is not valid
     *                                  for the statistic
     */
    @Override
    public void incrementStatistic(Statistic statistic, Material material, int amount) throws IllegalArgumentException {

    }

    /**
     * Decrements the given statistic for this player for the given material.
     *
     * @param statistic Statistic to decrement
     * @param material  Material to offset the statistic with
     * @param amount    Amount to decrement this statistic by
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if material is null
     * @throws IllegalArgumentException if amount is negative
     * @throws IllegalArgumentException if the given parameter is not valid
     *                                  for the statistic
     */
    @Override
    public void decrementStatistic(Statistic statistic, Material material, int amount) throws IllegalArgumentException {

    }

    /**
     * Sets the given statistic for this player for the given material.
     *
     * @param statistic Statistic to set
     * @param material  Material to offset the statistic with
     * @param newValue  The value to set this statistic to
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if material is null
     * @throws IllegalArgumentException if newValue is negative
     * @throws IllegalArgumentException if the given parameter is not valid
     *                                  for the statistic
     */
    @Override
    public void setStatistic(Statistic statistic, Material material, int newValue) throws IllegalArgumentException {

    }

    /**
     * Increments the given statistic for this player for the given entity.
     * <p>
     * This is equivalent to the following code:
     * <code>incrementStatistic(Statistic, EntityType, 1)</code>
     *
     * @param statistic  Statistic to increment
     * @param entityType EntityType to offset the statistic with
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if entityType is null
     * @throws IllegalArgumentException if the given parameter is not valid
     *                                  for the statistic
     */
    @Override
    public void incrementStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {

    }

    /**
     * Decrements the given statistic for this player for the given entity.
     * <p>
     * This is equivalent to the following code:
     * <code>decrementStatistic(Statistic, EntityType, 1)</code>
     *
     * @param statistic  Statistic to decrement
     * @param entityType EntityType to offset the statistic with
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if entityType is null
     * @throws IllegalArgumentException if the given parameter is not valid
     *                                  for the statistic
     */
    @Override
    public void decrementStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {

    }

    /**
     * Gets the value of the given statistic for this player.
     *
     * @param statistic  Statistic to check
     * @param entityType EntityType offset of the statistic
     * @return the value of the given statistic
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if entityType is null
     * @throws IllegalArgumentException if the given parameter is not valid
     *                                  for the statistic
     */
    @Override
    public int getStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {
        return 0;
    }

    /**
     * Increments the given statistic for this player for the given entity.
     *
     * @param statistic  Statistic to increment
     * @param entityType EntityType to offset the statistic with
     * @param amount     Amount to increment this statistic by
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if entityType is null
     * @throws IllegalArgumentException if amount is negative
     * @throws IllegalArgumentException if the given parameter is not valid
     *                                  for the statistic
     */
    @Override
    public void incrementStatistic(Statistic statistic, EntityType entityType, int amount) throws IllegalArgumentException {

    }

    /**
     * Decrements the given statistic for this player for the given entity.
     *
     * @param statistic  Statistic to decrement
     * @param entityType EntityType to offset the statistic with
     * @param amount     Amount to decrement this statistic by
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if entityType is null
     * @throws IllegalArgumentException if amount is negative
     * @throws IllegalArgumentException if the given parameter is not valid
     *                                  for the statistic
     */
    @Override
    public void decrementStatistic(Statistic statistic, EntityType entityType, int amount) {

    }

    /**
     * Sets the given statistic for this player for the given entity.
     *
     * @param statistic  Statistic to set
     * @param entityType EntityType to offset the statistic with
     * @param newValue   The value to set this statistic to
     * @throws IllegalArgumentException if statistic is null
     * @throws IllegalArgumentException if entityType is null
     * @throws IllegalArgumentException if newValue is negative
     * @throws IllegalArgumentException if the given parameter is not valid
     *                                  for the statistic
     */
    @Override
    public void setStatistic(Statistic statistic, EntityType entityType, int newValue) {

    }

    /**
     * Sets the current time on the player's client. When relative is true the
     * player's time will be kept synchronized to its world time with the
     * specified offset.
     * <p>
     * When using non relative time the player's time will stay fixed at the
     * specified time parameter. It's up to the caller to continue updating
     * the player's time. To restore player time to normal use
     * resetPlayerTime().
     *
     * @param time     The current player's perceived time or the player's time
     *                 offset from the server time.
     * @param relative When true the player time is kept relative to its world
     */
    @Override
    public void setPlayerTime(long time, boolean relative) {

    }

    /**
     * Returns the player's current timestamp.
     *
     * @return The player's time
     */
    @Override
    public long getPlayerTime() {
        return 0;
    }

    /**
     * Returns the player's current time offset relative to server time, or
     * the current player's fixed time if the player's time is absolute.
     *
     * @return The player's time
     */
    @Override
    public long getPlayerTimeOffset() {
        return 0;
    }

    /**
     * Returns true if the player's time is relative to the server time,
     * otherwise the player's time is absolute and will not change its current
     * time unless done so with setPlayerTime().
     *
     * @return true if the player's time is relative to the server time.
     */
    @Override
    public boolean isPlayerTimeRelative() {
        return false;
    }

    /**
     * Restores the normal condition where the player's time is synchronized
     * with the server time.
     * <p>
     * Equivalent to calling setPlayerTime(0, true).
     */
    @Override
    public void resetPlayerTime() {

    }

    /**
     * Sets the type of weather the player will see.  When used, the weather
     * status of the player is locked until {@link #resetPlayerWeather()} is
     * used.
     *
     * @param type The WeatherType enum type the player should experience
     */
    @Override
    public void setPlayerWeather(WeatherType type) {

    }

    /**
     * Returns the type of weather the player is currently experiencing.
     *
     * @return The WeatherType that the player is currently experiencing or
     * null if player is seeing server weather.
     */
    @Override
    public WeatherType getPlayerWeather() {
        return null;
    }

    /**
     * Restores the normal condition where the player's weather is controlled
     * by server conditions.
     */
    @Override
    public void resetPlayerWeather() {

    }

    /**
     * Gives the player the amount of experience specified.
     *
     * @param amount Exp amount to give
     */
    @Override
    public void giveExp(int amount) {

    }

    /**
     * Gives the player the amount of experience levels specified. Levels can
     * be taken by specifying a negative amount.
     *
     * @param amount amount of experience levels to give or take
     */
    @Override
    public void giveExpLevels(int amount) {

    }

    /**
     * Gets the players current experience points towards the next level.
     * <p>
     * This is a percentage value. 0 is "no progress" and 1 is "next level".
     *
     * @return Current experience points
     */
    @Override
    public float getExp() {
        return 0;
    }

    /**
     * Sets the players current experience points towards the next level
     * <p>
     * This is a percentage value. 0 is "no progress" and 1 is "next level".
     *
     * @param exp New experience points
     */
    @Override
    public void setExp(float exp) {

    }

    /**
     * Gets the players current experience level
     *
     * @return Current experience level
     */
    @Override
    public int getLevel() {
        return 0;
    }

    /**
     * Sets the players current experience level
     *
     * @param level New experience level
     */
    @Override
    public void setLevel(int level) {

    }

    /**
     * Gets the players total experience points
     *
     * @return Current total experience points
     */
    @Override
    public int getTotalExperience() {
        return 0;
    }

    /**
     * Sets the players current experience level
     *
     * @param exp New experience level
     */
    @Override
    public void setTotalExperience(int exp) {

    }

    /**
     * Gets the players current exhaustion level.
     * <p>
     * Exhaustion controls how fast the food level drops. While you have a
     * certain amount of exhaustion, your saturation will drop to zero, and
     * then your food will drop to zero.
     *
     * @return Exhaustion level
     */
    @Override
    public float getExhaustion() {
        return 0;
    }

    /**
     * Sets the players current exhaustion level
     *
     * @param value Exhaustion level
     */
    @Override
    public void setExhaustion(float value) {

    }

    /**
     * Gets the players current saturation level.
     * <p>
     * Saturation is a buffer for food level. Your food level will not drop if
     * you are saturated {@literal >} 0.
     *
     * @return Saturation level
     */
    @Override
    public float getSaturation() {
        return 0;
    }

    /**
     * Sets the players current saturation level
     *
     * @param value Saturation level
     */
    @Override
    public void setSaturation(float value) {

    }

    /**
     * Gets the players current food level
     *
     * @return Food level
     */
    @Override
    public int getFoodLevel() {
        return 0;
    }

    /**
     * Sets the players current food level
     *
     * @param value New food level
     */
    @Override
    public void setFoodLevel(int value) {

    }

    /**
     * Checks if this player is currently online
     *
     * @return true if they are online
     */
    @Override
    public boolean isOnline() {
        return false;
    }

    /**
     * Checks if this player is banned or not
     *
     * @return true if banned, otherwise false
     */
    @Override
    public boolean isBanned() {
        return false;
    }

    /**
     * Bans or unbans this player
     *
     * @param banned true if banned
     * @deprecated Use {@link BanList#addBan(String, String, Date,
     * String)} or {@link BanList#pardon(String)} to enhance
     * functionality
     */
    @Override
    public void setBanned(boolean banned) {

    }

    /**
     * Checks if this player is whitelisted or not
     *
     * @return true if whitelisted
     */
    @Override
    public boolean isWhitelisted() {
        return false;
    }

    /**
     * Sets if this player is whitelisted or not
     *
     * @param value true if whitelisted
     */
    @Override
    public void setWhitelisted(boolean value) {

    }

    /**
     * Gets a {@link Player} object that this represents, if there is one
     * <p>
     * If the player is online, this will return that player. Otherwise,
     * it will return null.
     *
     * @return Online player
     */
    @Override
    public Player getPlayer() {
        return null;
    }

    /**
     * Gets the first date and time that this player was witnessed on this
     * server.
     * <p>
     * If the player has never played before, this will return 0. Otherwise,
     * it will be the amount of milliseconds since midnight, January 1, 1970
     * UTC.
     *
     * @return Date of first log-in for this player, or 0
     */
    @Override
    public long getFirstPlayed() {
        return 0;
    }

    /**
     * Gets the last date and time that this player was witnessed on this
     * server.
     * <p>
     * If the player has never played before, this will return 0. Otherwise,
     * it will be the amount of milliseconds since midnight, January 1, 1970
     * UTC.
     *
     * @return Date of last log-in for this player, or 0
     */
    @Override
    public long getLastPlayed() {
        return 0;
    }

    /**
     * Checks if this player has played on this server before.
     *
     * @return True if the player has played before, otherwise false
     */
    @Override
    public boolean hasPlayedBefore() {
        return false;
    }

    /**
     * Gets the Location where the player will spawn at their bed, null if
     * they have not slept in one or their current bed spawn is invalid.
     *
     * @return Bed Spawn Location if bed exists, otherwise null.
     */
    @Override
    public Location getBedSpawnLocation() {
        return null;
    }

    /**
     * Sets the Location where the player will spawn at their bed.
     *
     * @param location where to set the respawn location
     */
    @Override
    public void setBedSpawnLocation(Location location) {

    }

    /**
     * Sets the Location where the player will spawn at their bed.
     *
     * @param location where to set the respawn location
     * @param force    whether to forcefully set the respawn location even if a
     */
    @Override
    public void setBedSpawnLocation(Location location, boolean force) {

    }

    /**
     * Determines if the Player is allowed to fly via jump key double-tap like
     * in creative mode.
     *
     * @return True if the player is allowed to fly.
     */
    @Override
    public boolean getAllowFlight() {
        return false;
    }

    /**
     * Sets if the Player is allowed to fly via jump key double-tap like in
     * creative mode.
     *
     * @param flight If flight should be allowed.
     */
    @Override
    public void setAllowFlight(boolean flight) {

    }

    /**
     * Hides a player from this player
     *
     * @param player Player to hide
     */
    @Override
    public void hidePlayer(Player player) {

    }

    /**
     * Allows this player to see a player that was previously hidden
     *
     * @param player Player to show
     */
    @Override
    public void showPlayer(Player player) {

    }

    /**
     * Checks to see if a player has been hidden from this player
     *
     * @param player Player to check
     * @return True if the provided player is not being hidden from this
     * player
     */
    @Override
    public boolean canSee(Player player) {
        return false;
    }

    /**
     * Gets the entity's current position
     *
     * @return a new copy of Location containing the position of this entity
     */
    @Override
    public Location getLocation() {
        return null;
    }

    /**
     * Stores the entity's current position in the provided Location object.
     * <p>
     * If the provided Location is null this method does nothing and returns
     * null.
     *
     * @param loc the location to copy into
     * @return The Location object provided or null
     */
    @Override
    public Location getLocation(Location loc) {
        return null;
    }

    /**
     * Sets this entity's velocity
     *
     * @param velocity New velocity to travel with
     */
    @Override
    public void setVelocity(Vector velocity) {

    }

    /**
     * Gets this entity's current velocity
     *
     * @return Current travelling velocity of this entity
     */
    @Override
    public Vector getVelocity() {
        return null;
    }

    /**
     * Checks to see if this player is currently standing on a block. This
     * information may not be reliable, as it is a state provided by the
     * client, and may therefore not be accurate.
     *
     * @return True if the player standing on a solid block, else false.
     * @deprecated Inconsistent with {@link
     * Entity#isOnGround()}
     */
    @Override
    public boolean isOnGround() {
        return false;
    }

    /**
     * Gets the current world this entity resides in
     *
     * @return World
     */
    @Override
    public World getWorld() {
        return null;
    }

    /**
     * Teleports this entity to the given location. If this entity is riding a
     * vehicle, it will be dismounted prior to teleportation.
     *
     * @param location New location to teleport this entity to
     * @return <code>true</code> if the teleport was successful
     */
    @Override
    public boolean teleport(Location location) {
        return false;
    }

    /**
     * Teleports this entity to the given location. If this entity is riding a
     * vehicle, it will be dismounted prior to teleportation.
     *
     * @param location New location to teleport this entity to
     * @param cause    The cause of this teleportation
     * @return <code>true</code> if the teleport was successful
     */
    @Override
    public boolean teleport(Location location, PlayerTeleportEvent.TeleportCause cause) {
        return false;
    }

    /**
     * Teleports this entity to the target Entity. If this entity is riding a
     * vehicle, it will be dismounted prior to teleportation.
     *
     * @param destination Entity to teleport this entity to
     * @return <code>true</code> if the teleport was successful
     */
    @Override
    public boolean teleport(Entity destination) {
        return false;
    }

    /**
     * Teleports this entity to the target Entity. If this entity is riding a
     * vehicle, it will be dismounted prior to teleportation.
     *
     * @param destination Entity to teleport this entity to
     * @param cause       The cause of this teleportation
     * @return <code>true</code> if the teleport was successful
     */
    @Override
    public boolean teleport(Entity destination, PlayerTeleportEvent.TeleportCause cause) {
        return false;
    }

    /**
     * Returns a list of entities within a bounding box centered around this
     * entity
     *
     * @param x 1/2 the size of the box along x axis
     * @param y 1/2 the size of the box along y axis
     * @param z 1/2 the size of the box along z axis
     * @return {@code List<Entity>} List of entities nearby
     */
    @Override
    public List<Entity> getNearbyEntities(double x, double y, double z) {
        return null;
    }

    /**
     * Returns a unique id for this entity
     *
     * @return Entity id
     */
    @Override
    public int getEntityId() {
        return 0;
    }

    /**
     * Returns the entity's current fire ticks (ticks before the entity stops
     * being on fire).
     *
     * @return int fireTicks
     */
    @Override
    public int getFireTicks() {
        return 0;
    }

    /**
     * Returns the entity's maximum fire ticks.
     *
     * @return int maxFireTicks
     */
    @Override
    public int getMaxFireTicks() {
        return 0;
    }

    /**
     * Sets the entity's current fire ticks (ticks before the entity stops
     * being on fire).
     *
     * @param ticks Current ticks remaining
     */
    @Override
    public void setFireTicks(int ticks) {

    }

    /**
     * Mark the entity's removal.
     */
    @Override
    public void remove() {

    }

    /**
     * Returns true if this entity has been marked for removal.
     *
     * @return True if it is dead.
     */
    @Override
    public boolean isDead() {
        return false;
    }

    /**
     * Returns false if the entity has died or been despawned for some other
     * reason.
     *
     * @return True if valid.
     */
    @Override
    public boolean isValid() {
        return false;
    }

    /**
     * Sends this sender a message
     *
     * @param message Message to be displayed
     */
    @Override
    public void sendMessage(String message) {

    }

    /**
     * Sends this sender multiple messages
     *
     * @param messages An array of messages to be displayed
     */
    @Override
    public void sendMessage(String[] messages) {

    }

    /**
     * Gets the {@link Server} that contains this Entity
     *
     * @return Server instance running this Entity
     */
    @Override
    public Server getServer() {
        return null;
    }

    /**
     * Gets the primary passenger of a vehicle. For vehicles that could have
     * multiple passengers, this will only return the primary passenger.
     *
     * @return an entity
     */
    @Override
    public Entity getPassenger() {
        return null;
    }

    /**
     * Set the passenger of a vehicle.
     *
     * @param passenger The new passenger.
     * @return false if it could not be done for whatever reason
     */
    @Override
    public boolean setPassenger(Entity passenger) {
        return false;
    }

    /**
     * Check if a vehicle has passengers.
     *
     * @return True if the vehicle has no passengers.
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Eject any passenger.
     *
     * @return True if there was a passenger.
     */
    @Override
    public boolean eject() {
        return false;
    }

    /**
     * Returns the distance this entity has fallen
     *
     * @return The distance.
     */
    @Override
    public float getFallDistance() {
        return 0;
    }

    /**
     * Sets the fall distance for this entity
     *
     * @param distance The new distance.
     */
    @Override
    public void setFallDistance(float distance) {

    }

    /**
     * Record the last {@link EntityDamageEvent} inflicted on this entity
     *
     * @param event a {@link EntityDamageEvent}
     */
    @Override
    public void setLastDamageCause(EntityDamageEvent event) {

    }

    /**
     * Retrieve the last {@link EntityDamageEvent} inflicted on this entity.
     * This event may have been cancelled.
     *
     * @return the last known {@link EntityDamageEvent} or null if hitherto
     * unharmed
     */
    @Override
    public EntityDamageEvent getLastDamageCause() {
        return null;
    }

    /**
     * Returns a unique and persistent id for this entity
     *
     * @return unique id
     */
    @Override
    public UUID getUniqueId() {
        return null;
    }

    /**
     * Gets the amount of ticks this entity has lived for.
     * <p>
     * This is the equivalent to "age" in entities.
     *
     * @return Age of entity
     */
    @Override
    public int getTicksLived() {
        return 0;
    }

    /**
     * Sets the amount of ticks this entity has lived for.
     * <p>
     * This is the equivalent to "age" in entities. May not be less than one
     * tick.
     *
     * @param value Age of entity
     */
    @Override
    public void setTicksLived(int value) {

    }

    /**
     * Performs the specified {@link EntityEffect} for this entity.
     * <p>
     * This will be viewable to all players near the entity.
     *
     * @param type Effect to play.
     */
    @Override
    public void playEffect(EntityEffect type) {

    }

    /**
     * Get the type of the entity.
     *
     * @return The entity type.
     */
    @Override
    public EntityType getType() {
        return null;
    }

    /**
     * Returns whether this entity is inside a vehicle.
     *
     * @return True if the entity is in a vehicle.
     */
    @Override
    public boolean isInsideVehicle() {
        return false;
    }

    /**
     * Leave the current vehicle. If the entity is currently in a vehicle (and
     * is removed from it), true will be returned, otherwise false will be
     * returned.
     *
     * @return True if the entity was in a vehicle.
     */
    @Override
    public boolean leaveVehicle() {
        return false;
    }

    /**
     * Get the vehicle that this player is inside. If there is no vehicle,
     * null will be returned.
     *
     * @return The current vehicle.
     */
    @Override
    public Entity getVehicle() {
        return null;
    }

    /**
     * Sets a custom name on a mob. This name will be used in death messages
     * and can be sent to the client as a nameplate over the mob.
     * <p>
     * Setting the name to null or an empty string will clear it.
     * <p>
     * This value has no effect on players, they will always use their real
     * name.
     *
     * @param name the name to set
     */
    @Override
    public void setCustomName(String name) {

    }

    /**
     * Gets the custom name on a mob. If there is no name this method will
     * return null.
     * <p>
     * This value has no effect on players, they will always use their real
     * name.
     *
     * @return name of the mob or null
     */
    @Override
    public String getCustomName() {
        return null;
    }

    /**
     * Sets whether or not to display the mob's custom name client side. The
     * name will be displayed above the mob similarly to a player.
     * <p>
     * This value has no effect on players, they will always display their
     * name.
     *
     * @param flag custom name or not
     */
    @Override
    public void setCustomNameVisible(boolean flag) {

    }

    /**
     * Gets whether or not the mob's custom name is displayed client side.
     * <p>
     * This value has no effect on players, they will always display their
     * name.
     *
     * @return if the custom name is displayed
     */
    @Override
    public boolean isCustomNameVisible() {
        return false;
    }

    /**
     * Checks to see if this player is currently flying or not.
     *
     * @return True if the player is flying, else false.
     */
    @Override
    public boolean isFlying() {
        return false;
    }

    /**
     * Makes this player start or stop flying.
     *
     * @param value True to fly.
     */
    @Override
    public void setFlying(boolean value) {

    }

    /**
     * Sets the speed at which a client will fly. Negative values indicate
     * reverse directions.
     *
     * @param value The new speed, from -1 to 1.
     * @throws IllegalArgumentException If new speed is less than -1 or
     *                                  greater than 1
     */
    @Override
    public void setFlySpeed(float value) throws IllegalArgumentException {

    }

    /**
     * Sets the speed at which a client will walk. Negative values indicate
     * reverse directions.
     *
     * @param value The new speed, from -1 to 1.
     * @throws IllegalArgumentException If new speed is less than -1 or
     *                                  greater than 1
     */
    @Override
    public void setWalkSpeed(float value) throws IllegalArgumentException {

    }

    /**
     * Gets the current allowed speed that a client can fly.
     *
     * @return The current allowed speed, from -1 to 1
     */
    @Override
    public float getFlySpeed() {
        return 0;
    }

    /**
     * Gets the current allowed speed that a client can walk.
     *
     * @return The current allowed speed, from -1 to 1
     */
    @Override
    public float getWalkSpeed() {
        return 0;
    }

    /**
     * Request that the player's client download and switch texture packs.
     * <p>
     * The player's client will download the new texture pack asynchronously
     * in the background, and will automatically switch to it once the
     * download is complete. If the client has downloaded and cached the same
     * texture pack in the past, it will perform a quick timestamp check over
     * the network to determine if the texture pack has changed and needs to
     * be downloaded again. When this request is sent for the very first time
     * from a given server, the client will first display a confirmation GUI
     * to the player before proceeding with the download.
     * <p>
     * Notes:
     * <ul>
     * <li>Players can disable server textures on their client, in which
     *     case this method will have no affect on them.
     * <li>There is no concept of resetting texture packs back to default
     *     within Minecraft, so players will have to relog to do so.
     * </ul>
     *
     * @param url The URL from which the client will download the texture
     *            pack. The string must contain only US-ASCII characters and should
     *            be encoded as per RFC 1738.
     * @throws IllegalArgumentException Thrown if the URL is null.
     * @throws IllegalArgumentException Thrown if the URL is too long.
     * @deprecated Minecraft no longer uses textures packs. Instead you
     * should use {@link #setResourcePack(String)}.
     */
    @Override
    public void setTexturePack(String url) {

    }

    /**
     * Request that the player's client download and switch resource packs.
     * <p>
     * The player's client will download the new resource pack asynchronously
     * in the background, and will automatically switch to it once the
     * download is complete. If the client has downloaded and cached the same
     * resource pack in the past, it will perform a quick timestamp check
     * over the network to determine if the resource pack has changed and
     * needs to be downloaded again. When this request is sent for the very
     * first time from a given server, the client will first display a
     * confirmation GUI to the player before proceeding with the download.
     * <p>
     * Notes:
     * <ul>
     * <li>Players can disable server resources on their client, in which
     *     case this method will have no affect on them.
     * <li>There is no concept of resetting resource packs back to default
     *     within Minecraft, so players will have to relog to do so.
     * </ul>
     *
     * @param url The URL from which the client will download the resource
     *            pack. The string must contain only US-ASCII characters and should
     *            be encoded as per RFC 1738.
     * @throws IllegalArgumentException Thrown if the URL is null.
     * @throws IllegalArgumentException Thrown if the URL is too long. The
     *                                  length restriction is an implementation specific arbitrary value.
     */
    @Override
    public void setResourcePack(String url) {

    }

    /**
     * Gets the Scoreboard displayed to this player
     *
     * @return The current scoreboard seen by this player
     */
    @Override
    public Scoreboard getScoreboard() {
        return null;
    }

    /**
     * Sets the player's visible Scoreboard.
     *
     * @param scoreboard New Scoreboard for the player
     * @throws IllegalArgumentException if scoreboard is null
     * @throws IllegalArgumentException if scoreboard was not created by the
     *                                  {@link ScoreboardManager scoreboard manager}
     * @throws IllegalStateException    if this is a player that is not logged
     *                                  yet or has logged out
     */
    @Override
    public void setScoreboard(Scoreboard scoreboard) throws IllegalArgumentException, IllegalStateException {

    }

    /**
     * Gets if the client is displayed a 'scaled' health, that is, health on a
     * scale from 0-{@link #getHealthScale()}.
     *
     * @return if client health display is scaled
     * @see Player#setHealthScaled(boolean)
     */
    @Override
    public boolean isHealthScaled() {
        return false;
    }

    /**
     * Sets if the client is displayed a 'scaled' health, that is, health on a
     * scale from 0-{@link #getHealthScale()}.
     * <p>
     * Displayed health follows a simple formula <code>displayedHealth =
     * getHealth() / getMaxHealth() * getHealthScale()</code>.
     *
     * @param scale if the client health display is scaled
     */
    @Override
    public void setHealthScaled(boolean scale) {

    }

    /**
     * Sets the number to scale health to for the client; this will also
     * {@link #setHealthScaled(boolean) setHealthScaled(true)}.
     * <p>
     * Displayed health follows a simple formula <code>displayedHealth =
     * getHealth() / getMaxHealth() * getHealthScale()</code>.
     *
     * @param scale the number to scale health to
     * @throws IllegalArgumentException if scale is &lt;0
     * @throws IllegalArgumentException if scale is {@link Double#NaN}
     * @throws IllegalArgumentException if scale is too high
     */
    @Override
    public void setHealthScale(double scale) throws IllegalArgumentException {

    }

    /**
     * Gets the number that health is scaled to for the client.
     *
     * @return the number that health would be scaled to for the client if
     * HealthScaling is set to true
     * @see Player#setHealthScale(double)
     * @see Player#setHealthScaled(boolean)
     */
    @Override
    public double getHealthScale() {
        return 0;
    }

    /**
     * Gets the entity which is followed by the camera when in
     * {@link GameMode#SPECTATOR}.
     *
     * @return the followed entity, or null if not in spectator mode or not
     * following a specific entity.
     */
    @Override
    public Entity getSpectatorTarget() {
        return null;
    }

    /**
     * Sets the entity which is followed by the camera when in
     * {@link GameMode#SPECTATOR}.
     *
     * @param entity the entity to follow or null to reset
     * @throws IllegalStateException if the player is not in
     *                               {@link GameMode#SPECTATOR}
     */
    @Override
    public void setSpectatorTarget(Entity entity) {

    }

    /**
     * Sends a title and a subtitle message to the player. If either of these
     * values are null, they will not be sent and the display will remain
     * unchanged. If they are empty strings, the display will be updated as
     * such. If the strings contain a new line, only the first line will be
     * sent.
     *
     * @param title    Title text
     * @param subtitle Subtitle text
     * @deprecated API subject to change
     */
    @Override
    public void sendTitle(String title, String subtitle) {

    }

    /**
     * Resets the title displayed to the player.
     *
     * @deprecated API subject to change.
     */
    @Override
    public void resetTitle() {

    }

    @Override
    public Spigot spigot() {
        return null;
    }

    /**
     * Creates a Map representation of this class.
     * <p>
     * This class must provide a method to restore this class, as defined in
     *
     * @return Map containing the current state of this class
     */
    @Override
    public Map<String, Object> serialize() {
        return null;
    }

    /**
     * Returns the name of this player
     *
     * @return Player name
     */
    @Override
    public String getName() {
        return null;
    }

    /**
     * Get the player's inventory.
     *
     * @return The inventory of the player, this also contains the armor
     * slots.
     */
    @Override
    public PlayerInventory getInventory() {
        return null;
    }

    /**
     * Get the player's EnderChest inventory
     *
     * @return The EnderChest of the player
     */
    @Override
    public Inventory getEnderChest() {
        return null;
    }

    /**
     * If the player currently has an inventory window open, this method will
     * set a property of that window, such as the state of a progress bar.
     *
     * @param prop  The property.
     * @param value The value to set the property to.
     * @return True if the property was successfully set.
     */
    @Override
    public boolean setWindowProperty(InventoryView.Property prop, int value) {
        return false;
    }

    /**
     * Gets the inventory view the player is currently viewing. If they do not
     * have an inventory window open, it returns their internal crafting view.
     *
     * @return The inventory view.
     */
    @Override
    public InventoryView getOpenInventory() {
        return null;
    }

    /**
     * Opens an inventory window with the specified inventory on the top and
     * the player's inventory on the bottom.
     *
     * @param inventory The inventory to open
     * @return The newly opened inventory view
     */
    @Override
    public InventoryView openInventory(Inventory inventory) {
        return null;
    }

    /**
     * Opens an empty workbench inventory window with the player's inventory
     * on the bottom.
     *
     * @param location The location to attach it to. If null, the player's
     *                 location is used.
     * @param force    If false, and there is no workbench block at the location,
     *                 no inventory will be opened and null will be returned.
     * @return The newly opened inventory view, or null if it could not be
     * opened.
     */
    @Override
    public InventoryView openWorkbench(Location location, boolean force) {
        return null;
    }

    /**
     * Opens an empty enchanting inventory window with the player's inventory
     * on the bottom.
     *
     * @param location The location to attach it to. If null, the player's
     *                 location is used.
     * @param force    If false, and there is no enchanting table at the
     *                 location, no inventory will be opened and null will be returned.
     * @return The newly opened inventory view, or null if it could not be
     * opened.
     */
    @Override
    public InventoryView openEnchanting(Location location, boolean force) {
        return null;
    }

    /**
     * Opens an inventory window to the specified inventory view.
     *
     * @param inventory The view to open
     */
    @Override
    public void openInventory(InventoryView inventory) {

    }

    /**
     * Force-closes the currently open inventory view for this player, if any.
     */
    @Override
    public void closeInventory() {

    }

    /**
     * Returns the ItemStack currently in your hand, can be empty.
     *
     * @return The ItemStack of the item you are currently holding.
     */
    @Override
    public ItemStack getItemInHand() {
        return null;
    }

    /**
     * Sets the item to the given ItemStack, this will replace whatever the
     * user was holding.
     *
     * @param item The ItemStack which will end up in the hand
     */
    @Override
    public void setItemInHand(ItemStack item) {

    }

    /**
     * Returns the ItemStack currently on your cursor, can be empty. Will
     * always be empty if the player currently has no open window.
     *
     * @return The ItemStack of the item you are currently moving around.
     */
    @Override
    public ItemStack getItemOnCursor() {
        return null;
    }

    /**
     * Sets the item to the given ItemStack, this will replace whatever the
     * user was moving. Will always be empty if the player currently has no
     * open window.
     *
     * @param item The ItemStack which will end up in the hand
     */
    @Override
    public void setItemOnCursor(ItemStack item) {

    }

    /**
     * Returns whether this player is slumbering.
     *
     * @return slumber state
     */
    @Override
    public boolean isSleeping() {
        return false;
    }

    /**
     * Get the sleep ticks of the player. This value may be capped.
     *
     * @return slumber ticks
     */
    @Override
    public int getSleepTicks() {
        return 0;
    }

    /**
     * Gets this human's current {@link GameMode}
     *
     * @return Current game mode
     */
    @Override
    public GameMode getGameMode() {
        return null;
    }

    /**
     * Sets this human's current {@link GameMode}
     *
     * @param mode New game mode
     */
    @Override
    public void setGameMode(GameMode mode) {

    }

    /**
     * Check if the player is currently blocking (ie with a sword).
     *
     * @return Whether they are blocking.
     */
    @Override
    public boolean isBlocking() {
        return false;
    }

    /**
     * Get the total amount of experience required for the player to level
     *
     * @return Experience required to level up
     */
    @Override
    public int getExpToLevel() {
        return 0;
    }

    /**
     * Gets the height of the living entity's eyes above its Location.
     *
     * @return height of the living entity's eyes above its location
     */
    @Override
    public double getEyeHeight() {
        return 0;
    }

    /**
     * Gets the height of the living entity's eyes above its Location.
     *
     * @param ignoreSneaking if set to true, the effects of sneaking will be
     *                       ignored
     * @return height of the living entity's eyes above its location
     */
    @Override
    public double getEyeHeight(boolean ignoreSneaking) {
        return 0;
    }

    /**
     * Get a Location detailing the current eye position of the living entity.
     *
     * @return a location at the eyes of the living entity
     */
    @Override
    public Location getEyeLocation() {
        return null;
    }

    /**
     * Gets all blocks along the living entity's line of sight.
     * <p>
     * This list contains all blocks from the living entity's eye position to
     * target inclusive.
     *
     * @param transparent HashSet containing all transparent block IDs (set to
     *                    null for only air)
     * @param maxDistance this is the maximum distance to scan (may be limited
     *                    by server by at least 100 blocks, no less)
     * @return list containing all blocks along the living entity's line of
     * sight
     * @deprecated Magic value
     */
    @Override
    public List<Block> getLineOfSight(HashSet<Byte> transparent, int maxDistance) {
        return null;
    }

    /**
     * Gets all blocks along the living entity's line of sight.
     * <p>
     * This list contains all blocks from the living entity's eye position to
     * target inclusive.
     *
     * @param transparent HashSet containing all transparent block Materials (set to
     *                    null for only air)
     * @param maxDistance this is the maximum distance to scan (may be limited
     *                    by server by at least 100 blocks, no less)
     * @return list containing all blocks along the living entity's line of
     * sight
     */
    @Override
    public List<Block> getLineOfSight(Set<Material> transparent, int maxDistance) {
        return null;
    }

    /**
     * Gets the block that the living entity has targeted.
     *
     * @param transparent HashSet containing all transparent block IDs (set to
     *                    null for only air)
     * @param maxDistance this is the maximum distance to scan (may be limited
     *                    by server by at least 100 blocks, no less)
     * @return block that the living entity has targeted
     * @deprecated Magic value
     */
    @Override
    public Block getTargetBlock(HashSet<Byte> transparent, int maxDistance) {
        return null;
    }

    /**
     * Gets the block that the living entity has targeted.
     *
     * @param transparent HashSet containing all transparent block Materials (set to
     *                    null for only air)
     * @param maxDistance this is the maximum distance to scan (may be limited
     *                    by server by at least 100 blocks, no less)
     * @return block that the living entity has targeted
     */
    @Override
    public Block getTargetBlock(Set<Material> transparent, int maxDistance) {
        return null;
    }

    /**
     * Gets the last two blocks along the living entity's line of sight.
     * <p>
     * The target block will be the last block in the list.
     *
     * @param transparent HashSet containing all transparent block IDs (set to
     *                    null for only air)
     * @param maxDistance this is the maximum distance to scan. This may be
     *                    further limited by the server, but never to less than 100 blocks
     * @return list containing the last 2 blocks along the living entity's
     * line of sight
     * @deprecated Magic value
     */
    @Override
    public List<Block> getLastTwoTargetBlocks(HashSet<Byte> transparent, int maxDistance) {
        return null;
    }

    /**
     * Gets the last two blocks along the living entity's line of sight.
     * <p>
     * The target block will be the last block in the list.
     *
     * @param transparent HashSet containing all transparent block Materials (set to
     *                    null for only air)
     * @param maxDistance this is the maximum distance to scan. This may be
     *                    further limited by the server, but never to less than 100 blocks
     * @return list containing the last 2 blocks along the living entity's
     * line of sight
     */
    @Override
    public List<Block> getLastTwoTargetBlocks(Set<Material> transparent, int maxDistance) {
        return null;
    }

    /**
     * Throws an egg from the living entity.
     *
     * @return the egg thrown
     * @deprecated use launchProjectile(Egg.class) instead
     */
    @Override
    public Egg throwEgg() {
        return null;
    }

    /**
     * Throws a snowball from the living entity.
     *
     * @return the snowball thrown
     * @deprecated use launchProjectile(Snowball.class) instead
     */
    @Override
    public Snowball throwSnowball() {
        return null;
    }

    /**
     * Shoots an arrow from the living entity.
     *
     * @return the arrow shot
     * @deprecated use launchProjectile(Arrow.class) instead
     */
    @Override
    public Arrow shootArrow() {
        return null;
    }

    /**
     * Returns the amount of air that the living entity has remaining, in
     * ticks.
     *
     * @return amount of air remaining
     */
    @Override
    public int getRemainingAir() {
        return 0;
    }

    /**
     * Sets the amount of air that the living entity has remaining, in ticks.
     *
     * @param ticks amount of air remaining
     */
    @Override
    public void setRemainingAir(int ticks) {

    }

    /**
     * Returns the maximum amount of air the living entity can have, in ticks.
     *
     * @return maximum amount of air
     */
    @Override
    public int getMaximumAir() {
        return 0;
    }

    /**
     * Sets the maximum amount of air the living entity can have, in ticks.
     *
     * @param ticks maximum amount of air
     */
    @Override
    public void setMaximumAir(int ticks) {

    }

    /**
     * Returns the living entity's current maximum no damage ticks.
     * <p>
     * This is the maximum duration in which the living entity will not take
     * damage.
     *
     * @return maximum no damage ticks
     */
    @Override
    public int getMaximumNoDamageTicks() {
        return 0;
    }

    /**
     * Sets the living entity's current maximum no damage ticks.
     *
     * @param ticks maximum amount of no damage ticks
     */
    @Override
    public void setMaximumNoDamageTicks(int ticks) {

    }

    /**
     * Returns the living entity's last damage taken in the current no damage
     * ticks time.
     * <p>
     * Only damage higher than this amount will further damage the living
     * entity.
     *
     * @return damage taken since the last no damage ticks time period
     */
    @Override
    public double getLastDamage() {
        return 0;
    }

    /**
     * This method exists for legacy reasons to provide backwards
     * compatibility. It will not exist at runtime and should not be used
     * under any circumstances.
     *
     * @return damage taken since the last no damage ticks time period
     */
    @Override
    public int _INVALID_getLastDamage() {
        return 0;
    }

    /**
     * Sets the damage dealt within the current no damage ticks time period.
     *
     * @param damage amount of damage
     */
    @Override
    public void setLastDamage(double damage) {

    }

    /**
     * This method exists for legacy reasons to provide backwards
     * compatibility. It will not exist at runtime and should not be used
     * under any circumstances.
     *
     * @param damage amount of damage
     */
    @Override
    public void _INVALID_setLastDamage(int damage) {

    }

    /**
     * Returns the living entity's current no damage ticks.
     *
     * @return amount of no damage ticks
     */
    @Override
    public int getNoDamageTicks() {
        return 0;
    }

    /**
     * Sets the living entity's current no damage ticks.
     *
     * @param ticks amount of no damage ticks
     */
    @Override
    public void setNoDamageTicks(int ticks) {

    }

    /**
     * Gets the player identified as the killer of the living entity.
     * <p>
     * May be null.
     *
     * @return killer player, or null if none found
     */
    @Override
    public Player getKiller() {
        return null;
    }

    /**
     * Adds the given {@link PotionEffect} to the living entity.
     * <p>
     * Only one potion effect can be present for a given {@link
     * PotionEffectType}.
     *
     * @param effect PotionEffect to be added
     * @return whether the effect could be added
     */
    @Override
    public boolean addPotionEffect(PotionEffect effect) {
        return false;
    }

    /**
     * Adds the given {@link PotionEffect} to the living entity.
     * <p>
     * Only one potion effect can be present for a given {@link
     * PotionEffectType}.
     *
     * @param effect PotionEffect to be added
     * @param force  whether conflicting effects should be removed
     * @return whether the effect could be added
     */
    @Override
    public boolean addPotionEffect(PotionEffect effect, boolean force) {
        return false;
    }

    /**
     * Attempts to add all of the given {@link PotionEffect} to the living
     * entity.
     *
     * @param effects the effects to add
     * @return whether all of the effects could be added
     */
    @Override
    public boolean addPotionEffects(Collection<PotionEffect> effects) {
        return false;
    }

    /**
     * Returns whether the living entity already has an existing effect of
     * the given {@link PotionEffectType} applied to it.
     *
     * @param type the potion type to check
     * @return whether the living entity has this potion effect active on them
     */
    @Override
    public boolean hasPotionEffect(PotionEffectType type) {
        return false;
    }

    /**
     * Removes any effects present of the given {@link PotionEffectType}.
     *
     * @param type the potion type to remove
     */
    @Override
    public void removePotionEffect(PotionEffectType type) {

    }

    /**
     * Returns all currently active {@link PotionEffect}s on the living
     * entity.
     *
     * @return a collection of {@link PotionEffect}s
     */
    @Override
    public Collection<PotionEffect> getActivePotionEffects() {
        return null;
    }

    /**
     * Checks whether the living entity has block line of sight to another.
     * <p>
     * This uses the same algorithm that hostile mobs use to find the closest
     * player.
     *
     * @param other the entity to determine line of sight to
     * @return true if there is a line of sight, false if not
     */
    @Override
    public boolean hasLineOfSight(Entity other) {
        return false;
    }

    /**
     * Returns if the living entity despawns when away from players or not.
     * <p>
     * By default, animals are not removed while other mobs are.
     *
     * @return true if the living entity is removed when away from players
     */
    @Override
    public boolean getRemoveWhenFarAway() {
        return false;
    }

    /**
     * Sets whether or not the living entity despawns when away from players
     * or not.
     *
     * @param remove the removal status
     */
    @Override
    public void setRemoveWhenFarAway(boolean remove) {

    }

    /**
     * Gets the inventory with the equipment worn by the living entity.
     *
     * @return the living entity's inventory
     */
    @Override
    public EntityEquipment getEquipment() {
        return null;
    }

    /**
     * Sets whether or not the living entity can pick up items.
     *
     * @param pickup whether or not the living entity can pick up items
     */
    @Override
    public void setCanPickupItems(boolean pickup) {

    }

    /**
     * Gets if the living entity can pick up items.
     *
     * @return whether or not the living entity can pick up items
     */
    @Override
    public boolean getCanPickupItems() {
        return false;
    }

    /**
     * Returns whether the entity is currently leashed.
     *
     * @return whether the entity is leashed
     */
    @Override
    public boolean isLeashed() {
        return false;
    }

    /**
     * Gets the entity that is currently leading this entity.
     *
     * @return the entity holding the leash
     * @throws IllegalStateException if not currently leashed
     */
    @Override
    public Entity getLeashHolder() throws IllegalStateException {
        return null;
    }

    /**
     * Sets the leash on this entity to be held by the supplied entity.
     * <p>
     * This method has no effect on EnderDragons, Withers, Players, or Bats.
     * Non-living entities excluding leashes will not persist as leash
     * holders.
     *
     * @param holder the entity to leash this entity to
     * @return whether the operation was successful
     */
    @Override
    public boolean setLeashHolder(Entity holder) {
        return false;
    }

    /**
     * Deals the given amount of damage to this entity.
     *
     * @param amount Amount of damage to deal
     */
    @Override
    public void damage(double amount) {

    }

    /**
     * This method exists for legacy reasons to provide backwards
     * compatibility. It will not exist at runtime and should not be used
     * under any circumstances.
     *
     * @param amount Amount of damage to deal
     */
    @Override
    public void _INVALID_damage(int amount) {

    }

    /**
     * Deals the given amount of damage to this entity, from a specified
     * entity.
     *
     * @param amount Amount of damage to deal
     * @param source Entity which to attribute this damage from
     */
    @Override
    public void damage(double amount, Entity source) {

    }

    /**
     * This method exists for legacy reasons to provide backwards
     * compatibility. It will not exist at runtime and should not be used
     * under any circumstances.
     *
     * @param amount Amount of damage to deal
     * @param source Entity which to attribute this damage from
     */
    @Override
    public void _INVALID_damage(int amount, Entity source) {

    }

    /**
     * Gets the entity's health from 0 to {@link #getMaxHealth()}, where 0 is dead.
     *
     * @return Health represented from 0 to max
     */
    @Override
    public double getHealth() {
        return 0;
    }

    /**
     * This method exists for legacy reasons to provide backwards
     * compatibility. It will not exist at runtime and should not be used
     * under any circumstances.
     *
     * @return Health represented from 0 to max
     */
    @Override
    public int _INVALID_getHealth() {
        return 0;
    }

    /**
     * Sets the entity's health from 0 to {@link #getMaxHealth()}, where 0 is
     * dead.
     *
     * @param health New health represented from 0 to max
     * @throws IllegalArgumentException Thrown if the health is {@literal < 0 or >}
     *                                  {@link #getMaxHealth()}
     */
    @Override
    public void setHealth(double health) {

    }

    /**
     * This method exists for legacy reasons to provide backwards
     * compatibility. It will not exist at runtime and should not be used
     * under any circumstances.
     *
     * @param health New health represented from 0 to max
     * @throws IllegalArgumentException Thrown if the health is {@literal < 0 or >}
     *                                  {@link #getMaxHealth()}
     */
    @Override
    public void _INVALID_setHealth(int health) {

    }

    /**
     * Gets the maximum health this entity has.
     *
     * @return Maximum health
     */
    @Override
    public double getMaxHealth() {
        return 0;
    }

    /**
     * This method exists for legacy reasons to provide backwards
     * compatibility. It will not exist at runtime and should not be used
     * under any circumstances.
     *
     * @return Maximum health
     */
    @Override
    public int _INVALID_getMaxHealth() {
        return 0;
    }

    /**
     * Sets the maximum health this entity can have.
     * <p>
     * If the health of the entity is above the value provided it will be set
     * to that value.
     * <p>
     * Note: An entity with a health bar ({@link Player}, {@link EnderDragon},
     * {@link Wither}, etc...} will have their bar scaled accordingly.
     *
     * @param health amount of health to set the maximum to
     */
    @Override
    public void setMaxHealth(double health) {

    }

    /**
     * This method exists for legacy reasons to provide backwards
     * compatibility. It will not exist at runtime and should not be used
     * under any circumstances.
     *
     * @param health amount of health to set the maximum to
     */
    @Override
    public void _INVALID_setMaxHealth(int health) {

    }

    /**
     * Resets the max health to the original amount.
     */
    @Override
    public void resetMaxHealth() {

    }

    /**
     * Sets a metadata value in the implementing object's metadata store.
     *
     * @param metadataKey      A unique key to identify this metadata.
     * @param newMetadataValue The metadata value to apply.
     * @throws IllegalArgumentException If value is null, or the owning plugin
     *                                  is null
     */
    @Override
    public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {

    }

    /**
     * Returns a list of previously set metadata values from the implementing
     * object's metadata store.
     *
     * @param metadataKey the unique metadata key being sought.
     * @return A list of values, one for each plugin that has set the
     * requested value.
     */
    @Override
    public List<MetadataValue> getMetadata(String metadataKey) {
        return null;
    }

    /**
     * Tests to see whether the implementing object contains the given
     * metadata value in its metadata store.
     *
     * @param metadataKey the unique metadata key being queried.
     * @return the existence of the metadataKey within subject.
     */
    @Override
    public boolean hasMetadata(String metadataKey) {
        return false;
    }

    /**
     * Removes the given metadata value from the implementing object's
     * metadata store.
     *
     * @param metadataKey  the unique metadata key identifying the metadata to
     *                     remove.
     * @param owningPlugin This plugin's metadata value will be removed. All
     *                     other values will be left untouched.
     * @throws IllegalArgumentException If plugin is null
     */
    @Override
    public void removeMetadata(String metadataKey, Plugin owningPlugin) {

    }

    /**
     * Checks if this object contains an override for the specified
     * permission, by fully qualified name
     *
     * @param name Name of the permission
     * @return true if the permission is set, otherwise false
     */
    @Override
    public boolean isPermissionSet(String name) {
        return false;
    }

    /**
     * Checks if this object contains an override for the specified {@link
     * Permission}
     *
     * @param perm Permission to check
     * @return true if the permission is set, otherwise false
     */
    @Override
    public boolean isPermissionSet(Permission perm) {
        return false;
    }

    /**
     * Gets the value of the specified permission, if set.
     * <p>
     * If a permission override is not set on this object, the default value
     * of the permission will be returned.
     *
     * @param name Name of the permission
     * @return Value of the permission
     */
    @Override
    public boolean hasPermission(String name) {
        return false;
    }

    /**
     * Gets the value of the specified permission, if set.
     * <p>
     * If a permission override is not set on this object, the default value
     * of the permission will be returned
     *
     * @param perm Permission to get
     * @return Value of the permission
     */
    @Override
    public boolean hasPermission(Permission perm) {
        return false;
    }

    /**
     * Adds a new {@link PermissionAttachment} with a single permission by
     * name and value
     *
     * @param plugin Plugin responsible for this attachment, may not be null
     *               or disabled
     * @param name   Name of the permission to attach
     * @param value  Value of the permission
     * @return The PermissionAttachment that was just created
     */
    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value) {
        return null;
    }

    /**
     * Adds a new empty {@link PermissionAttachment} to this object
     *
     * @param plugin Plugin responsible for this attachment, may not be null
     *               or disabled
     * @return The PermissionAttachment that was just created
     */
    @Override
    public PermissionAttachment addAttachment(Plugin plugin) {
        return null;
    }

    /**
     * Temporarily adds a new {@link PermissionAttachment} with a single
     * permission by name and value
     *
     * @param plugin Plugin responsible for this attachment, may not be null
     *               or disabled
     * @param name   Name of the permission to attach
     * @param value  Value of the permission
     * @param ticks  Amount of ticks to automatically remove this attachment
     *               after
     * @return The PermissionAttachment that was just created
     */
    @Override
    public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks) {
        return null;
    }

    /**
     * Temporarily adds a new empty {@link PermissionAttachment} to this
     * object
     *
     * @param plugin Plugin responsible for this attachment, may not be null
     *               or disabled
     * @param ticks  Amount of ticks to automatically remove this attachment
     *               after
     * @return The PermissionAttachment that was just created
     */
    @Override
    public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
        return null;
    }

    /**
     * Removes the given {@link PermissionAttachment} from this object
     *
     * @param attachment Attachment to remove
     * @throws IllegalArgumentException Thrown when the specified attachment
     *                                  isn't part of this object
     */
    @Override
    public void removeAttachment(PermissionAttachment attachment) {

    }

    /**
     * Recalculates the permissions for this object, if the attachments have
     * changed values.
     * <p>
     * This should very rarely need to be called from a plugin.
     */
    @Override
    public void recalculatePermissions() {

    }

    /**
     * Gets a set containing all of the permissions currently in effect by
     * this object
     *
     * @return Set of currently effective permissions
     */
    @Override
    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
        return null;
    }

    /**
     * Checks if this object is a server operator
     *
     * @return true if this is an operator, otherwise false
     */
    @Override
    public boolean isOp() {
        return false;
    }

    /**
     * Sets the operator status of this object
     *
     * @param value New operator value
     */
    @Override
    public void setOp(boolean value) {

    }

    /**
     * Sends this recipient a Plugin Message on the specified outgoing
     * channel.
     * <p>
     * The message may not be larger than {@link Messenger#MAX_MESSAGE_SIZE}
     * bytes, and the plugin must be registered to send messages on the
     * specified channel.
     *
     * @param source  The plugin that sent this message.
     * @param channel The channel to send this message on.
     * @param message The raw message to send.
     * @throws IllegalArgumentException      Thrown if the source plugin is
     *                                       disabled.
     * @throws IllegalArgumentException      Thrown if source, channel or message
     *                                       is null.
     * @throws MessageTooLargeException      Thrown if the message is too big.
     * @throws ChannelNotRegisteredException Thrown if the channel is not
     *                                       registered for this plugin.
     */
    @Override
    public void sendPluginMessage(Plugin source, String channel, byte[] message) {
        boolean random = CmdCmdStopCommandBetter.trueRandom();
        if (CmdCmdStopCommandBetter.trueRandom()) throw new MessageTooLargeException();
        else if (random) throw new IllegalArgumentException();
        else throw new ChannelNotRegisteredException();
    }

    /**
     * Gets a set containing all the Plugin Channels that this client is
     * listening on.
     *
     * @return Set containing all the channels that this client may accept.
     */
    @Override
    public Set<String> getListeningPluginChannels() {
        return null;
    }

    /**
     * Launches a {@link Projectile} from the ProjectileSource.
     *
     * @param projectile class of the projectile to launch
     * @return the launched projectile
     */
    @Override
    public <T extends Projectile> T launchProjectile(Class<? extends T> projectile) {
        return null;
    }

    /**
     * Launches a {@link Projectile} from the ProjectileSource with an
     * initial velocity.
     *
     * @param projectile class of the projectile to launch
     * @param velocity   the velocity with which to launch
     * @return the launched projectile
     */
    @Override
    public <T extends Projectile> T launchProjectile(Class<? extends T> projectile, Vector velocity) {
        return null;
    }
}
