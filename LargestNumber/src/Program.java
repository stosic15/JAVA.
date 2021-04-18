import acm.program.ConsoleProgram;

public class Program extends ConsoleProgram {
	public void run() {
		int max;
		int value ;
	     max  = Integer.MIN_VALUE;
		value = readInt(" ?: ");
		while(value != STOP)
		{
			if (value > max)
			{
				
				max = value;
			}
			
			value = readInt(" ?: ");
		}
		if (max == STOP)
		{
			println("User didn't entered number");
		}
		else
		{
			println(max);
		}
	}
	private static final int STOP = 0;
}