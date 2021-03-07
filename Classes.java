public class Classes {

    String type;
    int hitDice;
    String[] savingThrows;
    String[] proficiencies;
    String[] armourProf;
    String[] weaponProf;



    public Classes(String type, int hitDice, String[] savingThrows, String[] proficiencies, String[] armourProf, String[] weaponProf, String[] equipment, String[] special, int numSpells, int cantrips, int spellslots){
        this.type = type;
        this.hitDice = hitDice;
        this.savingThrows = savingThrows;

    }

    Classes Barbarian = new Classes("Barbarian", 12, new String[]{"Strength", "Constitution"}, new String[]{""}, new String[]{"Light Armor", "Medium Armor", "Shields"}, new String[]{"Simple Weapons", "Martial Weapons"}, new String[]{""}, new String[]{"Rage", "Unarmoured Defense"}, 0,0,0);


    //Classes[] FUCK??? = {Barbarian, Bard, Cleric, Druid, Fighter, Monk, Paladin, Ranger, Rogue, Sorcerer. Warlock, Wizard};
}
