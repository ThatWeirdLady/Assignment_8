package simple_java_programs;

public class Adventure {
    public static void main(String[] args) {
        System.out.println("Welcome to Jenn's Adventure!");
        System.out.println("Let's make your character. First your race.");

        Character test = new Character();
        test.SetRace(BuildingBlocks.RollDice(BuildingBlocks.race.length));
        System.out.println("You rolled a " + BuildingBlocks.RollDice(BuildingBlocks.race.length)
                + " and your race is " + test.GetRace());

        System.out.println("Now your profession");

        int rollprofession = BuildingBlocks.RollDice(BuildingBlocks.profession.length);
        test.SetProfession(rollprofession);
        System.out.println("You rolled a " + rollprofession + " and your profession is "
                + test.GetProfession());

        int rollMagic = BuildingBlocks.RollDice(BuildingBlocks.magic.length);
        System.out.println("Next your magic");
        test.SetMagic(rollMagic);
        System.out.println("You rolled a " + rollMagic + " and your magic is " + test.GetMagic());

        int rollWeapon = BuildingBlocks.RollDice(BuildingBlocks.weapon.length);
        System.out.println("Finally your weapon");
        test.SetWeapon(rollWeapon);
        System.out
                .println("You rolled a " + rollWeapon + " and your weapon is " + test.GetWeapon());



    }
}
