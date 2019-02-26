/*
Question (01) : 
	-> obtain the following applet using loops . 
		Assume each square to be 10*10 
*/

import java.applet.Applet;  
import java.awt.*;  

public class Assignment_Three_Class extends Applet 
{
	public int i  ; 
	public int j = 20  ; 
	
	public void paint(Graphics g)
	{
		for(i = 0 ; i<1000 ; i = i+20  ) 
		{
			for(j = 0 ; j <1000 ; j=j+20) 
			{
				g.fillRect(i , j ,10,10);
			}
		}
		
	}
}
