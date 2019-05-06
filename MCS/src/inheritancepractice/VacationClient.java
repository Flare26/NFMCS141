//Nathan Frazier P687 #52
package inheritancepractice;

public class VacationClient {

	public static void main(String [] args)
	{
		//Vacation vacation = new Vacation(); cannot instance an abstract class
		All_Inclusive myTrip = new All_Inclusive(1000, "Hawaii", "United", 4, 375 );
		double [] mycosts = new double [] {12.34, 45.67, 22.22, 50.00};
		String [] myitems =
				new String []
						{"Lunch 1/1/19",
						"Tip 1/1/19",
						"Dinner 1/2/19",
						"Excursion 1/4/19",
						"Train trip 1/5/19"};
		Piecemeal secondTrip = new Piecemeal(500, "Denver", myitems, mycosts);
		System.out.println(myTrip);
		System.out.println(secondTrip);
		
		}
	}

