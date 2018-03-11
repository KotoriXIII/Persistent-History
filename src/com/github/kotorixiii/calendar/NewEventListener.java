package com.github.kotorixiii.calendar;

import com.xxmicloxx.NoteBlockAPI.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import static com.github.kotorixiii.PersistentHistory.calendarFiles;
import static com.github.kotorixiii.calendar.CalendarFiles.eventAlert;

public class NewEventListener implements Listener {

    @EventHandler
    public void onNewEvent(NewEventEvent e) {

        if (calendarFiles.getSetting("event-alert") == true) {
            for (Player players : Bukkit.getOnlinePlayers()) {
                if (!NoteBlockPlayerMain.isReceivingSong(players))
                    playNewEventAlert(players);
            }
        }

    }


    public void playNewEventAlert(Player p) {

        Song s = NBSDecoder.parse(eventAlert);

        SongPlayer sp = new RadioSongPlayer(s);

        sp.addPlayer(p);
        sp.setPlaying(true);
        sp.setAutoDestroy(true);


    }

}


