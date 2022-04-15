package com.lockedme;

public class MenuOptions {

	public static void printWelcomeScreen(String appName, String developerName) {
		String companyDetails = String.format("**************************************************************\n"
				+ "** Welcome to %s.com. \n" + "** This application was developed by %s.\n"
				+ "**************************************************************\n", appName, developerName);
		String appFunction = "You can use this application to :-\n"
				+ "• Retrieve all file names in the user specified folder\n"
				+ "• Search, add, or delete files in user specified folder.\n";
	
		System.out.println(companyDetails);

		System.out.println(appFunction);
	}
	
	public static void displayFolderMenu() {
		String foldermenu ="\n****** Please provide the path of folder to work on ******"
				 +"\n******Reminder:Input \\ at the end of folder path******";
		System.out.println(foldermenu);

	}
	
	public static void displayFolderMenuOptions() {
		String folderOptions ="\n****** Folder specified does not exist. Select any option number from below and press Enter ******\n\n"
				+ "\n1) Specify a different folder path" +"\n2) Create folder path"+"\n3) Exit program\n";
		System.out.println(folderOptions);

	}

	public static void displayFileMenu() {
		String menu = "\n****** Select any option number from below and press Enter ******\n"
				+ "\n1) Retrieve all files inside folder" + "\n2) Display menu for File operations"
				+ "\n3) Show Previous Menu"+"\n4) Exit program\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n* Select any option number from below and press Enter *\n\n"
				+ "\n1) Add a file to folder" + "\n2) Delete file in folder"
				+ "\n3) Search for a file from folder" + "\n4) Show Previous Menu" + "\n5) Exit program\n";

		System.out.println(fileMenu);
	}

}
