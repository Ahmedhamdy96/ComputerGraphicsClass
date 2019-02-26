/*
	Question (02) : 
  	-> Write Java Applet to draw numbers from 1 To 100 at the x-coordinate equals 250 , 
  	   and the y-coordinate equals ( number * 2 + 25 ) 
*/
// ======================================================================================

import java.applet.Applet;  
import java.awt.*;  


public class Assignment_Two_Class extends Applet 
{
	public int i  ;
	
	public void paint(Graphics g)
	{
		g.setFont(new Font("TimesRoman", Font.PLAIN, 35));
		for( i = 1  ; i<=100 ; i++  )
		{ 
			g.drawString(  Integer.toString(i) , 250 , (i*2 + 25));
		}
		
	}
}
