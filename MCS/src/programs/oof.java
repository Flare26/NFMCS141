//A shitty game by Nathan Frazier
package programs;
import java.util.Scanner;
public class oof {
public static void main(String[] args) 
{

	Scanner seebot;
	seebot = new Scanner(System.in); //Input created and values loaded
	double HP = 10; //You are supposed to have 10 HP but the enemy literally doesn't atta
	int EPLVL = 2;
	int DMG = 8;
	double EDMG = DMG + EPLVL ; 
	int EHP = (EPLVL*2) ;
	int SMAX = 15 ; 
	int mod = 2 ; //Start with 0
	double s = (Math.pow(EDMG, 2))/2;

 
 {
	 

	String estatus = "DETECTED" ;
	
	
		
	while (DMG <= EHP) { //once this loop is false, the enemy is defeated
		System.out.println("[ENEMY SHIP "+estatus+", "+EHP+" HULL] \n ["+s+" SHIELDS]");
		System.out.println("-Enemy PLVL "+EPLVL+"-") ; 
		System.out.println("[1] Fire Main Cannon") ; 
		System.out.println("[2] Repair") ;
		int input = seebot.nextInt() ; 
		
		if (input == 1 ) {
			if (s > 0) {
				EHP = EHP + DMG;
				s -= DMG;
			}
		EHP = EHP - DMG ;
		HP = HP - EDMG ;
		if (HP >= 1) {
		System.out.println("Your cannon dealt "+DMG+" damage. The enemy has "+EHP+" HP left.") ;
		System.out.println("[DAMAGE DETECTED: "+EDMG+", "+HP+"/"+SMAX+" HULL REMAINING]") ;
			} else {
				System.out.println("[DAMAGE DETECTED: "+EDMG+", 0 HULL REMAINING]") ;
				break;
			}
      /* Only issue with this is I have to re type every dialogue option. If I can figure out a way
       * to present the same text every turn and just act based on user input, that would be lit
       */
    	  
	}
		 if (input == 2) {
			 
			 if (mod > 0) {
				 
				 
				double s1 = 0;
				 HP = HP + s1 ;
				 if (HP < SMAX) {
					 s1 =  SMAX - HP;
					 HP = HP + s1;
					 System.out.println("[SHIP REPAIRED: "+ HP + " HULL]");
					 mod = mod - 1 ;
				 }
				 if (HP >= SMAX) {
					 System.out.println("[NO HULL DAMAGE DETECTED]");
					 
					 }
				 }
				 
				 
				
			 
			 
			 else {
				 System.out.println("[ERROR: NO REPAIR MODULE]") ;
			 }
		 } 
}

	if (EHP <= 0) { //defeat condition
		estatus = "DISABLED" ;
		System.out.println("[ENEMY SHIP: "+estatus+"]");
		if (EHP != 0) {
		System.out.println("[ENEMY SHIP HAS SUSTAINED CRITICAL DAMAGE]");
		}
		if (EHP <= 0) {
			System.out.println("{ENEMY SHIP DESTROYED}");
		}
		if (HP <= 0) {
			System.out.println("{YOU HAVE DIED}");
		}
		if (HP >= 1) {
			System.out.println("{YOU HAVE SURVIVED}");
		}
		seebot.close();
		System.exit(0);
	}
 } //YOU ARE ALIVE UP TO THIS POINT 
 
 System.out.println("{Your ship has exploded}");
 System.exit(0);
}
}
