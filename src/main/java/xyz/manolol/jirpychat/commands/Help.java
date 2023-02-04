package xyz.manolol.jirpychat.commands;

import xyz.manolol.jirpychat.helpers.ConsoleColors;

public class Help extends Command{
    public String commandName;
    
    public Help(String commandName){
        this.commandName = commandName;
    }
    
    @Override
    public void run(){
        System.out.println(ConsoleColors.CYAN_BOLD + ">Commands:\n" + ConsoleColors.CYAN + " -help\n -getTime\n -ageCalc\n -exit");
        System.out.println(ConsoleColors.CYAN_BOLD + ">Questions:\n" + ConsoleColors.CYAN + " -What time is it?");
    }
    
    @Override
    public String getName() {
        return commandName;
    }
}