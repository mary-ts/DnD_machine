import java.util.ArrayList;
import java.util.Arrays;

public class playerChar extends Character{

    private String playName;
    private Races playRace;
    private Classes playClass;
    private int[] generatedStats;
    private int profBonus;
    private ArrayList<String> skills;
    private boolean[] skillProfs;

	public playerChar(String playName, Races playRace, Classes playClass, int[] generatedStats, int profBonus) {
		this.playName = playName;
		this.playRace = playRace;
		this.playClass = playClass;
		genStats();
		setAbilityScores(generatedStats);
		this.profBonus = profBonus;
		String allSkills[] = new String[] {"athletics","acrobatics","sleightOfHand","stealth","arcana","history","investigation", "nature",
				"religion","animalHandling","insight","medicine","perception","survival","deception","intimidation","performance","persuasion"};
		skills = new ArrayList<String>(Arrays.asList(allSkills));
		skillProfs = new boolean[18];
		calcAbilityScores();
	}
	
	public playerChar(String playName, Races playRace, Classes playClass, int profBonus, int[] abilityScores) {
		this.playName = playName;
		this.playRace = playRace;
		this.playClass = playClass;
		this.profBonus = profBonus;
		setAbilityScores(abilityScores);
		String[] allSkills = new String[] {"athletics","acrobatics","sleightOfHand","stealth","arcana","history","investigation", "nature",
				"religion","animalHandling","insight","medicine","perception","survival","deception","intimidation","performance","persuasion"};
		skills = new ArrayList<String>(Arrays.asList(allSkills));
		skillProfs = new boolean[18];
		calcAbilityScores();
	}
	
	public void calcAbilityScores() {
		for(int i = 0; i < getAbilityScores().length; i++) {
			getAbilityScores()[i] += playRace.getAbility()[i];
		}
	}

	public Classes getPlayClass() {
		return playClass;
	}

	public void setPlayClass(Classes playClass) {
		this.playClass = playClass;
	}

	public String getPlayName() {
		return playName;
	}

	public void setPlayName(String playName) {
		this.playName = playName;
	}

	public Races getPlayRace() {
		return playRace;
	}

	public void setPlayRace(Races playRace) {
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

	public void genStats() {
    	generatedStats = new int[] {rollDice.sum3D6(),rollDice.sum3D6(),rollDice.sum3D6(),rollDice.sum3D6(),rollDice.sum3D6(),rollDice.sum3D6()};
		System.out.println("Generated: ");
        for(int i = 0; i < generatedStats.length; i ++) {			
			System.out.println("[" + i + "] " + generatedStats[i]);
		}
		
    }
    
    public void setSkillProf(String skill, boolean prof) {
    	for(String s : skills) {
    		if(s.equalsIgnoreCase(skill)) skillProfs[skills.indexOf(skill)] =  prof;
    	}
    }
    
//    public String toString() {
//    	String out = playName + "";
//    }
//    
}