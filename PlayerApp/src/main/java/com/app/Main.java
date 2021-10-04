package com.app;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.app.dao.PlayerDAO;
import com.app.dao.impl.PlayerDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class Main {
	private static Logger log = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		log.info("Hello Friends! WELCOME TO ANSHU SONI PLAYER APP");
		log.info("==============================================");
		int ch = 0;
		do {
			log.info("\nWhat do you wish to do today? ");
			log.info("Press 1-To create a player");
			log.info("Press 2-To update a player");
			log.info("Press 3-To delete a player");
			log.info("Press 4-To search a player using different filters");
			log.info("Press 5-To display all players");
			log.info("Press 6-To exit");
			ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1:
				log.info("creating under process");

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				int option=0;
				log.info(
						"Welcome to Player Search Menu....Search a player by various filters by using below options: ");
				log.info("1) by Player Id");
				log.info("2) by Player Name");
				log.info("3) by Player Age");
				log.info("4) by Player City");
				log.info("5) by Player Gender");
				log.info("6) by Player sportsname");
				log.info("7) by Player teamid");
				log.info("8) go back to main menu");
				log.info("Please enter 1-8");
				try {
					option=Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
				}
				switch(option){
				case 1:log.info("Enter a Player id: ");
					   int id=Integer.parseInt(sc.nextLine());
					   PlayerDAO playerdao=new PlayerDAOImpl();
					   try {
						Player player=playerdao.getPlayerById(id);
					} catch (BusinessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					   
					
					
					
					

					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 5:

					break;
				case 6:

					break;
				case 7:

					break;
				case 8:

					break;

				}

				break;
			case 5:

				break;
			case 6:
				log.info("Thank you for using this app,We will see you soon");
				break;
			default:

				break;
			}
		} while (ch != 6);
	}
}
