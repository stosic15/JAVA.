import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Rainbow extends GraphicsProgram {
	public void run() {
		GOval oval= new GOval(430,530,1250, 950);
		add(oval);
		GOval oval1= new GOval(470,570,1150, 850);
		add(oval1);
		GOval oval2= new GOval(520,620,1050, 750);
		add(oval2);
		GOval oval3= new GOval(570,670,950, 650);
		add(oval3);
		GOval oval4= new GOval(620,720,850, 550);
		add(oval4);
		GOval oval5= new GOval(670,770,750, 450);
		add(oval5);
		GOval oval6= new GOval(720,820,650, 350);
		add(oval6);
		
		oval.setFilled(true);
		oval.setFillColor(Color.RED);
		oval1.setFilled(true);
		oval1.setFillColor(Color.ORANGE);
		oval2.setFilled(true);
		oval2.setFillColor(Color.YELLOW);
		oval3.setFilled(true);
		oval3.setFillColor(Color.GREEN);
		oval4.setFilled(true);
		oval4.setFillColor(Color.BLUE);
		oval5.setFilled(true);
		oval5.setFillColor(Color.MAGENTA);
		oval6.setFilled(true);
		oval6.setFillColor(Color.WHITE);
	}

}
