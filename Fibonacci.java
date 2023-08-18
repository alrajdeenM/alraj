package Oops_concept;

public class Fibonacci {
int count=0;
	public static void main(String[] args) {
	Fibonacci fibo = new Fibonacci();
	fibo.print_fibo(0,1);
	
;			// TODO Auto-generated method stub

	}

	private void print_fibo(int first, int second) {
		int count =1;
	while(count<=13)
		System.out.println(first+"'");
		int third = first + second;
		first = second;
		second=first + second;
		count++;
		
		
		// TODO Auto-generated method stub
		
	}

}
