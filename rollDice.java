public class rollDice {

	public static int rollD4() {
		return (int) (Math.random()*4 +1 );
	}
        
	public static int rollD6() {
		return (int) (Math.random()*6 +1 );
	}
	
	public static int rollD8() {
		return (int) (Math.random()*8 +1 );
	}
	
	public static int rollD10() {
		return (int) (Math.random()*10 +1 );
	}
	
	public static int rollD12() {
		return (int) (Math.random()*12 +1 );
	}
	
	public static int rollD20() {
		int x = (int) (Math.random()*20 +1 ) ;
	    	
		    if (x == 1) {  
	    		System.out.println("Natural 1!");  // take these out if theyre annoying lol
	    	} else if (x == 20) {
	    		System.out.println("Natural 20!");
	    	}
		    
		return x ;	
	}
	
	public static int rollD100() {
		return (int) (Math.random()*100 +1 );
	}	
	
	
	public static int sum3D6() {
		int[] allRolls = new int[] {rollD6(), rollD6(), rollD6(), rollD6()};
 		int min = Math.min(allRolls[0], Math.min(allRolls[1], Math.min(allRolls[2], allRolls[3])));
		int sum = 0;
		for(int i =0; i < allRolls.length; i++) sum += allRolls[i];
		return sum - min;
	}
}
