package Oops_concept;

public class Prime_number {
	int Prime_count=0;
	public static void main(String[] args) {    //no=2	.no-3 
	Prime_number pp = new Prime_number ();
	pp.find_Prime(2);                                      //first 5 number prime method
	}
	void find_Prime(int no) {
	int div=2;
	int count=0;
	
	while  (div<= no/2){
		if (no%div==0)  //2%2=1 
		{
			count++;
			
		}
		div=div+1;
		if (count==0);
		System.out.println("PRIME");
		if (count==0);
		{
			System.out.println(no +" "+"PRIME");
			Prime_count++;
		}
		if (Prime_count<5);
	}
	no=no+1;
	find_Prime(no);
	}
		
	
		
	
    
    
    
    
	

	}


