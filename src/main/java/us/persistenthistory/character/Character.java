package us.persistenthistory.character;

import org.bukkit.entity.Player;
import us.persistenthistory.character.professions.ProfessionType;

public class Character {

    private Player player;
    private String name;
    private double age;
    private ProfessionType profession;
    private Nationality nationality;

    public Character(Player player, String fullName, double age, ProfessionType profession, Nationality nationality) {
        this.player = player;
        this.name = fullName;
        this.age = age;
        this.profession = profession;
        this.nationality = nationality;
    }

    /*
    getter setter
     */
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public ProfessionType getProfession() {
        return profession;
    }

    public void setProfession(ProfessionType profession) {
        this.profession = profession;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;

    }


    /*
    Static functions to retrieve character data
     */

    public static Character getCharacter(String playername) {
    }

    public static Character getCharacter(Player player) {
    }

    public static boolean hasCharacter(String playername) {
    }

    public static boolean hasCharacter(Player player) {
    }




}
