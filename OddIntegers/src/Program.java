import acm.program.ConsoleProgram;

public class Program extends ConsoleProgram {
	public void run() {	
		int num = readInt("enter number:" );
		int num2 = 1;
		int total = 0;
		while(0 < num) {
		if(num2 %2!=0) {
			total += num2;
			num--;
		}
		num2++;
			
		}
		println("Total is: "+total);
		
		 }
	
}
//Chapter 4 exersise 3