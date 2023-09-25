package simple_java_programs;

import java.util.Random;

public class BuildingBlocks {
    static String[] race = new String[] {"Dwarf", "Elf", "Human", "Dragonborne", "Orc"};
    static String[] profession = new String[] {"Warrior", "Druid", "Rogue", "Sorcerer", "Monk"};
    static String[] weapon = new String[] {"Sword", "Staff", "Mace", "Bow", "Fists"};
    static String[] magic = new String[] {"Blood", "Fire", "Healing", "Lightening", "Ice", "Dark",
            "Red", "Blue", "Green"};

    public static int RollDice(int range) {
        Random die = new Random();
        int diceroll = die.nextInt(range);
        return diceroll;
    }

}
