import java.util.ArrayList;
import java.util.Arrays;

public class playerChar extends Character{

    private String playName;
    private Races playRace;
    private Classes playClass;
    private int profBonus;
    private ArrayList<String> skills;
    private boolean[] skillProfs;

	public playerChar(String playName, Races playRace, Classes playClass, int profBonus) {
		this.playName = playName;
		this.playRace = playRace;
		this.playClass = playClass;
		genStats();
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

	public int getProfBonus() {
		return profBonus;
	}

	public void setProfBonus(int profBonus) {
		this.profBonus = profBonus;
	}

	public void genStats() {
    	Character.setAbilityScores(new int[] {rollDice.sum3D6(),rollDice.sum3D6(),rollDice.sum3D6(),rollDice.sum3D6(),rollDice.sum3D6(),rollDice.sum3D6()});
    }
    
    public void setSkillProf(String skill, boolean prof) {
    	for(String s : skills) {
    		if(s.equalsIgnoreCase(skill)) skillProfs[skills.indexOf(skill)] =  prof;
    	}
    }
    
//    public void displayCharacter() {
//    	String out = "Name: " + playName + 
//    }
    
}