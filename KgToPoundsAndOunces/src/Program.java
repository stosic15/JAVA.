import acm.program.ConsoleProgram;

public class Program extends ConsoleProgram {
	
	public void run() {
	double kg = readDouble("Enter kilograms: ");
	double pounds = kg * 2.2;
	
	double ounces = kg * 16;
	println("Pounds = " + pounds + " Ounces = " + ounces );

}

}

