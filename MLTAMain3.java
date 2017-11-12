import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class MLTAMain3 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MLTAMain3 window = new MLTAMain3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MLTAMain3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 756, 798);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//system varibles
		Random rand = new Random ();
		
		//game variables
		 
		int MaxEnemieHP = 75;																									
		int EnemieDP = 30;																								
		
		//player variables
		
		int HPRepair = 25;
		int DropChanceRepair = 50; //percentage
		int PlayerLevelUpChance = 10;
		int PlayerMoneyUpChance = 40;
		int fleeDamageChance = 50;
		
		
		
		
		JLabel Commands = new JLabel("*");
		Commands.setBounds(10, 11, 720, 14);
		frame.getContentPane().add(Commands);
		
		JLabel label = new JLabel("*");
		label.setBounds(10, 36, 720, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("*");
		label_1.setBounds(10, 61, 720, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("*");
		label_2.setBounds(10, 86, 720, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("*");
		label_3.setBounds(10, 111, 720, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("*");
		label_4.setBounds(10, 136, 720, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("*");
		label_5.setBounds(10, 161, 720, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("*");
		label_6.setBounds(10, 186, 720, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("*");
		label_7.setBounds(10, 211, 720, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("*");
		label_8.setBounds(10, 236, 720, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("*");
		label_9.setBounds(10, 261, 720, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("*");
		label_10.setBounds(10, 286, 720, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("*");
		label_11.setBounds(10, 311, 720, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("*");
		label_12.setBounds(10, 336, 720, 14);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("*");
		label_13.setBounds(10, 361, 720, 14);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("*");
		label_14.setBounds(10, 386, 720, 14);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("*");
		label_15.setBounds(10, 411, 720, 14);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("*");
		label_16.setBounds(10, 436, 720, 14);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("*");
		label_17.setBounds(10, 461, 720, 14);
		frame.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("*");
		label_18.setBounds(10, 486, 720, 14);
		frame.getContentPane().add(label_18);
		
		JLabel label_19 = new JLabel("*");
		label_19.setBounds(10, 511, 720, 14);
		frame.getContentPane().add(label_19);
		
		JLabel label_20 = new JLabel("*");
		label_20.setBounds(10, 536, 720, 14);
		frame.getContentPane().add(label_20);
		
		JLabel label_21 = new JLabel("*");
		label_21.setBounds(10, 561, 720, 14);
		frame.getContentPane().add(label_21);
		
		JLabel label_22 = new JLabel("*");
		label_22.setBounds(10, 586, 720, 14);
		frame.getContentPane().add(label_22);
		
		JLabel label_23 = new JLabel("*");
		label_23.setBounds(10, 611, 720, 14);
		frame.getContentPane().add(label_23);
		
		JLabel label_24 = new JLabel("*");
		label_24.setBounds(10, 636, 720, 14);
		frame.getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("*");
		label_25.setBounds(10, 661, 720, 14);
		frame.getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel("*");
		label_26.setBounds(10, 686, 720, 14);
		frame.getContentPane().add(label_26);
		
		JLabel lblPleaseEnter = new JLabel("please enter :");
		lblPleaseEnter.setBounds(10, 711, 720, 14);
		frame.getContentPane().add(lblPleaseEnter);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			
			boolean inGame = false ;
			boolean looted = false;
			boolean diedFleeing = false;
			
			int DamageTaken ;
		    int DamageDealt ;
		    	
		    int PlayerHP = 100;
			int EnemyHP = 50;
			
			int KillStreak = 0;
			
			int PlayerMoney = 0;
			int NumRepair = 3;
			int PlayerLevel = 1;
			int PlayerDP = 50;
			
			String[] Enemies = { "Slave I", "Tardis", "Space Shuttle", "Shuttlecraft", "TIE Fighter", "X-Wing", "SR-71", "TIE Interceptor", "F-15 Eagle Fighter"
							, "Millennium Falcon", "Titanic", "TitanX Rocket"};
			
			String Enemy = Enemies [rand.nextInt(Enemies.length)];
			
			public void actionPerformed(ActionEvent e) {
				String content = textField.getText();
				
				
				
				
				
				if(content.equals("exit")) {
		        	System.exit(0);
		        	}
				else if (content.equals("")) {
					
						label_26.setText("you cant just write nothing");
		        	}
				else if ((content.equals("begin")||content.equals("start")) && inGame == false) {
					inGame = true;
					label_26.setText("you begin your little text adventure");
					Commands.setText("commands: exit, attack, flee, next, loot, heal, ");
					
					label.setText("your current enemy: " + Enemy);
		        	label_1.setText("his HP: " + EnemyHP);
					label_2.setText("your HP: " + PlayerHP);
					label_3.setText("repairkits: " + NumRepair);
					label_4.setText("your level: " + PlayerLevel);
					label_5.setText("your money: " + PlayerMoney + " credits");
					
	        	}
				
				else if ((content.equals("begin")||content.equals("start")) && inGame == true) {
					inGame = true;
					label_26.setText("u already started");
	        	}
				
		        else if (inGame == true) {
		    		
		        	label.setText("your current enemy: " + Enemy);
		        	label_1.setText("his HP: " + EnemyHP);
					label_2.setText("your HP: " + PlayerHP);
					label_3.setText("repairkits: " + NumRepair);
					label_4.setText("your level: " + PlayerLevel);
					label_5.setText("your money: " + PlayerMoney + " credits");
		        	
		    		if (PlayerHP < 1) {
						Commands.setText("u ded");
						label.setText("u ded ");
						label_1.setText("u ded ");
						label_2.setText("u ded ");
						label_3.setText("u ded ");
						label_4.setText("u ded ");
						label_5.setText("u ded ");
					
						label_6.setText("u ded ");
						label_7.setText("u ded ");
						label_8.setText("u ded ");
						label_9.setText("u ded ");
						label_10.setText("u ded ");
						label_12.setText("u ded ");
						label_13.setText("u ded ");
						label_14.setText("u ded ");
						label_15.setText("u ded ");
						label_16.setText("u ded ");
						label_17.setText("u ded ");
						label_18.setText("u ded ");
						label_19.setText("u ded ");
						label_20.setText("u ded ");
						label_21.setText("u ded ");
						label_22.setText("u ded ");
						label_23.setText("u ded ");
						label_24.setText("u ded ");
						label_25.setText("u ded ");
						label_26.setText("u ded ");
					}
				
		    		else if(content.equals("loot")) {
		    				
		    				if (EnemyHP < 1) {
		    			
		    				label_20.setText("you loot the " + Enemy + " and:" );
		    				
		    				if (rand.nextInt(100) < DropChanceRepair ) {
		    					NumRepair++;
		    					
		    					label_21.setText("find a repairkit     total: " + NumRepair);
		    				} 
		    				else {
		    					label_21.setText("");
		    				}
		    				
		    				if (rand.nextInt(100) < PlayerLevelUpChance ) {
		    					PlayerLevel++;
		    					PlayerDP++;
		    					
		    					label_22.setText("level up     current level: " + PlayerLevel + "    current DP: " + PlayerDP     );
		    				}
		    				else {	
		    					label_22.setText("");
		    				}
		    				
		    				if (rand.nextInt(100) < PlayerMoneyUpChance ) {
		    					PlayerMoney++;
		    					
		    					label_23.setText("find a credit       money: " + PlayerMoney + " credits");
		    				}
		    				else {
		    					label_23.setText("");
		    				}
		    				
		    				KillStreak++;
		    				
		    				label_24.setText("you take the " + Enemy + "'s Dogtag now your Killstreak is: " + KillStreak);
		    				
		    				EnemyHP = rand.nextInt(MaxEnemieHP);
		    				Enemy = Enemies [rand.nextInt(Enemies.length)];
		
		    				label_25.setText("a " + Enemy + " approaches you");
		    				label_26.setText(Enemy + "'s HP: " + EnemyHP);
		    				
		    				
		    				
		    				
		    				}
		    				
		    				else {
		    					label_26.setText("you cant loot someone when they are still alive");
		    				}
		    				
		        		}	
		        	
					else if (content.equals("next")) {
		    				
		    				if (EnemyHP < 1) {
		    					
		    					KillStreak++;
		    					label_24.setText("you take the " + Enemy + "'s Dogtag now your Killstreak is: " + KillStreak);
		    					
		    					EnemyHP = rand.nextInt(MaxEnemieHP);
			    				Enemy = Enemies [rand.nextInt(Enemies.length)];
		    				
			    				label_20.setText("");
			    				label_21.setText("");
			    				label_22.setText("");
			    				label_23.setText("");
			    				label_25.setText("a " + Enemy + " approaches you");
			    				label_26.setText(Enemy + "'s HP: " + EnemyHP);
		    				}
		    				
		    				else {
		    					
		    					label_20.setText("");
		    					label_21.setText("");
		    					label_22.setText("");
		    					label_23.setText("");
		    					label_24.setText("");
		    					label_25.setText("");
		    					label_26.setText("he still alive dude    use flee to flee");
		    				}
		        		}
				
		    	
		        	else if(content.equals("attack")) {
		        	
		        	
		    		
		        		if (EnemyHP < 1) {
		        			label_26.setText("he already ded");
		        		}
		        	
		        		else if (EnemyHP > 0.9) {
		        			
		        			DamageDealt = rand.nextInt(PlayerDP);
							DamageTaken = rand.nextInt(EnemieDP);
						
							EnemyHP -= DamageDealt;
							PlayerHP -= DamageTaken;
							
							label_20.setText("");
							label_21.setText("");
							label_22.setText("you attack for " + DamageDealt + " damage");
							label_23.setText("you get " + DamageTaken + " damage in retaliation");
							label_24.setText("your HP: " + PlayerHP);
							label_25.setText(Enemy + "'s HP: " + EnemyHP);
							if (EnemyHP < 1) {
								label_26.setText("you should loot the " + Enemy);
							}
							else {
								label_26.setText("");	
							}
							
							
							
		        		}
		        	
		        		else {
		        			label_26.setText("you broke the game");
		        		}
		        		
		        	
		        	}
		        
		        	else if(content.equals("flee")) {
		        		
		        		if (EnemyHP > 0) {
		        			
		        			label_20.setText("");
		        			label_21.setText("");
		        			label_22.setText("You fly away from " + Enemy +"!");
		        			if (rand.nextInt(100) < fleeDamageChance ) {// fleeing damage
		        				label_23.setText("but while fleeing the " + Enemy + " shot you in the back");
		        				DamageTaken = rand.nextInt(EnemieDP);
		        				PlayerHP -= DamageTaken;
		        				label_24.setText("you take " + DamageTaken + " damage");
		        				
		        				if (PlayerHP > 0) {
	
		        				}
		        				
		        				else {
		        					
		        					label_25.setText("you died while fleeing");
		        					label_26.setText("loser");
		        					diedFleeing = true;
		        				}
		        			}
		        			
		        			else {
		        				label_23.setText("");
		        				label_24.setText("");
		        				label_25.setText("");
		        				label_26.setText("");
		        			}
		        			
		        			if (diedFleeing == false) {
		        				
		        				
	        				EnemyHP = rand.nextInt(MaxEnemieHP);
	        				Enemy = Enemies [rand.nextInt(Enemies.length)];
		        				
		        			label_25.setText("a " + Enemy + " approaches you");
		        			label_26.setText(Enemy + "'s HP: " + EnemyHP);
		        			}
		        		}
		        		else {
		        			label_20.setText("");
		        			label_21.setText("");
		        			label_22.setText("");
		        			label_23.setText("");
		        			label_24.setText("");
		        			label_25.setText("");
		        			label_26.setText("You cant flee from a wreck");
		        		}
    					
		        	}
		        
		        	else if (content.equals("repair")||content.equals("heal")) {
		        		if (NumRepair > 0) {
							PlayerHP += HPRepair;
							NumRepair--;
							
							label_20.setText("");
							label_21.setText("");
							label_22.setText("");
							label_23.setText("");
							label_24.setText("you repaired your ship for " + HPRepair + "HP");
							label_25.setText("you now have " + PlayerHP + "HP");
							label_26.setText("you have " + NumRepair + " Repairs left");
	
						}
						else { //no repair kits left
							label_20.setText("");
							label_21.setText("");
							label_22.setText("");
							label_23.setText("");
							label_24.setText("");
							label_25.setText("");
							label_26.setText("you have no repairkits left!!!");
						}
		        		
		        		
		            
		        	}
		        
		        	else if(content.equals("penis")) {
		        		label_20.setText("");
						label_21.setText("");
						label_22.setText("");
						label_23.setText("");
						label_24.setText("");
						label_25.setText("");
						label_26.setText("PENIS");
		        		
		        	}
		        
		        	else if(content.equals("upgrade lazor")) {
		        		
		        		if (PlayerMoney > 0) {// enough money
							PlayerMoney--;
							PlayerDP++;
							label_20.setText("");
							label_21.setText("");
							label_22.setText("");
							label_23.setText("");
							label_24.setText("you upgrade your lazor");
							label_25.setText("with your upgraded lazor you now have " + PlayerDP + "DP");
							label_26.setText("you have " + PlayerMoney + " credits left");
						}
						else { // not enough money
							label_20.setText("");
							label_21.setText("");
							label_22.setText("");
							label_23.setText("");
							label_24.setText("");
							label_25.setText("");
							label_26.setText("you dont have enough credits to upgrade your lazor");
						}
		        		
		        		
		        	}
		        
		        	else if(content.equals("buy repairkit")) {
		        		
		        		if (PlayerMoney > 0) {// enough money
		    				PlayerMoney--;
		    				NumRepair++;
		    				
		    				label_20.setText("");
							label_21.setText("");
							label_22.setText("");
							label_23.setText("");
							label_24.setText("you buy a repairkit");
							label_25.setText("you now have" + NumRepair + " Repairkits");
							label_26.setText("you have " + PlayerMoney + " credits left");
		    				
		    				}
		    			else { //not enough money
		    				label_20.setText("");
							label_21.setText("");
							label_22.setText("");
							label_23.setText("");
							label_24.setText("");
							label_25.setText("");
							label_26.setText("you dont have enough credits to buy a repairkit");
		    			}
		        		
		        	}
		        	        
		        	else if(content.equals("")) {
    
		        	}
		        
		        	else if(content.equals("")) {
		            
		        	}
		        
		        	
		        	
		        
		        	else {
		        		label_20.setText("");
    					label_21.setText("");
    					label_22.setText("");
    					label_23.setText("");
    					label_24.setText("");
    					label_25.setText("");
    					label_26.setText("invalid command");
		        	}
		    	}
				
			}
		});
		textField.setBounds(10, 728, 720, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);	
	}

}
