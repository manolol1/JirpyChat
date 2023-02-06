package xyz.manolol.jirpychat;

import java.util.ArrayList;
import java.util.Scanner;

import xyz.manolol.jirpychat.helpers.ConsoleColors;
import xyz.manolol.jirpychat.commands.Command;
import xyz.manolol.jirpychat.commands.Help;
import xyz.manolol.jirpychat.commands.Exit;
import xyz.manolol.jirpychat.commands.Clear;
import xyz.manolol.jirpychat.commands.GetTime;
import xyz.manolol.jirpychat.commands.AgeCalc;
import xyz.manolol.jirpychat.commands.Calculate;
import xyz.manolol.jirpychat.commands.CountDown;

public class JirpyChat {
    public static ArrayList<Command> commands;
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        commands = new ArrayList<Command>();
        
        commands.add(new Help("help"));
        commands.add(new Exit("exit"));
        commands.add(new Clear("clear"));
        commands.add(new GetTime("GetTime"));
        commands.add(new GetTime("What time is it?"));
        commands.add(new AgeCalc("AgeCalc"));
        commands.add(new Calculate("calculate"));
        commands.add(new Calculate("calc"));
        commands.add(new CountDown("countdown"));
        
        
        System.out.println(ConsoleColors.CYAN + ">Hello! I'm JirpyChat. Type \"help\" for a list of all questions and commands!" + ConsoleColors.RESET);
        
        while(true){
            try{
                System.out.println(ConsoleColors.CYAN_BOLD + ">Ask something!" + ConsoleColors.RESET);
                String c = s.nextLine();
                
                runCmd(c);
                
            } catch(Exception e){
                System.out.println(ConsoleColors.RED_BOLD + ">An error occured. Please check your input and try again!\nDetails:\n" + ConsoleColors.RED + e + ConsoleColors.RESET);
                s.nextLine();
            }
        }
    }
    
    public static void runCmd(String c){
        for(Command cmd : commands){
            if(cmd.getName().equalsIgnoreCase(c)){
                cmd.run();
                return;
            }
        }
        
        System.out.println(ConsoleColors.RED_BOLD + ">Sorry, I don't know that." + ConsoleColors.RED + " Type \"Help\" for a list of all questions and commands!" + ConsoleColors.RESET);
    }
}