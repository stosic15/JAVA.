import acm.program.ConsoleProgram;


	public class FahrenheirToCelsius extends ConsoleProgram {

	    public void run() {
	        println("This program convert Fahrenheit to Celsius");
	        
	        double far = readDouble("Enter Fahrenheit: ");
	        
	        double cel = (5.0/9.0)*(far - 32);
	        
	        println("Celsius = "+cel);
	        
	    }
	}
	//Chater 3 exercise 5