import java.util.logging.ConsoleHandler;

import acm.program.ConsoleProgram;

public class InchesToCentrimenters extends ConsoleProgram {
	
	public void run() {
		println("This program converts inches to centrimetres. ");
		double inches = readDouble("Enter value in inches:");
		double cm = inches * CENTIMETRES_PER_INCH;
		println("cm = " + cm + "cm");
		 
		println();
		
		println("This converts footsteps to centrimetres. ");
		double steps = readInt("Enter calue in footsteps: ");
		double centrimetres = steps * CENTIMETRES_PER_FEET;
		println("centrimetres = " + centrimetres + "cm" );
		
	}
	private static final double CENTIMETRES_PER_INCH = 2.54;
	private static final double CENTIMETRES_PER_FEET = 36.1;

}
