import acm.program.ConsoleProgram;

public class Ryme extends ConsoleProgram {
	public void run() {
		println("This program tell you the rymes of botteles and bears");
		
		for(int i = 99; i > 0; i--) {
			println(i + " bottle of beer on the wall. ");
			println (i + " bottle of beer. ");
			println ("You take one down, pass it around. ");
		}
		println();
		println("That how the poem ends ");
	}
}
//Chapter 4 exercise 1
	