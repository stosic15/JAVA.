import acm.program.ConsoleProgram;

public class Average extends ConsoleProgram {
	
	public void run() {
		println("This program adds list average score");

		
		int total = 0;
		 int count = 0;
		int value;
		while(true) {
			value = readInt(" Enter value:  ");
			if (value == STOP) break;
			total += value;
			count++;
			
			}
		double avg = (double)total/count;
		println(avg);
		
		
			 
			 
			
		
		


	}
		private static final double STOP= -1;
		

		
	}
//Chaprer 4 exercise 5


