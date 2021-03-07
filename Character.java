public class Character {
	
	//PHB Races
	Races Human = new Races("Human", 30, false, "medium", new String[] {"Common", "x"} );
    Races Elf = new Races("Elf", 30, true, "medium", new String[] {"Common", "Elvish"});
	Races HalfElf = new Races("Half-Elf", 30, true, "medium", new String[] {"Common", "Elvish", "x"});
	Races HalfOrc = new Races("Half-Orc", 30, true, "medium", new String[] {"Common", "Orcish"});
	Races Halfling = new Races("Halfling", 25, false, "small", new String[] {"Common", "Halfling"});
	Races Gnome = new Races("Gnome", 25, true, "small", new String[] {"Common", "Gnomish"});
	Races Dwarf = new Races ("Dwarf", 25, true, "medium", new String[] {"Common", "Dwarvish"});
	Races Tiefling = new Races("Tiefling", 30, true, "medium", new String[] {"Common", "Infernal"});
	
	//PHB CLasses
	Classes Barbarian = new Classes("Barbarian", 12, new String[]{"Strength", "Constitution"}, new String[]{""}, 
			new String[]{"Light Armor", "Medium Armor", "Shields"}, new String[]{"Simple Weapons", "Martial Weapons"}, new String[]{""}, new String[]{"Rage", "Unarmoured Defense"}, 0,0,0);


}
