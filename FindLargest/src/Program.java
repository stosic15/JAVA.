import acm.program.ConsoleProgram;

public class Program extends ConsoleProgram {
	public void run() {
		println("This program finds the largest number");
		int value;
		
		int max = 0;
		while(true) {
		value = readInt(" ?: ");
		if(value == SENTINEL ) {
			println(max);
			break;
			
			
		}
		if(value > max) {
			max = value;
		
		}
		}
		
			
		}
	
	
	private static final int SENTINEL = 0;

}
