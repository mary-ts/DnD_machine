public class Classes {

    private String type;
    private int hitDice;
    private String[] savingThrows;
    private String[] proficiencies;
    private String[] armorProf;
    private String[] weaponProf;
    private String[] equipment;
    private String[] special;
    private int numSells;
    private int cantrips;
    private int spellslots;

    public Classes(String type, int hitDice, String[] savingThrows, String[] proficiencies, String[] armorProf, String[] weaponProf, String[] equipment, String[] special, int numSpells, int cantrips, int spellslots){
        this.type = type;
        this.hitDice = hitDice;
        this.savingThrows = savingThrows;
        this.proficiencies = proficiencies;
        this.armorProf = armorProf;
        this.weaponProf = weaponProf;
        this.equipment = equipment;
        this.special = special;
        this.numSells = numSpells;
        this.cantrips = cantrips;
        this.spellslots = spellslots;
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

	public String[] getWeaponProf() {
		return weaponProf;
	}

	public void setWeaponProf(String[] weaponProf) {
		this.weaponProf = weaponProf;
	}

	public String[] getEquipment() {
		return equipment;
	}

	public void setEquipment(String[] equipment) {
		this.equipment = equipment;
	}

	public String[] getSpecial() {
		return special;
	}

	public void setSpecial(String[] special) {
		this.special = special;
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



    //Classes[] FUCKK??? = {Barbarian, Bard, Cleric, Druid, Fighter, Monk, Paladin, Ranger, Rogue, Sorcerer. Warlock, Wizard};
}
