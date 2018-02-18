//write a java program to define a method to convert octal to binary, bin to hex, hex to bin, octal to hex
import java.util.Scanner;
public class OctToBinary {
static int octToDec(int x)
{
	int b; int p=0; int sum=0;
	while(x>0)
	{
		b=x%10;
		sum=sum+b*power(8,p);
		p++;
		x=x/10;
	}
	
}

}
