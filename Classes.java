public class Classes {

	private String type;
	private int hitDice;
	private String[] savingThrows;
	private String[] proficiencies;
	private String[] armorProf;
	private int numSells;
	private int cantrips;
	private int spellslots;

    public Classes(String type, int hitDice, String[] savingThrows, String[] proficiencies, String[] armorProf, int numSpells, int cantrips, int spellslots){
        this.type = type;
        this.hitDice = hitDice;
        this.savingThrows = savingThrows;
        this.proficiencies = proficiencies;
        this.armorProf = armorProf;
        this.numSells = numSpells;
        this.cantrips = cantrips;
        this.spellslots = spellslots;
    }
    
	public String toString() {
		String out = "Classes: " + type + "\nHit Dice: d" + hitDice + "\nProficiencies\nSaving Throws: " + savingThrows + "\nSkill Proficiencies: "
				+ proficiencies + "\nArmour: " + armorProf;
		if(numSells > 0) out += "\nNumber of Spells" + numSells + "\nCantrips: " + cantrips
			+ "\nSpellslots: " + spellslots;
		return out;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHitDice() {
		return hitDice;
	}

	public void setHitDice(int hitDice) {
		this.hitDice = hitDice;
	}

	public String[] getSavingThrows() {
		return savingThrows;
	}

	public void setSavingThrows(String[] savingThrows) {
		this.savingThrows = savingThrows;
	}

	public String[] getProficiencies() {
		return proficiencies;
	}

	public void setProficiencies(String[] proficiencies) {
		this.proficiencies = proficiencies;
	}

	public String[] getArmorProf() {
		return armorProf;
	}

	public void setArmorProf(String[] armorProf) {
		this.armorProf = armorProf;
	}

	public int getNumSells() {
		return numSells;
	}

	public void setNumSells(int numSells) {
		this.numSells = numSells;
	}

	public int getCantrips() {
		return cantrips;
	}

	public void setCantrips(int cantrips) {
		this.cantrips = cantrips;
	}

	public int getSpellslots() {
		return spellslots;
	}

	public void setSpellslots(int spellslots) {
		this.spellslots = spellslots;
	}

}
