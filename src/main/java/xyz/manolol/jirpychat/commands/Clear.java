package xyz.manolol.jirpychat.commands;

import xyz.manolol.jirpychat.helpers.ConsoleColors;

public class Clear extends Command{
    public String commandName;
    
    public Clear(String commandName){
        this.commandName = commandName;
    }
    
    @Override
    public void run(){
        System.out.println("Clearing the console...");
        // A very bad way to "clear" the console... But I don't know any better way.
        for(int i = 0; i < 100; i++){
            System.out.println("\n");
        }
    }
    
    @Override
    public String getName() {
        return commandName;
    }
}