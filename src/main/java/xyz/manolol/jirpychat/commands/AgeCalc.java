package xyz.manolol.jirpychat.commands;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalc extends Command{
    @Override
    public void run(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter date of birth in YYYY-MM-DD format: ");
        String input = s.nextLine();

        LocalDate birthDate = LocalDate.parse(input);
        LocalDate now = LocalDate.now();

        Period period = Period.between(birthDate, now);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("You are " + years + " years, " + months + " months and " + days + " days old.");
    }
        @Override
    public String getName() {
        return "agecalc";
    }
}