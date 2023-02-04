package xyz.manolol.jirpychat;

import java.util.Scanner;

import xyz.manolol.jirpychat.helpers.ConsoleColors;
import xyz.manolol.jirpychat.helpers.Padding;

import xyz.manolol.jirpychat.Commands.Help;

public class JirpyChat {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println(ConsoleColors.CYAN + "Hello! I'm JirpyChat. Type \"help\" for a list of all questions and commands!" + ConsoleColors.RESET);
        
        while(true){
            try{
                System.out.println("Ask something!");
                String c = s.nextLine();
                
                if(c.equalsIgnoreCase("help")){
                    Help.help();
                }
                else if(c.equalsIgnoreCase("")){
                    
                }
            } catch(Exception e){
                System.out.println(ConsoleColors.RED_BOLD + "An error occured. Please check your input and try again!\nDetails:\n" + ConsoleColors.RED + e + ConsoleColors.RESET);
                s.nextLine();
            }
        }
    }
}