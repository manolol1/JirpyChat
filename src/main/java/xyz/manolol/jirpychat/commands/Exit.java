package xyz.manolol.jirpychat.commands;

import xyz.manolol.jirpychat.helpers.ConsoleColors;

public class Exit extends Command{
    public String commandName;
    
    public Exit(String commandName){
        this.commandName = commandName;
    }
    
    @Override
    public void run(){
        System.out.println(ConsoleColors.GREEN_BOLD + "Exiting program...\n Bye!");
        System.exit(0);
    }
    
    @Override
    public String getName() {
        return commandName;
    }
}
