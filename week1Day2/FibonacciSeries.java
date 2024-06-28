package week1Day2;

public class FibonacciSeries {

	public static void main(String[] args) {
     
		int n1=0, n2=1, sum=0;
		System.out.print(n1+" "+n2); //0 1
		for(int i=2; i<8; i++)
		{
			sum=n1+n2; //0+1 1+1  1+2 2+3 3+5
			System.out.print(" "+sum); //1 2 3 5 8 13
			n1=n2; // 5
			n2=sum; // 8
		}
	}

}
