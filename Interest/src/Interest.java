import acm.program.ConsoleProgram;

public class Interest extends ConsoleProgram {
	public void run() {
		println("This program calculate interest payment");
		double startingBalance = readDouble("Enter your account balance: ");
		double annualInterest = readDouble("Enter your account interest: ");		
		
		double oneYearInterest = annualInterest / 100 * startingBalance + startingBalance; 
		println("Your ballance after one year: " +oneYearInterest);
		
		double twoYearsInterest = annualInterest / 100 * oneYearInterest + oneYearInterest;
		println(); 
		println("Your balance after two years: " + twoYearsInterest);
		
	}
	
	
}
// Chapter 3 exercise 2
