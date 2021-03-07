public class Classes {

    String type;
    int hitDice;
    String[] savingThrows;
    String[] proficiencies;
    String[] armorProf;
    String[] weaponProf;
    String[] equipment;
    String[] special;
    int numSells;
    int cantrips;
    int spellslots;



    public Classes(String type, int hitDice, String[] savingThrows, String[] proficiencies, String[] armorProf, String[] weaponProf, String[] equipment, String[] special, int numSpells, int cantrips, int spellslots){
        this.type = type;
        this.hitDice = hitDice;
        this.savingThrows = savingThrows;
        this.proficiencies = proficiencies;
        this.armorProf = armorProf;
        this.weaponProf = weaponProf;
        this.equipment = equipment;
        this.special = special;
        this.numSells = numSpells;
        this.cantrips = cantrips;
        this.spellslots = spellslots;
    }

    Classes Barbarian = new Classes("Barbarian", 12, new String[]{"Strength", "Constitution"}, new String[]{""}, new String[]{"Light Armor", "Medium Armor", "Shields"}, new String[]{"Simple Weapons", "Martial Weapons"}, new String[]{""}, new String[]{"Rage", "Unarmoured Defense"}, 0,0,0);


    //Classes[] FUCKK??? = {Barbarian, Bard, Cleric, Druid, Fighter, Monk, Paladin, Ranger, Rogue, Sorcerer. Warlock, Wizard};
}
