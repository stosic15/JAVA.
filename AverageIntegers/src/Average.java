import acm.program.ConsoleProgram;

public class Average extends ConsoleProgram {
	public void run() {
		println("This program calculate average of two numbers");
		
		int n1 = readInt("Enter first number: ");
		int n2 = readInt("Enter second number: ");
		int n3 = readInt("Enter third number: ");
		int n4 = readInt("Enter fourt number: ");
		
		
	
		double avg =(double)(n1 + n2 + n3 + n4 ) / 4;
		println(avg);
	}

}
