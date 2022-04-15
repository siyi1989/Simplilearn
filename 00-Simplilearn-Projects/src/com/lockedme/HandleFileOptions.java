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
					System.out.println("\nThe program is been exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("\nPlease select the appropriate  option from the above.");
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
					
					if(!validateStringFilenameUsingRegex(fileToAdd)) {
						FileOperations.createFile(folderName,fileToAdd, sc);
					}else {
						System.out.println("\nFilename provided contains invalid characters. Please try again.");
						handleFileMenuOptions(folderName);
					}
					
					
					break;
				case 2:
					// File which is to be deleted from folder.
					handleFileDeleteOptions(folderName);
					

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
	}
	
	public static void handleFileDeleteOptions(String folderName) {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuOptions.displayDeletionOptions();
				
				int input = sc.nextInt();
				switch (input) {
				case 1:
					// File delete by specifying filename
					System.out.println("\nEnter the name of the file to be deleted from:\n"+folderName+
							"\nEg.Abc.txt ****Note: Filename is case sensitive");
					String fileToDelete = sc.next();
					FileOperations.deleteFile(folderName,fileToDelete, sc);
					
					break;
				case 2:
					// File delete by index	
					
					String deletionPrompt = "\nSelect index of file to delete from above list?"
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
					// Go to Previous menu
					return;
				case 4:
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
				handleFileDeleteOptions(folderName);
			}
		} while (running == true);
	}
}
