public class Races {

	private String race;
	private String size;
	private int[] ability;
	private String[] langs;
	private boolean darkvision;
	private int speed;
//	langs x;
	
	public Races(String race, int[] ability, int speed, boolean darkvision, String size, String[] langs) {
		this.race = race;
		this.speed = speed;
		this.darkvision = darkvision;
		this.size = size;
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

	public String[] getLangs() {
		return langs;
	}

	public void setLangs(String[] langs) {
		this.langs = langs;
	}

		public static int[] setAbilityMods(String ability){
        int[] arr = new int[6];   
        switch(ability) {
           case "Dexterity": arr[1] = 1; break;
           case "Strength":arr[2] = 1; break;
           case "Constitution":arr[3] = 1;break;
           case "Intelligence": arr[4] = 1; break;
           case "Wisdom":arr[5] = 1; break;
           case "Charisma": arr[6] = 1; break;
           }
        return arr;
    }
}
