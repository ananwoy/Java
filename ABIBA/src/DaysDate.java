import java.util.*;
public class DaysDate {
static int countDays(int dd, int mm, int yy)
{
	int days=0;
	int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	for (int i = 1; i < mm; i++) {
		days=days+month[i];
	}
	days=days+(yy/4+yy/400-yy/100);
	days=days+(yy-1)*365;
	days=days+dd;
	if(mm>2&&yy%4==0)
		days=days+1;
	return days;
}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter date, month, year");
	int d1=scn.nextInt();
	int m1=scn.nextInt();
	int y1=scn.nextInt();
	System.out.println("Enter date, month, year");
	int d2=scn.nextInt();
	int m2=scn.nextInt();
	int y2=scn.nextInt();
	int x=countDays(d1, m1, y1)-countDays(d2, m2, y2);
	System.out.println("Days between both dates are: "+x);
}
}
