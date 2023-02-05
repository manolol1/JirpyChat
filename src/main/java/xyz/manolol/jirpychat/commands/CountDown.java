package xyz.manolol.jirpychat.commands;

import java.util.Scanner;

import xyz.manolol.jirpychat.helpers.ConsoleColors;

public class CountDown extends Command{
    public String commandName;
    
    public CountDown(String commandName){
        this.commandName = commandName;
    }
    
    @Override
    public void run(){
        try{
            Scanner s = new Scanner(System.in);
            int secondsToWait;

            System.out.println(ConsoleColors.CYAN_BOLD + "How many minutes do you want to wait?" + ConsoleColors.CYAN + " (if you want to wait for less than 1 minute, just type 0)" + ConsoleColors.RESET);
            secondsToWait = Integer.parseInt(s.nextLine())*60;
            System.out.println(ConsoleColors.CYAN + "How many seconds do you want to wait?" + ConsoleColors.RESET);
            secondsToWait += Integer.parseInt(s.nextLine());
            
            if(secondsToWait < 1){
                System.out.println(ConsoleColors.RED_BOLD + "You can't count for less than 1 second. Try again!" + ConsoleColors.RESET);
                return;
            }

            System.out.println(ConsoleColors.CYAN_BOLD + "Counting down " + secondsToWait + " seconds..." + ConsoleColors.RESET);
            
            while(secondsToWait > 0){
                secondsToWait--;
                Thread.sleep(1000);
                System.out.println(ConsoleColors.CYAN + secondsToWait);
            }
            System.out.println(ConsoleColors.CYAN_BOLD + "Done \n" + ConsoleColors.RESET);
            
        } catch(Exception e){
            System.out.println(ConsoleColors.RED_BOLD + ">An error occured. Please check your input and try again!\nDetails:\n" + ConsoleColors.RED + e + ConsoleColors.RESET);
        }
        
    }
    
    @Override
    public String getName() {
        return commandName;
    }
}