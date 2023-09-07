package Oops_concept;

public class String_manipulation {

	public static void main(String[] args) {
		String_manipulation gm = new String_manipulation();
	    //gm.homework();
		//gm.homework1();
	   //gm.homework3();
	   //gm.homework4();
		//gm.homework5();
		//gm.uppercase();
		//gm.lowercase();
		//gm.stripleading(); //first space
		//gm.striptralling(); //last space
		//gm.trim(); //double space  remove
		//gm.contains(); //contant irukany cheak 
		//gm.substrings();// latter remove
		//gm.StartsWith(); // first litter cheack
		//gm.endswith(); // last latter 
		//gm.split(); //     in put latter remove
		//gm.value_of();
		//to_lower();
		//to_upper();
		//onenext_letter_captial();
		//first_mid_last();
		//name_first_letter();
		//name_latter();
		name();
	}

	private static void name() {
		String s1 =  "alraj deen ajmail";
		for ( int i =0;i< s1.length();i++) {
			if (i==0|| s1.charAt(i-1)==' ') { 
			System.out.print((char)(s1.charAt(i)-32));	
			}
			else {
				System.out.print(s1.charAt(i));
			}}}

	private static void name_latter() {
		String s =  "alraj deen ajmail";
	    for(int i=0;i< s.length();i++)   {
	    char ch = s.charAt(i);
	    if(i==0 || i== s.length()-1)                   {
	      if(ch>='a' && ch<='z')
	        System.out.print((char)(ch-32));}
	    else if(ch==' ')             {
	      System.out.print(ch);
	      i++; 
	      ch = s.charAt(i);
	      if(ch>='a' && ch<='z')
	        System.out.print((char)(ch-32));}    
	    else
	    {
	      int j = i+1; 
	      if(j<s.length() && s.charAt(j)==' ')
	      {
	        if(ch>='a' && ch<='z')
	          System.out.print((char)(ch-32));
	       
	      }
	      else
	        System.out.print(ch);
	    }
	    }
		
	}

	private static void name_first_letter() {
String s = "alraj deen ajmail";
        for (int i = 0; i < s.length(); i++) 
        {
          char ch = s.charAt(i);      
            if(i==0) 
            {
            if(ch>='a' && ch<='z')
            System.out.print((char)(ch-32));
            }
          else if(ch == ' ')
          {
            System.out.print(ch);
            i++;
           ch = s.charAt(i);
          if(ch>='a' && ch<='z')
            System.out.print((char)(ch-32));}
          else
            System.out.print(ch);
        }}
 				
	private static void first_mid_last() {
		String s ="alrajdeen";                 // to upper case
 		for (int i =0;i<s.length();i++) {
 			char ch = s.charAt(i);
 			if (i==0 ||i ==s.length()-1||i ==s.length()/2) {
 			if (ch>='a'&&ch<='z') 
 				System.out.print((char)(ch-32));
 			}
 				else 
 					System.out.print(ch);
 			}
 					
 					
	}

	private static void onenext_letter_captial() {
		String s ="alrajdeen";                 // to upper case
 		for (int i =0;i<s.length();i++) {
 			char ch = s.charAt(i);
 			if (i%2==0) {
 			if (ch>='a'&&ch<='z') 
 				System.out.print((char)(ch-32));
 			}
 				else 
 					System.out.print(ch);
 			
 					
 				}		
	}

	private static void to_upper() {
		String s ="A B C D E";                 // to upper case
 		for (int i =0;i<s.length();i++) {
 			char ch = s.charAt(i);
 			if (ch>='a'&&ch<='z') 
 				System.out.println((char)(ch-32));
 				else 
 					System.out.println(ch);
 					
 				}
	}

	private static void to_lower() {                 // to lower case
 		String s ="A B C D E";
 		for (int i =0;i<s.length();i++) {
 			char ch = s.charAt(i);
 			if (ch>='A'&&ch<='z') 
 				System.out.println((char)(ch+32));
 				else 
 					System.out.println(ch);
 					
 				}
 			}
 		
	

	private void value_of() {
 String a = String.valueOf(10);
 String b = String.valueOf(20);
 System.out.println(a+b);
	}

	private void split() {
		String name = "alrajdeen";
		String s[] = name.split("l");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

	}

	private void endswith() {
		String name = "alrajdeen  ajmal rasith";
		boolean ends = name.endsWith("rasith");
		System.out.println(ends);

	}

	private void StartsWith() {
		String name = "alrajdeen  ajmal rasith";
		boolean ends = name.startsWith("ajaml");
		System.out.println(ends);
	}

	private void substrings() {
		String name = " alrajdeen";
		name = name.substring(1, 4);
		System.out.println(name);
	}

	private void contains() {
		String str = " hi how Are you aj  ";
		System.out.println(str.contains(" hi"));
	}

	private void trim() {
		String str = "   hi how Are you aj     ";
		// System.out.println(str);
		str = str.trim();
		System.out.println(str);
	}

	private void striptralling() {
		String str = "hi how Are you aj     ";
		// System.out.println(str);
		str = str.stripTrailing();
		System.out.println(str);

	}

	private void stripleading() {
		String str = "   hi how Are you aj  ";
		// System.out.println(str);
		str = str.stripLeading();
		System.out.println(str);
	}

	private void lowercase() {
		String name = "ALRAjdEEn";
		System.out.println(name.toLowerCase());

	}

	private void uppercase() {
		String name = "alrajdeen";
		System.out.println(name.toUpperCase());

	}

	private void homework5() {

		int a[] = { 7, 1, 11, 9, 0, 2, 6, 4, 3, 5, 1, 9, 59, 88, };
		System.out.println("First Element" + a[0]);
		System.out.println("Last Element" + a[a.length - 1]);
		// even logic->mid element
		if (a.length % 2 == 0) {
			System.out.println("Middle element" + a[a.length / 2]);// add number
			System.out.println("Middle element" + a[a.length / 2 - 1]);
		} else
		// odd logic->one mid element
		{
			System.out.println("Middle element" + a[a.length / 2]);// even number
		}

	}

	private void homework4() {
		String s = "java";
		char search = 'a';
		char c[] = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
			if (c[i] == search) {
				System.out.println("a is found");
			}
			// else

			// System.out.println("a not is found");
		}
	}

	private void homework3() {
		int a[] = { 7, 1, 9, 0, 2, 6, 4, 3, 5, 1, 9, 132 };
		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				if (a[i] % 2 != 0)
					;
				System.out.println("add number" + (a[i]));
			}

		}

	}

	private void homework1() {
		int a[] = { 7, 1, 9, 0, 2, 6, 4, 3, 5, 1, 9, 7 };
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				if (a[i] % 2 == 0)
					;
				System.out.println("Even number" + (a[i]));
			}

		}

	}

	private void homework() {
		int a[] = { 7, 1, 9, 0, 2, 6, 4, 3, 5, 1, 9, 7 };
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= a.length; i++) {
			sum = sum + i;
			count++;

		}
		System.out.println("sum is" + sum);
		System.out.println("count is" + count);
		System.out.println("avg is" + count / a.length);

	}
}
