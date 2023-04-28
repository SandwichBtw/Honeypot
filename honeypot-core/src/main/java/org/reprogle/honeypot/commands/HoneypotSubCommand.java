package org.reprogle.honeypot.commands;

import org.bukkit.entity.Player;
import org.reprogle.honeypot.utils.HoneypotPermission;

import java.io.IOException;
import java.util.List;

public interface HoneypotSubCommand {

    /**
     * Get's the name of the command
     * 
     * @return The String name
     */
    String getName();

    /**
     * Performs the command
     * 
     * @param p    The Player running the command
     * @param args Any arguments to pass
     * @throws IOException Throws if any IO actions fail inside the perform command
     *                     (Such as DB calls)
     */
    void perform(Player p, String[] args) throws IOException;

    /**
     * Gets all subcommands of the main command if any (Such as with the create or
     * remove command)
     * 
     * @param p    The Player running the command
     * @param args Any arguments to pass
     * @return A list of all subcommands as strings
     */
    List<String> getSubcommands(Player p, String[] args);

    /**
     * Gets the required permissions to run the command. May be multiple
     * @return A list of all subcommands as strings
     */
    List<HoneypotPermission> getRequiredPermissions();

}
