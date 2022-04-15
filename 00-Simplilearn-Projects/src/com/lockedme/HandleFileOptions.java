package com.lockedme;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class HandleFileOptions extends FileOperations{
	
	
	public static void handleWelcomeScreenInput(String folderName) {
		boolean running = true;
		Scanner sc = new Scanner(System.in);

		do {
			try {
				MenuOptions.displayFileMenu();
				int input = sc.nextInt();
				switch (input) {
				case 1:
					//display files in folder
					FileOperations.displayAllFiles(folderName);
					break;
				case 2:
					//go to add or delete or search file menu option
					HandleFileOptions.handleFileMenuOptions(folderName);
					break;
				case 3:
					//specify folder location again
					return;
				case 4:
					//exit program
					System.out.println("\nThe program is been exited successfully.\n");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("\nPlease select the appropriate  option from the above.\n");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput(folderName);
			} 
		} while (running == true);
	}

	public static void handleFileMenuOptions(String folderName) {
		boolean running = true;
		Scanner sc = new Scanner(System.in);

		do {
			try {
				MenuOptions.displayFileMenuOptions();
				int input = sc.nextInt();
				switch (input) {
				case 1:
					// file add to the main folder.
					System.out.println("\nEnter the name of the file to be added to:\n"+folderName+
							"\nEg.abc.txt\n");
					String fileToAdd = sc.next();
					Path tempPath=Paths.get(folderName+fileToAdd);
					if(Files.exists(tempPath)) {
						System.out.println("File already exist.");
					FileOperations.writeFile(folderName,fileToAdd,sc);	
					}else {
					FileOperations.createFile(folderName,fileToAdd,sc);
					}
					
					break;
				case 2:
					// File to be deleted from folder.
					FileOperations.displayAllFiles(folderName);
					
					System.out.println("\nAbove is a list of available files to delete from:\n"+folderName
							+ "\nWith reference to above list, Enter the name of the file to deleted\n" );
					
					String fileToDelete= sc.next();
					
					FileOperations.deleteFileRecursively(folderName,fileToDelete);

					break;
				case 3:
					// File to be searched from folder.
					System.out.println("\nEnter the name of the file to be searched from \n"+folderName+"\n");
					String fileName = sc.next();
					
					FileOperations.displayFileLocations(fileName, folderName);

					
					break;
				case 4:
					// Go to Previous menu
					return;
				case 5:
					// Exit
					System.out.println("\nThe program is been exited successfully.\n");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("\nPlease select a valid option from above.\n");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleFileMenuOptions(folderName);
			}
		} while (running == true);
	}}
	
