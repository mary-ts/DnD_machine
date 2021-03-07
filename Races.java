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

}
