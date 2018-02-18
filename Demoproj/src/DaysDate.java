import java.util.Scanner;

public class DaysDate {
int dd,mm,yy;
int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
DaysDate(int dd, int mm, int yy)
{
	this.dd=dd;
	this.mm=mm;
	this.yy=yy;
}

int numberOfDays()
{
	int days=dd;
	int y=yy-1;
	days+=y*365+(y/4-y/100+y/400);
	for (int i = 0; i < mm; i++) {
		days=days+month[i];
	}
	if(mm>2&&(yy%4==0&&yy%100!=0||y%400==0))
			days=days+1;
		
return days;
}public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first date dd mm yy");
	DaysDate d1= new DaysDate(sc.nextInt(),sc.nextInt(),sc.nextInt());
	System.out.println("enter second date dd mm yy");
	DaysDate d2= new DaysDate(sc.nextInt(),sc.nextInt(),sc.nextInt());
	int x=d2.numberOfDays()-d1.numberOfDays();
	System.out.println("no of days are:" +x);
}
}
