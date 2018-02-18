package bank;

public class MainRunner {
public static void main(String[] args) {
Bank bk[]= {new SBI(12.5),new AxisBank(13), new UnionBank(11.9), new CanaraBank(11.5), new HDFCBank(13.5)};
Bank high=higehstInterest(bk);
Bank low=lowestInterest(bk);
System.out.println("-------All Banks Interest Rates Info------");
for (int i = 0; i < bk.length; i++) {
	System.out.println(bk[i]);
}
System.out.println("\n\nHighest interest is: " +high);
System.out.println("Lowest interest is: " +low);
}
private static Bank higehstInterest(Bank[] bk2) {
	Bank bg=bk2[0];
	for (int i = 1; i < bk2.length; i++) {
	if(bg.getInterest()<bk2[i].getInterest())
		bg=bk2[i];
}
	return bg;
}
private static Bank lowestInterest(Bank[] bk2) {
	Bank bg=bk2[0];
	for (int i = 1; i < bk2.length; i++) {
	if(bg.getInterest()>bk2[i].getInterest())
		bg=bk2[i];
}
	return bg;
}
}
