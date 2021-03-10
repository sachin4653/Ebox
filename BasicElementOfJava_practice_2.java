/*Total Expenses for the Event
 
The prime functionality of an Event Management System is budgeting. An Event Management System should estimate the total expenses incurred by an event and the percentage rate of each of the expenses involved in planning and executing an event. William, the founder of "Pine Tree" wanted to include this functionality in his company’s Event Management System.
 
Write a program to get the branding expenses, travel expenses, food expenses, and logistics expenses as inputs from the user and calculate the total expenses for an event and the percentage rate of each of these expenses.
 
Note :
Formula to calculate percentage = ( Expenses to be found/Total expenses )*100 

Input Format:

The first input is a Double value that corresponds to the branding expenses.
The second input is a Double value that corresponds to the travel expenses.
The third input is a Double value that corresponds to the food expenses.
The fourth input is a Double value that corresponds to the logistics expenses.
 
Output Format:

The first line of the output should display the double value that corresponds to the total expenses for the Event.
The next four lines should display the percentage rate of each of the expenses.
All the double values should be displayed upto 2 decimal places.
Refer sample input and output for formatting specifications.

[All text in bold corresponds to input and the rest corresponds to output.]

Sample Input and Output:

Enter branding expenses
20000
Enter travel expenses
40000
Enter food expenses
15000
Enter logistics expenses
25000
Total expenses: Rs.100000.00
Branding expenses percentage: 20.00%
Travel expenses percentage: 40.00%
Food expenses percentage: 15.00%
Logistics expenses percentage: 25.00% */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter branding expenses");
		double a = sc.nextDouble();
		System.out.println("Enter travel expenses");
		double b = sc.nextDouble();
		System.out.println("Enter food expenses");
		double c = sc.nextDouble();
		System.out.println("Enter logistics expenses");
		double e = sc.nextDouble();
		
		DecimalFormat df = new DecimalFormat("0.00");
		double d = a + b + c+e;
		double A = (a/d)*100;
		double B = (b/d)*100;
		double C= (c/d)*100;
		double E = (e/d)*100;
		System.out.println("Total expenses: Rs."+ df.format(d));
		System.out.println("Branding expenses percentage: "+df.format(A)+"%");
		System.out.println("Travel expenses percentage: "+df.format(B)+"%");
		System.out.println("Food expenses percentage: "+df.format(C)+"%");
		System.out.println("Logistics expenses percentage: "+df.format(E)+"%");
		
		

	}
}
