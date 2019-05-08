//Nathan Frazier P686 #49
package inheritancepractice;

public class VehicleClient {

	public static void main(String[] args) {
		
		Bicycle mybike = new Bicycle("Joe", 2);
		MotorVehicle batmobile = new MotorVehicle("Batman", 6, 8.0);
		double HP = batmobile.countHorses();
		System.out.println(mybike.toString());
		System.out.println(batmobile.toString());

	}

}
