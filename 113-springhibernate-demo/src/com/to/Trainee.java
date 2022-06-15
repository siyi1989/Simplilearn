package com.to;

import javax.persistence.*;

@Entity
@Table
public class Trainee {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int traineeId;
		private String traineeName;
		private double marksScored;
		private long contactNumber;
		
		public Trainee(){
			
		}

		public int getTraineeId() {
			return traineeId;
		}

		public void setTraineeId(int traineeId) {
			this.traineeId = traineeId;
		}

		public String getTraineeName() {
			return traineeName;
		}

		public void setTraineeName(String traineeName) {
			this.traineeName = traineeName;
		}

		public double getMarksScored() {
			return marksScored;
		}

		public void setMarksScored(double marksScored) {
			this.marksScored = marksScored;
		}

		public long getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(long contactNumber) {
			this.contactNumber = contactNumber;
		}

		@Override
		public String toString() {
			return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", marksScored=" + marksScored
					+ ", contactNumber=" + contactNumber + "]";
		}

		public Trainee(String traineeName, double marksScored, long contactNumber) {
			super();
			this.traineeName = traineeName;
			this.marksScored = marksScored;
			this.contactNumber = contactNumber;
		}
		
		
		
}
