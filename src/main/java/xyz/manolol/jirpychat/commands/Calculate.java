package xyz.manolol.jirpychat.commands;

import java.util.Scanner;

import xyz.manolol.jirpychat.helpers.ConsoleColors;

public class Calculate extends Command{
    public String commandName;
    
    public Calculate(String commandName){
        this.commandName = commandName;
    }
    
    @Override
    public void run(){
        Scanner s = new Scanner(System.in);
        int selection = 0;
        
        System.out.println(ConsoleColors.CYAN_BOLD + "Calculator started.");
        System.out.println("Please select an option!");
        System.out.println(ConsoleColors.CYAN + " 0 - Square\n 1 - Rectangle" + ConsoleColors.RESET);
        selection = s.nextInt();
        
        switch (selection){
            case 0:
                square();
                break;
            case 1:
                rectangle();
                break;
            default:
                System.out.println(ConsoleColors.RED_BOLD + "You can only select existing options." + ConsoleColors.RED + " Please try again!" + ConsoleColors.RESET);
                break;
        }
    }
    
    @Override
    public String getName() {
        return commandName;
    }
    
    
    // shapes
    
    private static void square(){
        Scanner s = new Scanner(System.in);
        int selection = 0;
        
        System.out.println(ConsoleColors.CYAN_BOLD +"Please select an option!");
        System.out.println(ConsoleColors.CYAN + " 0 - Calculate Area from side (A = a*a)\n 1 - Calculate diagonal from side (d = a*sqrt(2))\n 2 - Calculate perimeter from side (P = a*4)" + ConsoleColors.RESET);
        selection = s.nextInt();
        
        switch (selection){
            case 0:
                square0();
                break;
            case 1:
                square1();
                break;
            case 2:
                square2();
                break;
            default:
                System.out.println(ConsoleColors.RED_BOLD + "You can only select existing options." + ConsoleColors.RED + " Please try again!" + ConsoleColors.RESET);
                break;
        }
    }
    
    private static void rectangle(){
        Scanner s = new Scanner(System.in);
        int selection = 0;
        
        System.out.println(ConsoleColors.CYAN_BOLD + "Please select an option!");
        System.out.println(ConsoleColors.CYAN + "0 - Calculate Area from sides (A = a*b)\n 1 - Calculate diagonal from sides (d = sqrt(pow(a,2)+pow(b,2))\n 2 - Calculate perimeter from sides (P = 2*(a+b))" + ConsoleColors.RESET);
        selection = s.nextInt();
        
        switch (selection) {
            case 0:
                rectangle0();
                break;
            case 1:
                rectangle1();
                break;
            case 2:
                rectangle2();
                break;
            default:
                System.out.println(ConsoleColors.RED_BOLD + "You can only select existing options." + ConsoleColors.RED + " Please try again!" + ConsoleColors.RESET);
                break;
        }
    }
    
    
    // formulas
    
    private static void square0(){
        Scanner s = new Scanner(System.in);
        double a = 0;
        double A = 0;
        
        System.out.print(ConsoleColors.CYAN + "a:" + ConsoleColors.RESET);
        a = s.nextDouble();
        
        A = a*a;
        
        System.out.println(ConsoleColors.GREEN + "A = " + A + ConsoleColors.RESET);
    }
    
    private static void square1(){
        Scanner s = new Scanner(System.in);
        double a = 0;
        double d = 0;
        
        System.out.print(ConsoleColors.CYAN + "a:" + ConsoleColors.RESET);
        a = s.nextDouble();
        
        d = a*Math.sqrt(2);
        
        System.out.println(ConsoleColors.GREEN + "d = " + d + ConsoleColors.RESET);
    }
    
    private static void square2(){
        Scanner s = new Scanner(System.in);
        double a = 0;
        double P = 0;
        
        System.out.print(ConsoleColors.CYAN + "a:" + ConsoleColors.RESET);
        a = s.nextDouble();
        
        P = a * 4;
        
        System.out.println(ConsoleColors.GREEN + "P = " + P + ConsoleColors.RESET);
    }
    
    private static void rectangle0(){
        Scanner s = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double A = 0;
        
        System.out.print(ConsoleColors.CYAN + "a:" + ConsoleColors.RESET);
        a = s.nextDouble();
        System.out.print(ConsoleColors.CYAN + "b:" + ConsoleColors.RESET);
        b = s.nextDouble();
        
        A = a*b;
        
        System.out.println(ConsoleColors.GREEN + "A = " + A + ConsoleColors.RESET);
    }
    
    private static void rectangle1(){
        Scanner s = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double d = 0;
        
        System.out.print(ConsoleColors.CYAN + "a:" + ConsoleColors.RESET);
        a = s.nextDouble();
        System.out.print(ConsoleColors.CYAN + "b:" + ConsoleColors.RESET);
        b = s.nextDouble();
        
        d = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        
        System.out.println(ConsoleColors.GREEN + "d = " + d + ConsoleColors.RESET);
    }
    
    private static void rectangle2(){
        Scanner s = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double P = 0;
        
        System.out.print(ConsoleColors.CYAN + "a:" + ConsoleColors.RESET);
        a = s.nextDouble();
        System.out.print(ConsoleColors.CYAN + "b:" + ConsoleColors.RESET);
        b = s.nextDouble();
        
        P = 2 * (a+b);
        
        System.out.println(ConsoleColors.GREEN + "P = " + P + ConsoleColors.RESET);
    }
}