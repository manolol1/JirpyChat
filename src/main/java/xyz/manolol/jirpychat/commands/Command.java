package xyz.manolol.jirpychat.commands;

public abstract class Command {
    public abstract void run();
    
    public abstract String getName();
}