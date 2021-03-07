public class CLI {
    private Scanner scan;
    private boolean more;

    private String playName;
    private Races playRace;
    private Classes playClass;
    private int[] generatedStats;
    private int profBonus;

    public CLI() {
        more = true;
        scan = new Scanner(System.in);
    }

    public void run() {
        while(more) {
            System.out.println("C)reate Character   Q)uit");
            String command = scan.nextLine().toUpperCase();

            switch(command) {
                case "C":
                System.out.println("What's your name?");
                playName = scan.nextLine();

                System.out.println("Choose a Race");
                System.out.println("1. Human    2. Half-Orc     3. Elf");
                System.out.println("4. Halfling 5. Gnome        6. Dwarf");
                int race = scan.nextInt();
                switch(race) {
                    case 1: 
                        playRace = Character.Human;
                        break;
                    case 2:
                        playRace = Character.HalfOrc;
                        break;
                    case 3:
                        playRace = Character.Elf;
                        break;
                    case 4:
                        playRace = Character.Halfling;
                        break;
                    case 5:
                        playRace = Character.Gnome;
                        break;
                    case 6:
                        playRace = Character.Dwarf;
                        break;
                }
                System.out.println("Choose a Class")
                System.out.println("1. Barbarian      2. Bard       3. Cleric     4. Druid");
                System.out.println("5. Fighter        6. Monk       7. Paladin    8. Ranger");
                System.out.println("9. Rogue          10. Sorcerer  11. Warlock   12. Wizard");
                int pClass = scan.nextInt();
                switch(pClass) {
                    case 1: 
                        playClass = Character.Barbarian;
                        break;
                    case 2:
                        playClass = Character.Bard;
                        break;
                    case 3:
                        playClass = Character.Cleric;
                        break;                        
                    case 4:
                        playClass = Character.Druid;
                        break;
                    case 5:
                        playClass = Character.Fighter;
                        break;
                    case 6:
                        playClass = Character.Monk;
                        break;
                    case 7:
                        playClass = Character.Paladin;
                        break;
                    case 8:
                        playClass = Character.Ranger;
                        break;
                    case 9:
                        playClass = Character.Rogue;
                        break;
                    case 10:
                        playClass = Character.Sorcerer;
                        break;
                    case 11:
                        playClass = Character.Warlock;
                        break;
                    case 12:
                        playClass = Character.Wizard;
                        break;
                }

            }
        }
    }
}
