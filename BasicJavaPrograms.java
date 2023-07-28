HELLO WORLD:

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
---------------------------------------------------------
Replacing a value in variable:

public class Java {
   public static void main(String[] args)
    {
       int num = 19;
       num = 15;
     System.out.println(num);
    }
}
--------------------------------------------------------
Operators (Arithmetic):

public class Java{
	public static void main(String[] args) 
	{
	int m=5, n=2;
	int sum=m+n;
	int sub=m-n;
	int mul=m*n;
	double div=(double)m/n;
	int mod=m%n;
	
	System.out.println(sum);
	System.out.println(sub);
	System.out.println(mul);
	System.out.println(div);
	System.out.println(mod);
	
    }	
}
-------------------------------------------------------
Operators (Post and Pre Increment operators)

public class Java{
	public static void main(String[] args) 
	{
	int m=5;
	int n=2;
	
	//n=m+n; 
	//n+=m; -----assignment operator.
	//m=n;
	//m=++n;
	m=n++;
	
	System.out.println(m);
	System.out.println(n);
	
    }	
}
---------------------------------------------------------
If else statements:
Finding a number is even or odd:
public class Java{
	public static void main(String[] args) 
	{
		int n=2;
	if(n%2==0) {
	     System.out.println("Even");
	 }
	else {
	     System.out.println("Odd");
    }	

	}
}
              (OR)

public class Java{
	public static void main(String[] args) 
	{
		int m=0;
		
		if(m==0)
		{
			System.out.println("Nothing bye");
		}
		else if(m%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}			  
------------------------------------------------------------
Terinary Operator:
//?:---> condition? exp1 : exp2
public class Java{
	public static void main(String[] args) 
	{
	int i=9;
	int j=1;
	
	//if (i>5)
		//j=2;
	//else
		//j=5;
	j = i>5?2:6;
		System.out.println(j);
	}
}
------------------------------------------------------------
SWITCH Case :
public class Java{
	public static void main(String[] args) 
	{
	int n =7;
	
	switch(n) {
	case (1):
		System.out.println("MONDAY");
	break;
	case (2):
		System.out.println("TUESDAY");
	break;
	case (3):
		System.out.println("WEDNESDAY");
	break;
	case (4):
		System.out.println("THRUSDAY");
	break;
	case (5):
		System.out.println("FRIDAY");
	break;
	case (6):
		System.out.println("SATURDAY");
	break;
	case (7):
		System.out.println("SUNDAY");
	break;
	default:
		System.out.println("NOT MATCHED");
		
	}
	}
}
----------------------------------------------------------
ITERATION:
WHILE:
public class Java{
    public static void main(String[] args) {
    	int i = 1;
    	while(i<=5)
    	{
    		System.out.println("Hello");
    		i++;
    	}
    }
}
Do-While:
public class Java{
    public static void main(String[] args) {
    	int i = 9;
    	do
    	{
    		System.out.println("Hello");
    		i++;
    	}while(i<=5);
    }
}
For:
public class Java{
    public static void main(String[] args) {
    	
    	for(int i=1;i<=7;i++) {
    		
    		System.out.println("Hello");
    	}
    		
    }
}
---------------------------------------
Nested Loop:-(Patterns)
Star:-
public class Java {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
Numbers:-
public class Java {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
-----------------------------------------------------------
To print days of the week:
package JavaProject;

public class Java {
	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			System.out.print(i + " ");
			switch (i) {
			
			case (1):
				System.out.println("SUNDAY");
				break;
			case (2):
				System.out.println("MONDAY");
				break;
			case (3):
				System.out.println("TUESDAY");
				break;
			case (4):
				System.out.println("WEDNESDAY");
				break;
			case (5):
				System.out.println("THRUSDAY");
				break;
			case (6):
				System.out.println("FRIDAY");
				break;
			case (7):
				System.out.println("SATURDAY");
				break;
			default:
				System.out.println("No Match");
			}
			for (int j = 0; j <= 24; j++) {

			}
			System.out.println();
		}
	}
}
--------------------------------------------
Break and Continue:
break:
public class Java {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i>5) {
				break;
			}
			System.out.println(i);
		}
		
	}
}
------
continue:
public class Java {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		
	}
}
-----------------------------------------------
