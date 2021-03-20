import acm.program.ConsoleProgram;

public class Program extends ConsoleProgram {
	public void run() {
		println("This program calculate number of things in rhyme");
		int wife = 7;
		println("There was seven " + wife + " wife ");
		int sacks = wife * 7;
		println("Then seven sacks so we have " + sacks + "sacks");
		int cats = sacks * 7;
		println("Each sacks had "+ cats + "casts" );
	    int kits = cats * 7;
	    println("And each cat had "+ kits + " kits");
	    
	    int total = wife + sacks + cats + kits;
	    println("And total is "+ total);
	    
	    int total1 = total + 1;
	    println("If we count the man = "+ total1);
	}
	
}
// Chapter 3 exercise 9






