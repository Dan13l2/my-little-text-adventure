//package here later

// helps input
import java.util.Random;
import java.util.Scanner;


public class IWillRenameThis {
	




	public static void main (String [] args) {
		
		//system operations
		
		Scanner in = new Scanner (System.in);
		Random rand = new Random ();
		
		//game variables
		String[] Enemies = { "Slave I", "Tardis", "Space Shuttle", "Shuttlecraft", "TIE Fighter", "X-Wing", "SR-71", "TIE Interceptor", "F-15 Eagle Fighter"
							, "Millennium Falcon", "Titanic", "TitanX Rocket"}; 
		int MaxEnemieHP = 75;																									
		int EnemieDP = 30;																								
		
		//player variables
		
		int PlayerHP = 100;
		int PlayerDP = 50;
		int NumRepair = 3;
		int HPRepair = 25;
		int DropChanceRepair = 50; //percentage
		int PlayerLevel = 1;
		int PlayerLevelUpChance = 10;
		int KillStreak = 0;
		int PlayerMoney = 0;
		int PlayerMoneyUpChance = 40;
		boolean alive = true;
		
		boolean running = true;
		
		System.out.println ("\t>through many weird circumstances you have come to space! congratulations!");
		
		
		
		GAME1:
		while(running) {
			//GAME
			System.out.println ("----------------------------------------------------------------------------");

			//enemy
			int EnemieHP = rand.nextInt(MaxEnemieHP);
			String Enemy = Enemies [rand.nextInt(Enemies.length)];
			System.out.println("\n"
							 + "\t# a "+ Enemy + " appeared! #"
							 + "\n");
			
			while(EnemieHP > 0 && PlayerHP > 0) {
				System.out.println("\tYour HP: "+ PlayerHP );
				System.out.println("\t" + Enemy + "'s HP: "+ EnemieHP);
				System.out.println("\n\tWhat would you like to do?");
				System.out.println("\t1. Attack!");
				System.out.println("\t2. Repair!");
				System.out.println("\t3. Flee!");
				
				String input = in.nextLine();
				
				if (input.equals("1")) {//attack
					int DamageDealt = rand.nextInt(PlayerDP);
					int DamageTaken = rand.nextInt(EnemieDP);
					
					EnemieHP -= DamageDealt;
					PlayerHP -= DamageTaken;
				
					System.out.println("\t> You lazor the " + Enemy + " for " + DamageDealt + " damage");
					System.out.println("\t> You recieve " + DamageTaken +" in retaliation" + 
										"\n");
					
					
				}
				
				else if (input.equals("2")) { //repair
					if (NumRepair > 0) {
						PlayerHP += HPRepair;
						NumRepair--;
						System.out.println("\t> you may not know how but you just repaired your ship for " + HPRepair + "HP" +
								"\n\t> you now have " + PlayerHP + "HP"	+ 
								"\n\t> you have " + NumRepair + " Repairs left" +
								"\n");	
					}
					else { //no repair kits left
						System.out.println("you have no repairs left!!!");
					}
				}
				
				else if (input.equals("3")) { //fleeing
					System.out.println("You fly away from " + Enemy +"!");
					continue GAME1;
				}
				
				else { // invalid command
					System.out.println("----------------------------------------------------------------------------\n"
										+ "pls type 1 2 or 3 \n");
				}			
			}
			if(PlayerHP < 1) {	
				System.out.println("\t> YOU DIED");
				break;
			}
			//enemy killed
			KillStreak++;
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("  #  " + Enemy + "was defeated");
			System.out.println("     you have " + PlayerHP + " HP left");
			System.out.println("     Killstreak: " + KillStreak );
			
			if (rand.nextInt(100) < DropChanceRepair ) {
				NumRepair++;
				System.out.println("     a floating repairkit in space!");
				System.out.println("     total = " + NumRepair);
			} //levelup
			if (rand.nextInt(100) < PlayerLevelUpChance ) {
				PlayerLevel++;
				PlayerDP++;
				System.out.println("     you leveled up!");
				System.out.println("     level = " + PlayerLevel);
				System.out.println("     DP = " + PlayerDP);
			}
			if (rand.nextInt(100) < PlayerMoneyUpChance ) {
				PlayerMoney++;
				System.out.println("     you found a credit!");
				System.out.println("     money = " + PlayerMoney + " credits");
			}
			
			
			//exit?
			System.out.println("----------------------------------------------------------------------------");	
			System.out.println("\t continue?");	
			System.out.println("\t1. yea");	
			System.out.println("\t2. upgrade lazor");	
			System.out.println("\t3. nope");	
			
			String input = in.nextLine();
			
			while (!input.equals("1") && !input.equals("2") && !input.equals("3")) {
				System.out.println("     pls write 1 or 2");
				input = in.nextLine();
			}//dont exit
			if (input.equals("1")) {
				System.out.println("\tyou continue");
			}//upgrade lazor
			else if (input.equals("2")) {
				PlayerMoney--;
				PlayerDP++;
				System.out.println("\tyou upgrade your lazor and continue");
				System.out.println("\tyour DP: " + PlayerDP);
			}
			
			//exit!
			else if (input.equals("3")) {
				break;
			}
		}
		System.out.println("\t  you loser!");
	}
}
