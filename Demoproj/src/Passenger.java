
public class Passenger {
void takeTicket()
{
	Conductor c=new Conductor();
	Money m=new Money();
	Ticket t=c.gvTicket(m);
	System.out.println("passenger got ticket");
	
}
public static void main(String[] args) {
	Passenger p=new Passenger();
	p.takeTicket();
}
}
