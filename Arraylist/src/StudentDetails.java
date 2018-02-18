import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentDetails {
int sid;
String name;
int m1,m2,m3,m4;
int total;
double per;
public StudentDetails(int sid, String name, int m1, int m2, int m3, int m4)
{
	this.sid=sid;
	this.name=name;
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	this.m4=m4;
	total=m1+m2+m3+m4;
	per=total/4.0;
}
String getResult()
{
	if(m1<35||m2<35||m3<35||m4<35)
	{
		return "FAIL";
	}
	if(per>=85)
	{
		return "DISTINCTION";
	}
	if(per>=60)
	{
		return "FIRST CLASS";
	}
	if(per>=50)
	{
		return "SECOND CLASS";
	}
	return "PASS";
}
@Override
public String toString() {
	return "StudentDetails [sid=" + sid + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4
			+ ", total=" + total + ", per=" + per + "]";
}
static StudentDetails readStudent()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the id");
	int id=sc.nextInt();
	System.out.println("Enter the name");
	String name=sc.next();
	System.out.println("Enter 4 subject marks");
	int m1=sc.nextInt();
	int m2=sc.nextInt();
	int m3=sc.nextInt();
	int m4=sc.nextInt();
	return new StudentDetails(id, name, m1, m2, m3, m4);
}
public static void main(String[] args) {
	ArrayList stdlist=new ArrayList(5);
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("1. add student details:");
		System.out.println("2. display Student details:");
		System.out.println("3. search student details:");
		System.out.println("4. delete student by id:");
		System.out.println("5. display student in range:");
		System.out.println("6. exit:");
		System.out.println("enter the choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			StudentDetails std=StudentDetails.readStudent();
			stdlist.add(std);
			break;
		case 2:
			System.out.println("--Student Result Sheet--");
			for (Object obj : stdlist) {
				System.out.println(obj);
			}
			System.out.println("--------------------");
			break;
		case 3:
			System.out.println("Enter the id:");
			int id=sc.nextInt();
			Iterator it=stdlist.iterator();
			int find=0;
			while(it.hasNext())
			{
				Object obj=it.next();
				StudentDetails s=(StudentDetails)obj;
				if(s.sid==id)
				{
					System.out.println("your searched result");
					System.out.println(s);
					find=1;
					break;
				}
			}
			if(find==0)
				System.out.println("Students doesnt exist");
				break;
		case 4:
			System.out.println("Enter the student id");
			int eid=sc.nextInt();
			for (Object obj : stdlist) {
				StudentDetails s=(StudentDetails)obj;
			if(s.sid==eid)
			{
				stdlist.remove(s);
				System.out.println("............");
				break;
			}
			}
			break;
		case 5:
			System.out.println("Enter the range:");
			double spr=sc.nextDouble();
			double epr=sc.nextDouble();
			Iterator itt=stdlist.iterator();
			while(itt.hasNext())
			{
				StudentDetails s=(StudentDetails)itt.next();
				if(s.per>=spr&&s.per<=epr)
					System.out.println(s);
			break;	
			}
		case 6:
			return;
		default:
			break;
		}
		
	}
}
}
