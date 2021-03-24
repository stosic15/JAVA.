import acm.program.ConsoleProgram;

public class Program extends ConsoleProgram {
	public void run() {
		double countDown = 10.0;
		
		while(countDown >= 0) {
			println (countDown);
			countDown = (double) (countDown-0.1) ;
			if(countDown == 0) {
				
				break;
			}
		}
		
			}
			
	
	}
	

/* for (double i = START; i >= 0; i -= 0.1) {
println(i);

}
println("Liftoff");
}
private static final double START = 10.0;

Chapter 4 exercise 8 */