import java.util.Scanner;

public class playerChar extends Character{

    //String[] race = {"Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Halfling", "Half-Orc", "Human", "Tiefling"};
    //String[] classes = {Barbarian, Bard, Cleric, Druid, Fighter, Monk, Paladin, Ranger, Rogue, Sorcerer, Warlock, Wizard};
    private String playName;
    private String playRace;
    private Classes playClass;
    private int[] generatedStats;

    private int profBonus;
    private int dex;
    private int str;
    private int con;
    private int intel;
    private int wis;
    private int cha;

    public playerChar(String playName, String playRace, int[] generatedStats, int profBonus) {
		this.playName = playName;
		this.playRace = playRace;
		this.generatedStats = generatedStats;
		this.profBonus = profBonus;
	}
    
	public playerChar(String playName, String playRace, int profBonus, int dex, int str, int con, int intel, int wis,
			int cha) {
		this.playName = playName;
		this.playRace = playRace;
		this.profBonus = profBonus;
		this.dex = dex;
		this.str = str;
		this.con = con;
		this.intel = intel;
		this.wis = wis;
		this.cha = cha;
	}



	public String getPlayName() {
		return playName;
	}

	public void setPlayName(String playName) {
		this.playName = playName;
	}

	public String getPlayRace() {
		return playRace;
	}

	public void setPlayRace(String playRace) {
		this.playRace = playRace;
	}

	public int[] getGeneratedStats() {
		return generatedStats;
	}

	public void setGeneratedStats(int[] generatedStats) {
		this.generatedStats = generatedStats;
	}

	public int getProfBonus() {
		return profBonus;
	}

	public void setProfBonus(int profBonus) {
		this.profBonus = profBonus;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public int getIntel() {
		return intel;
	}

	public void setIntel(int intel) {
		this.intel = intel;
	}

	public int getWis() {
		return wis;
	}

	public void setWis(int wis) {
		this.wis = wis;
	}

	public int getCha() {
		return cha;
	}

	public void setCha(int cha) {
		this.cha = cha;
	}

	public void genStats() {
    	generatedStats = new int[] {rollDice.sum3(),rollDice.sum3(),rollDice.sum3(),rollDice.sum3(),rollDice.sum3(),rollDice.sum3()};
		System.out.println("Generated: ");
        for(int i = 0; i < generatedStats.length; i ++) {			
			System.out.println("[" + i + "] " + generatedStats[i]);
		}
		
    }

    public void assignStats(String stat, int index){
    	switch(stat) {
    		case "Strength": str = generatedStats[index]; 
    		case "Dexterity": dex = generatedStats[index]; 
    		case "Constitution": con = generatedStats[index]; 
    		case "Intelligence": intel = generatedStats[index]; 
    		case "Wisdom": wis = generatedStats[index]; 
    		case "Charisma": cha = generatedStats[index]; 
    	}
    }
}
