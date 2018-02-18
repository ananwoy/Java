public class ColnRowBiggestEle {
static void checkBig(int a[][])
{
	for (int i = 0; i < a.length; i++) {
		int rbig=a[i][0], cbig=a[0][i];
		for (int j = 0; j < a.length; j++) {
			if (rbig<a[i][j])
				rbig=a[i][j];
			if(cbig<a[j][i])
				cbig=a[j][i];
		}
		System.out.println(i+1+" row biggest element "+ rbig);
		System.out.println(i+1+" coloum biggest element "+cbig);
	}
}
public static void main(String[] args) {
	int a[][]= {{3,5,7},{8,9,2},{1,6,4}};
	checkBig(a);
}}
