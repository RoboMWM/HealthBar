package com.gmail.filoghost.healthbar.utils;

import org.bukkit.configuration.file.FileConfiguration;

public class MobBarsUtils {

    /* enforce non-instantiability with a private constructor */
    private MobBarsUtils() {
        throw new RuntimeException();
    }

    /**
     * Used to retrieve the array that contains the health bars from the configs
     */
    public static String[] getDefaultsBars(FileConfiguration config) {
        String[] barArray;

        int mobBarStyle = config.getInt("mob-bars.display-style");
        switch (mobBarStyle) {
            case 2:
                barArray = new String[]{
                    "§c|§7|||||||||||||||||||",
                    "§c|§7|||||||||||||||||||",
                    "§c||§7||||||||||||||||||",
                    "§c|||§7|||||||||||||||||",
                    "§c||||§7||||||||||||||||",
                    "§e|||||§7|||||||||||||||",
                    "§e||||||§7||||||||||||||",
                    "§e|||||||§7|||||||||||||",
                    "§e||||||||§7||||||||||||",
                    "§e|||||||||§7|||||||||||",
                    "§e||||||||||§7||||||||||",
                    "§a|||||||||||§7|||||||||",
                    "§a||||||||||||§7||||||||",
                    "§a|||||||||||||§7|||||||",
                    "§a||||||||||||||§7||||||",
                    "§a|||||||||||||||§7|||||",
                    "§a||||||||||||||||§7||||",
                    "§a|||||||||||||||||§7|||",
                    "§a||||||||||||||||||§7||",
                    "§a|||||||||||||||||||§7|",
                    "§a||||||||||||||||||||"};
                break;
            case 3:
                barArray = new String[]{
                    "§c❤§7❤❤❤❤❤❤❤❤❤",
                    "§c❤§7❤❤❤❤❤❤❤❤❤",
                    "§c❤§7❤❤❤❤❤❤❤❤❤",
                    "§c❤❤§7❤❤❤❤❤❤❤❤",
                    "§c❤❤§7❤❤❤❤❤❤❤❤",
                    "§e❤❤❤§7❤❤❤❤❤❤❤",
                    "§e❤❤❤§7❤❤❤❤❤❤❤",
                    "§e❤❤❤❤§7❤❤❤❤❤❤",
                    "§e❤❤❤❤§7❤❤❤❤❤❤",
                    "§e❤❤❤❤❤§7❤❤❤❤❤",
                    "§e❤❤❤❤❤§7❤❤❤❤❤",
                    "§a❤❤❤❤❤❤§7❤❤❤❤",
                    "§a❤❤❤❤❤❤§7❤❤❤❤",
                    "§a❤❤❤❤❤❤❤§7❤❤❤",
                    "§a❤❤❤❤❤❤❤§7❤❤❤",
                    "§a❤❤❤❤❤❤❤❤§7❤❤",
                    "§a❤❤❤❤❤❤❤❤§7❤❤",
                    "§a❤❤❤❤❤❤❤❤❤§7❤",
                    "§a❤❤❤❤❤❤❤❤❤§7❤",
                    "§a❤❤❤❤❤❤❤❤❤❤",
                    "§a❤❤❤❤❤❤❤❤❤❤"
                };
                break;
            case 4:
                barArray = new String[]{
                    "§a▌§8▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌",
                    "§a▌§8▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌",
                    "§a▌▌§8▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌",
                    "§a▌▌▌§8▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌",
                    "§a▌▌▌▌§8▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌",
                    "§a▌▌▌▌▌§8▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌",
                    "§a▌▌▌▌▌▌§8▌▌▌▌▌▌▌▌▌▌▌▌▌▌",
                    "§a▌▌▌▌▌▌▌§8▌▌▌▌▌▌▌▌▌▌▌▌▌",
                    "§a▌▌▌▌▌▌▌▌§8▌▌▌▌▌▌▌▌▌▌▌▌",
                    "§a▌▌▌▌▌▌▌▌▌§8▌▌▌▌▌▌▌▌▌▌▌",
                    "§a▌▌▌▌▌▌▌▌▌▌§8▌▌▌▌▌▌▌▌▌▌",
                    "§a▌▌▌▌▌▌▌▌▌▌▌§8▌▌▌▌▌▌▌▌▌",
                    "§a▌▌▌▌▌▌▌▌▌▌▌▌§8▌▌▌▌▌▌▌▌",
                    "§a▌▌▌▌▌▌▌▌▌▌▌▌▌§8▌▌▌▌▌▌▌",
                    "§a▌▌▌▌▌▌▌▌▌▌▌▌▌▌§8▌▌▌▌▌▌",
                    "§a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌§8▌▌▌▌▌",
                    "§a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌§8▌▌▌▌",
                    "§a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌§8▌▌▌",
                    "§a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌§8▌▌",
                    "§a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌§8▌",
                    "§a▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌▌"
                };
                break;
            case 5:
                barArray = new String[]{
                    "§c█§0█████████",
                    "§c█§0█████████",
                    "§c█§0█████████",
                    "§c██§0████████",
                    "§c██§0████████",
                    "§e███§0███████",
                    "§e███§0███████",
                    "§e████§0██████",
                    "§e████§0██████",
                    "§e█████§0█████",
                    "§e█████§0█████",
                    "§a██████§0████",
                    "§a██████§0████",
                    "§a███████§0███",
                    "§a███████§0███",
                    "§a████████§0██",
                    "§a████████§0██",
                    "§a█████████§0█",
                    "§a█████████§0█",
                    "§a██████████",
                    "§a██████████"
                };
                break;
            case 1:
            default:
                /* default (1 or anything else) */
                barArray = new String[]{
                    "§c▌                   ",
                    "§c▌                   ",
                    "§c█                  ",
                    "§c█▌                 ",
                    "§c██                ",
                    "§e██▌               ",
                    "§e███              ",
                    "§e███▌             ",
                    "§e████            ",
                    "§e████▌           ",
                    "§e█████          ",
                    "§a█████▌         ",
                    "§a██████        ",
                    "§a██████▌       ",
                    "§a███████      ",
                    "§a███████▌     ",
                    "§a████████    ",
                    "§a████████▌   ",
                    "§a█████████  ",
                    "§a█████████▌ ",
                    "§a██████████"
                };
                break;
        }
        return barArray;
    }

    /**
     * Load the bars from a custom file
     */
    public static String[] getCustomBars(FileConfiguration config) {
        String[] barArray = new String[21];
        barArray[0] = "";
        for (int i = 1; i < 21; i++) {
            barArray[i] = "";
            try {
                String cname = config.getString(i * 5 + "-percent-bar");
                if (cname == null) {
                    cname = "";
                }
                barArray[i] = Utils.replaceSymbols(cname);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return barArray;
    }

}
