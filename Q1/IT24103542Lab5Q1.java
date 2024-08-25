import java.util.Scanner;

public class IT24103542Lab5Q1{
	public static void main(String[] args){
 
	int no1;
	int no2;
	int no3;
	int min;
	int max;
	
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the first integer: ");
	no1 = sc.nextInt();
	System.out.print("Enter the second integer: ");
	no2 = sc.nextInt();
	System.out.print("Enter the third integer: ");
	no3 = sc.nextInt();

	System.out.println("");

	System.out.println("User entered numbers are: "+no1+" "+no2+" "+no3);

	if (no1>no2){
		max=no1;
		min=no2;
	}

	else{
		max=no2;
		min=no1;
	}

	if(no3>max){
		max=no3;
	}

	else if(no3<min){
		min=no3;
	}
	
	System.out.println("The Smallest number is: "+min);
	System.out.println("The Largest number is: "+max);	
	
	}
}