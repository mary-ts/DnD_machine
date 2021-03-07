public class playerChar extends Character{

    //String[] race = {"Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Halfling", "Half-Orc", "Human", "Tiefling"};
    //String[] classes = {Barbarian, Bard, Cleric, Druid, Fighter, Monk, Paladin, Ranger, Rogue, Sorcerer, Warlock, Wizard};
    String playName;
    String playRace;
    Classes playClass;

    int dex;
    int str;
    int con;
    int intel;
    int wis;
    int cha;

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

    public Classes getPlayClass() {
        return playClass;
    }

    public void setPlayClass(Classes playClass) {
        this.playClass = playClass;
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

    public playerChar(){

    }

    public playerChar(String name, String race, String Class){
        this.playName = name;
        this.playRace = race;
        if(Class.equalsIgnoreCase("Barbarian"))
            this.playClass = Classes.Barbarian;

        calcStats();

    }

    private void calcStats(){
        dex = sum3();
        str = sum3();
        con = sum3();
        intel = sum3();
        wis = sum3();
        cha = sum3();
    }



}
