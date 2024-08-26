import java.util.Scanner;

public class IT24103542Lab5Q3{
	public static void main(String[] args){
 
	int start_date, end_date, no_of_days;
	double room_charge_per_day=48000;
	double amount_without_discount;
	double total_amount_1;
	double total_amount_2;

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Start Date(1-31): ");
	start_date = input.nextInt();
	System.out.print("Enter End Date(1-31): ");
	end_date = input.nextInt();
	System.out.println(" ");

	no_of_days = end_date - start_date;
	amount_without_discount = room_charge_per_day * no_of_days;
	total_amount_1 = (amount_without_discount * 90) / 100;
	total_amount_2 = (amount_without_discount * 80) / 100;
	
	if (start_date<1 || start_date>31 || end_date<1 || end_date>31  ){
		System.out.println("Error: Days must be between 1 and 31");
	}

	else{
		if (start_date > end_date){
			System.out.println("Error: Start Date must be less than End Date");
		}
		else{
			System.out.println("Room Charge Per Day: Rs. "+room_charge_per_day+"/=");
			System.out.println("Number of Days Reserved: "+no_of_days);
			if(no_of_days>=3 && no_of_days<5){
				System.out.println("Total Amount to be Paid: "+total_amount_1);
			}
			else if(no_of_days>=5){
				System.out.println("Total Amount to be Paid: "+total_amount_2);	
			}
			else{
				System.out.println("Total Amount to be Paid: "+amount_without_discount);
			}
			
		}	
	}
	}

}