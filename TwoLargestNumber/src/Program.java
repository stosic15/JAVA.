import acm.program.ConsoleProgram;

public class Program extends ConsoleProgram {
	public void run() {
		int max;
		int value ;
		int secondMax;
		secondMax = Integer.MIN_VALUE;
	    max  = Integer.MIN_VALUE;
		value = readInt(" ?: ");
		while(value != STOP)
		{
			if (value > max)
			{
				secondMax = max;
				max = value;
			}
			else if (value > secondMax) {
				secondMax = value;
				
			}
			
			value = readInt(" ?: ");
		}
		
			println(max+ " " +secondMax);
		}
	
	private static final int STOP = 0;

		
	}


