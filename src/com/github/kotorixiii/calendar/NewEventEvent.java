package com.github.kotorixiii.calendar;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;

public class NewEventEvent extends Event implements Listener {
    private static final HandlerList handlers = new HandlerList();

    PEvent PEvent;
    boolean cancelled;


    public NewEventEvent(PEvent e){
        this.PEvent = e;
    }

    public com.github.kotorixiii.calendar.PEvent getPEvent() {
        return PEvent;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}
