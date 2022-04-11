
public class StatisticsTest {

	public static void main(String[] args) {
		Statistics statistics=new Statistics();
		
		float avg0=statistics.average();
		float avg1=statistics.average(100);
		float avg2=statistics.average(100,200);
		
		System.out.println("Average with no argument: "+avg0);
		System.out.println("Average of 100 is : "+avg1);
		System.out.println("Average of 100 and 200 is : "+avg2);

	}

}
