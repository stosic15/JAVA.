import acm.program.ConsoleProgram;

public class Program extends ConsoleProgram {
	public void run() {
		int firstN = 0;
		int secondN = 1;
		int thirdN = 0;

		
		for(int i = 2; i <= 15; i++) {
		    thirdN = firstN + secondN;
			println("F"+i+" = " +thirdN);
			firstN = secondN;
			secondN = thirdN;
		}
		
	}

}
//Chapter 4 exercise 9
