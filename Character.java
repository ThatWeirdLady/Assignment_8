package simple_java_programs;

public class Character {
    private String race;
    private String profession;
    private String weapon;
    private String magic;

    public String SetRace(int RollDice) {
        this.race = BuildingBlocks.race[RollDice];
        return this.race;
    }

    public String GetRace() {
        return this.race;
    }

    public String SetProfession(int RollDice) {
        this.profession = BuildingBlocks.profession[RollDice];
        return this.profession;
    }

    public String GetProfession() {
        return this.profession;
    }

    public String SetWeapon(int RollDice) {
        this.weapon = BuildingBlocks.weapon[RollDice];
        return this.weapon;
    }

    public String GetWeapon() {
        return this.weapon;
    }

    public String SetMagic(int RollDice) {
        this.magic = BuildingBlocks.magic[RollDice];
        return this.magic;
    }

    public String GetMagic() {
        return this.magic;
    }
}


