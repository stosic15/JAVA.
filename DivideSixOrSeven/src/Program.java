import acm.program.ConsoleProgram;

public class Program extends ConsoleProgram {
	public void run() {
		int num = 100;
		for(int i = num; i>0 ; i--) {
			if(num%6 == 0 || num%7 == 0) {
				println (num);
				
			}
			num--;
		}
	}

}
//Chapter 4 exercise 4
