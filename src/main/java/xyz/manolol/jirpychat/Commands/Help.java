package xyz.manolol.jirpychat.Commands;

import xyz.manolol.jirpychat.helpers.ConsoleColors;

public class Help {
    public static void help(){
        System.out.println(ConsoleColors.CYAN_BOLD + "Commands:\n" + ConsoleColors.CYAN + " -help\n -time");
        System.out.println(ConsoleColors.CYAN_BOLD + "Questions:\n" + ConsoleColors.CYAN + " -What time is it?\n");
    }
}