package us.persistenthistory.character.professions;

import org.bukkit.entity.Player;
import us.persistenthistory.character.Character;

public abstract class ProfessionManager {

    protected Character character;
    protected ProfessionType profession;

    public ProfessionManager(Character character, ProfessionType profession) {
        this.character = character;
        this.profession = profession;
    }

    public Player getPlayer(){
        return character.getPlayer();
    }



}
