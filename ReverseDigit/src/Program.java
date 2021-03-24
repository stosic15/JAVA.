import acm.program.ConsoleProgram;

public class Program extends ConsoleProgram{
	public void run(){
		
		  int num = readInt("Enter a positive integer: ");
		  int revNum = 0;
		  int xNum = 0;
		  while(num > 0)
		  {
		   revNum *= 10;
		   xNum = num % 10;
		   revNum += xNum;
		   num = num / 10;
		   
		  }
		  println("The reversed number is" + revNum);
		 }

		}
//Chapter 4 exercise 6