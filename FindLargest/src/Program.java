import acm.program.ConsoleProgram;

public class Program extends ConsoleProgram {
	public void run() {
		println("This program finds the largest number");
		//int value = 1 ;
		int max ,secondMax,value ;
		secondMax = max = value = Integer.MIN_VALUE;
		value = readInt(" ?: ");
		while(value != 0)
		{
			if (value > max)
			{
				secondMax = max;
				max = value;
			}
			else if (value > secondMax)
			{
				secondMax = value;
			}
			value = readInt(" ?: ");
		}
		if (max == 0)
		{
			println("Korisnik nije uneo nijeda borj");
		}
		else
		{
			println(max+ " " +secondMax);
		}
			
		
		
		
		/*while(true) {
		value = readInt(" ?: ");
		if(value == SENTINEL ) {
			
			println(max);
			break;
			
			
		}
		
		if(value > max) {
			max = value;
		
		}
		}
		*/
			
		}
	
	
	private static final int SENTINEL = 0;

}
