import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Program extends GraphicsProgram {
	public void run() {
		GOval oval = new GOval(100,100,100, 100);
		add(oval);
		GOval ooval = new GOval(105,105,90, 90);
		add(ooval);
		ooval.setFilled(true);
		ooval.setFillColor(Color.WHITE);
		oval.setFilled(true);
		oval.setFillColor(Color.GREEN);
		
		GOval oval1 = new GOval(210,100,100, 100);
		GOval ooval1 = new GOval(215,105,90, 90);
		add(oval1);
		add(ooval1);
		ooval1.setFilled(true);
		oval1.setFilled(true);
		oval1.setFillColor(Color.BLACK);
		ooval1.setFillColor(Color.WHITE);
		
		GOval oval2 = new GOval(150,165,100, 100);
		GOval ooval2 = new GOval(155,170,90, 90);
		add(oval2);
		add(ooval2);
		ooval2.setFilled(true);
		oval2.setFilled(true);
		oval2.setFillColor(Color.GRAY);
		ooval2.setFillColor(Color.WHITE);
		
		GOval oval3 = new GOval(270,165,100, 100);
		GOval ooval3 = new GOval(275,170,90, 90);
		add(oval3);
		add(ooval3);
		ooval3.setFilled(true);
		oval3.setFilled(true);
		oval3.setFillColor(Color.YELLOW);
		ooval3.setFillColor(Color.WHITE);
		
		GOval oval4 = new GOval(320,100,100, 100);
		GOval ooval4 = new GOval(325,105,90, 90);
		add(oval4);
		add(ooval4);
		ooval4.setFilled(true);
		oval4.setFilled(true);
		oval4.setFillColor(Color.RED);
		ooval4.setFillColor(Color.WHITE);
		
	}

}
