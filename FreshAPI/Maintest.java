//Nathan Frazier
public class Maintest {

	public static void main(String[] args) {
		System.out.println("Running Maintest");
		System.out.println("Creating ticket API request...");
		TicketReq ticketrequest = new TicketReq();
		System.out.println("Instance is using API : " + ticketrequest.api);
		System.out.println("Attempting to authorize...");
		ticketrequest.authorize();
	} 

}
