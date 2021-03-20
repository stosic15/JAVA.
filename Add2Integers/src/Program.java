import acm.program.ConsoleProgram;

public class Program extends ConsoleProgram {
	public void run() {
		println("This program add two integers");
		int n1 = readInt("Enter n1: ");
		int n2 = readInt("Enter n2: ");
		int n3 = readInt("Enter n3: ");
		
		int total = n1 + n2 + n3;
		
		println("Total is " + total + " . ");
	}

}
//Chapter 2 exercise 3
