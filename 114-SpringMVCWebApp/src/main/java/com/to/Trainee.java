package com.to;

public class Trainee {

	public String traineeName;
	public int marksScored;
	public int contactNumber;
	
	
	public Trainee(String traineeName, int marksScored, int contactNumber) {
		super();
		this.traineeName = traineeName;
		this.marksScored = marksScored;
		this.contactNumber = contactNumber;
	}


	@Override
	public String toString() {
		return "Trainee [traineeName=" + traineeName + ", marksScored=" + marksScored + ", contactNumber="
				+ contactNumber + "]";
	}

public Trainee() {
	
}

	public String getTraineeName() {
		return traineeName;
	}


	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}


	public int getMarksScored() {
		return marksScored;
	}


	public void setMarksScored(int marksScored) {
		this.marksScored = marksScored;
	}


	public int getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}


}
