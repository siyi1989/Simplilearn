package com.lockedme;

import java.io.BufferedReader;
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class HandleFolderOptions extends FileOperations{

	
	public static void handleFolderInput() {
		boolean running = true;
		do {
			try {
				MenuOptions.displayFolderMenu();
					// user specified folder.
					System.out.println("\nEnter a valid folder path:"+ 
					"\nEg. D\\User\\Documents\\");
					String folderName = getFolderName();
					if(folderName.endsWith("\\")) {
					File file = new File(folderName);
					// If folder doesn't exist, ask user if should create
						if (!file.exists()) {
						HandleFolderOptions.handleFolderMenuOptions(folderName);
					} 	else {
						HandleFileOptions.handleWelcomeScreenInput(folderName);
					}
						
					}else {System.out.println("\nFilepath should end with \\. Please try again");
					handleFolderInput();
						
					}
			}
					catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleFolderInput();
			} 
		} while (running == true);
	}

	public static void handleFolderMenuOptions(String folderName) {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuOptions.displayFolderMenuOptions();
				
				int input = sc.nextInt();
				switch (input) {
				case 1:
					// Specify folder path again
					MenuOptions.displayFolderMenu();
					
					break;
				case 2:
					// create folder
					FileOperations.createFolderIfNotPresent(folderName);
					
					break;

				case 3:
					// Exit
					System.out.println("\nThe program is been exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("\nPlease select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleFolderMenuOptions(folderName);
			}
		} while (running == true);
	}
}
