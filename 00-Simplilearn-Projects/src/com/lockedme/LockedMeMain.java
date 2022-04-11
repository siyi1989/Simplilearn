package com.lockedme;

public class LockedMeMain {

	public static void main(String[] args) {
		
		// Create "main" folder if it is not been present in current folder structure.
		MenuOptions.printWelcomeScreen("LockedMe", "Lim Si Yi");
		
		HandleFolderOptions.handleFolderInput();
				
	}

	
}
