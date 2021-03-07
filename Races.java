public class Races {

	String race;
	String size;
	String[] langs;
	boolean darkvision;
	int speed;
//	langs x;
	
	
	public Races(String race, int speed, boolean darkvision, String size, String[] langs) {
		this.race = race;
		this.speed = speed;
		this.darkvision = darkvision;
		this.size = size;
		this.langs = langs;
		
	}

	Races Human = new Races("Human", 30, false, "medium", new String[] {"Common", "x"} );
        Races Elf = new Races("Elf", 30, true, "medium", new String[] {"Common", "Elvish"});
	Races HalfElf = new Races("Half-Elf", 30, true, "medium", new String[] {"Common", "Elvish", "x"});
	Races HalfOrc = new Races("Half-Orc", 30, true, "medium", new String[] {"Common", "Orcish"});
	Races Halfling = new Races("Halfling", 25, false, "small", new String[] {"Common", "Halfling"});
	Races Gnome = new Races("Gnome", 25, true, "small", new String[] {"Common", "Gnomish"});
	Races Dwarf = new Races ("Dwarf", 25, true, "medium", new String[] {"Common", "Dwarvish"});
	Races Tiefling = new Races("Tiefling", 30, true, "medium", new String[] {"Common", "Infernal"});

}
