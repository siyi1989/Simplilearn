package com.lockedme;

public class MenuOptions {

	public static void printWelcomeScreen(String appName, String developerName) {
		String companyDetails = String.format("**************************************************************\n"
				+ "** Welcome to %s.com. \n" + "** This application was developed by %s.\n"
				+ "**************************************************************\n", appName, developerName);
		String appFunction = "You can use this application to :-\n"
				+ "• Retrieve all file names in the user specified folder\n"
				+ "• Search, add, or delete files in user specified folder.\n"
				+ "\n**Please be careful to ensure the correct filename is provided for searching or deleting files.**\n";
		System.out.println(companyDetails);

		System.out.println(appFunction);
	}
	
	public static void displayFolderMenu() {
		String foldermenu ="\n\n****** Please provide the path of folder to work on ******\n\n";
		System.out.println(foldermenu);

	}
	
	public static void displayFolderMenuOptions() {
		String folderOptions ="\n\n****** Folder specified does not exist. Select any option number from below and press Enter ******\n\n"
				+ "1) Specify a different folder path\n" +"2) Create folder path\n"+"3) Exit program\n";
		System.out.println(folderOptions);

	}

	public static void displayFileMenu() {
		String menu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Retrieve all files inside folder\n" + "2) Display menu for File operations\n"
				+ "3) Exit program\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n* Select any option number from below and press Enter *\n\n"
				+ "1) Add a file to folder\n" + "2) Delete a file from folder\n"
				+ "3) Search for a file from folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

		System.out.println(fileMenu);
	}

}
