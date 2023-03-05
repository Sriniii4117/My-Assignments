package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int sum=0;
		int n=11;
		int firstnum=0;
		int secondnum=1;
		
		for (int i=1; i<=n; i++) {
			System.out.println(firstnum);
			sum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=sum;
			
		}
			

	}

}
