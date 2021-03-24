import acm.program.ConsoleProgram;

public class Program extends ConsoleProgram{
	public void run(){
		
		  int num = readInt("Enter a positive integer: ");
		  int dnum = 0;
		  int snum = 0;
		  while(num > 0)
		  {
		   dnum *= 10;
		   snum = num % 10;
		   dnum += snum;
		   num = num / 10;
		   
		  }
		  println("The reversed number is" + dnum);
		 }

		}
//Chapter 4 exercise 6