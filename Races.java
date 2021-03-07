import java.util.Arrays;

public class Races {

	private String race;
	private String size;
	private int[] ability;
	private boolean darkvision;
	private int speed;
	private String[] langs;

	public Races(String race,int[] ability, int speed,  boolean darkvision, String size, String[] langs) {
		this.race = race;
		this.size = size;
		this.ability = ability;
		this.darkvision = darkvision;
		this.speed = speed;
		this.langs = langs;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int[] getAbility() {
		return ability;
	}

	public void setAbility(int[] ability) {
		this.ability = ability;
	}

	public boolean isDarkvision() {
		return darkvision;
	}


	public void setDarkvision(boolean darkvision) {
		this.darkvision = darkvision;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String toString() {
		String out = "Race: " + race + "\nSize: " + size + "\nSpeed: " + speed + "ft\nLanguages: " + Arrays.toString(langs);
		if(darkvision) out += "\nDarkvision";
		return out;
	}
	
	

}
