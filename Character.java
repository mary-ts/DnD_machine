import java.util.*;
public class Character {
	
	private static String[] abilitiesArr = {"dex","str","con","int","wis","cha"};
	private int[] abilityScores = new int[6];
	public static final ArrayList<String> abilities = new ArrayList<String>(Arrays.asList(abilitiesArr));
	
	public int[] getAbilityScores() {
		return abilityScores;
	}

	public void setAbilityScores(int[] abilityScores) {
		this.abilityScores = abilityScores;
	}

	// PHB Races
    static Races Human = new Races("Human", new int[] { 1, 1, 1, 1, 1, 1 }, 30, false, "medium",
            new String[] { "Common", "French" });
    static Races Elf = new Races("Elf", new int[] { 2, 0, 0, 0, 0, 0 }, 30, true, "medium",
            new String[] { "Common", "Elvish" });
     static Races HalfOrc = new Races("Half-Orc", new int[] { 0, 2, 1, 0, 0, 0 }, 30, true, "medium",
            new String[] { "Common", "Orcish" });
     static Races Halfling = new Races("Halfling", new int[] { 2, 0, 0, 0, 0, 0 }, 25, false, "small",
            new String[] { "Common", "Halfling" });
     static Races Gnome = new Races("Gnome", new int[] { 0, 0, 0, 2, 0, 0 }, 25, true, "small",
            new String[] { "Common", "Gnomish" });
     static Races Dwarf = new Races("Dwarf", new int[] { 0, 0, 2, 0, 0, 0 }, 25, true, "medium",
            new String[] { "Common", "Dwarvish" });
     static Races Tiefling = new Races("Tiefling", new int[] { 0, 0, 0, 1, 0, 2 }, 30, true, "medium",
            new String[] { "Common", "Infernal" });
    // PHB CLasses

     static Classes Barbarian = new Classes("Barbarian", 12, new String[] { "Strength", "Constitution" },
            new String[] { "Animal Handling", "Athletics", "Intimidation", "Nature", "Perception", "Survival" },
            new String[] { "Light Armor", "Medium Armor", "Shields" }, 0, 0, 0);

     static Classes Bard = new Classes("Bard", 8, new String[] { "Dexterity", "Charisma" },
            new String[] { "Acrobatics", "Animal Handling", "Arcana", "Athletics", "Deception", "History", "Insight",
                    "Intimidation", "Investigation", "Medicine", "Nature", "Perception", "Performance", "Persuasion",
                    "Religion", "Sleight of hand", "Stealth", "Survival" },
            new String[] { "Light Armor" }, 4, 2, 2);

     static Classes Cleric = new Classes("Cleric", 8, new String[] { "Wisdom", "Charisma" },
            new String[] { "History", "Insight", "Medicine", "Persuasion", "Religion" },
            new String[] { "Light Armor", "Medium armor", "Shields" }, 5, 3, 2);

     static Classes Druid = new Classes(
            "Druid", 8, new String[] { "Intelligence", "Wisdom" }, new String[] { "Animal Handling", "Arcana",
            "Insight", "Medicine", "Nature", "Perception", "Religion", "Survival" },
            new String[] { "Light Armor", "Medium armor", "Shields" }, 4, 2, 2);

     static Classes Fighter = new Classes("Fighter", 10, new String[] { "Strength", "Constitution" },
            new String[] { "Acrobatics", "Animal Handling", "Athletics", "History", "Insight", "Intimidation",
                    "Perception", "Survival" },
            new String[] { "Light Armor", "Medium armor", "Heavy Armor", "Shields" }, 0, 0, 0);

     static Classes Monk = new Classes("Monk", 8, new String[] { "Strength", "Dexterity" },
            new String[] { "Acrobatics", "Athletics", "History", "Insight", "Religion", "Stealth" }, new String[] {}, 0,
            0, 0);

     static Classes Paladin = new Classes("Paladin", 10, new String[] { "Wisdom", "Charisma" },
            new String[] { "Athletics", "Insight", "Intimidation", "Medicine", "Persuasion", "Religion" },
            new String[] { "Light Armor", "Medium armor", "Heavy Armor", "Shields" }, 0, 0, 0);

     static Classes Ranger = new Classes(
            "Ranger", 10, new String[] { "Strength", "Dexterity" }, new String[] { "Animal Handling", "Athletics",
            "Insight", "Investigation", "Nature", "Perception", "Stealth", "Survival" },
            new String[] { "Light Armor" }, 0, 0, 0);

     static Classes Rogue = new Classes("Rogue", 8, new String[] { "Dexterity", "Intelligence" },
            new String[] { "Acrobatics", "Athletics", "Insight", "Intimidation", "Investigation", "Perception",
                    "Performance", "Persuasion", "Sleight ", "Stealth of Hand" },
            new String[] { "Light Armor" }, 0, 0, 0);

     static Classes Sorcerer = new Classes("Sorcerer", 6, new String[] { "Constitution", "Charisma" },
            new String[] { "Arcana", "Deception", "Insight", "Intimidation", "Persuasion", "Religion" },
            new String[] {}, 2, 4, 2);

     static Classes Warlock = new Classes("Warlock", 8, new String[] { "Wisdom", "Charisma" },
            new String[] { "Arcana", "Deception", "History", "Intimidation", "Investigation", "Nature", "Religion" },
            new String[] { "Light Armor" }, 2, 2, 1);

     static Classes Wizard = new Classes("Wizard",
            6,
            new String[]{"Intelligence", "Wisdom"},
            new String[]{"Arcana", "History", "Insight", "Investigation", "Medicine", "Religion"},
            new String[]{"Light Armor"},
            4,3,2);

}
