
public class Conductor {
Ticket gvTicket(Money mo){
	Ticket t = new Ticket();
	t.amount = mo.value;
	t.date = "17 nov 2017";
	System.out.println("conductor isses ticket");
	return t;
}
}
