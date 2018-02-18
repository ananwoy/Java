
public class Customer {
	String name="Guldu";
void purchase()
{
	Shop s=new Shop();
	Product p=s.tshirt();
	System.out.println("customer purchased product");
	System.out.println("Product details:");
	System.out.println(p.price );
}public static void main(String[] args) {
	Customer c=new Customer();
	c.purchase();
}
}
