/*
  Question ( 0 1 ) : 
  	-> Write a Java applet to draw your full name 
  	   at the x-coordinate equals your section number multiplied by 10 ,
  	   and the y-coordinate equals your number in the section 
*/

// =======================================================================

import java.applet.Applet;  
import java.awt.*; 

public class Assignment_One_Class extends Applet  
{
	public void paint(Graphics g)
	{
		g.drawString("Ahmed El-Sayed Abdul Latif ", ( 1*10 ) , 4 ); 
	}
}

