import acm.program.ConsoleProgram;

public class Program extends ConsoleProgram {
	public void run() {
		int firstN = 0;
		int secondN = 1;
		int thirdN = 0;
		
		
		
		while(secondN + thirdN < 10000) {
			thirdN = firstN + secondN;
			firstN = secondN;
			secondN = thirdN;
			println(thirdN);
			
			
			
			
				
			}
		
		
	}
} 
//Chapter 4 exercise 10
//nisam siguran da je ovo tacno, nisam umeo nikako da dodam i indexe


