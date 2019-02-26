/*
Question (02) : 
	-> obtain the following applet 
*/

import java.applet.Applet;  
import java.awt.*;  

public class Assignment_Four_Class extends Applet 
{
	public void paint(Graphics g)
	{
		g.drawOval(150, 150, 200, 250);  // head 
		g.fillOval(180, 210, 50 , 50) ;  // left eye 
		g.fillOval(270, 210, 50,50);     // Right eye
		
		g.drawLine(250, 400, 250, 700);  // body 
		
		g.fillRect(200, 700, 100, 50);   // leg 
	}
}
