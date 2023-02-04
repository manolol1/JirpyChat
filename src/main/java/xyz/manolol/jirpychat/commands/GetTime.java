package xyz.manolol.jirpychat.commands;

import java.util.Calendar;

import xyz.manolol.jirpychat.helpers.Padding;

public class GetTime extends Command{
    public String commandName;
    
    public GetTime(String commandName){
        this.commandName = commandName;
    }
    
    @Override
    public void run(){
        Calendar now = Calendar.getInstance();
        String hour = Integer.toString(now.get(Calendar.HOUR_OF_DAY));
        String minute = Integer.toString(now.get(Calendar.MINUTE));

        System.out.println(">The current time is " + Padding.padLeft(hour, 2) + ":" + Padding.padLeft(minute, 2));
    }
    
    @Override
    public String getName() {
        return commandName;
    }
}