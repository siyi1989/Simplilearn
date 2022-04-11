package com.lockedme;

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
					FileOperations.displayAllFiles(folderName);
					break;
				case 2:
					HandleFileOptions.handleFileMenuOptions(folderName);
					break;
				case 3:
					System.out.println(" The program is been exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select the appropriate  option from the above.");
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
					System.out.println("Enter the name of the file to be added to:\n"+folderName);
					String fileToAdd = sc.next();
					
					FileOperations.createFile(folderName,fileToAdd, sc);
					
					break;
				case 2:
					// File which is to be deleted from folder.
					System.out.println("Enter the name of the file to be deleted from:\n"+folderName);
					String fileToDelete = sc.next();
					
					List<String> filesToDelete = FileOperations.displayFileLocations(fileToDelete, folderName);
					
					String deletionPrompt = "\nSelect index of which ever  file to delete?"
							+ "\n(Enter 0 if you want to delete all the elements)";
					System.out.println(deletionPrompt);
				
					int idx = sc.nextInt();
					
					if (idx != 0) {
						FileOperations.deleteFileRecursively(filesToDelete.get(idx - 1));
					} else {
						
						// If idx == 0, delete all the  files displayed for the name.
						for (String path : filesToDelete) {
							FileOperations.deleteFileRecursively(path);
						}
					}
					

					break;
				case 3:
					// File to be searched from folder.
					System.out.println("Enter the name of the file to be searched from \n"+folderName);
					String fileName = sc.next();
					
					FileOperations.displayFileLocations(fileName, folderName);

					
					break;
				case 4:
					// Go to Previous menu
					return;
				case 5:
					// Exit
					System.out.println(" The program is been exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleFileMenuOptions(folderName);
			}
		} while (running == true);
	}
}
