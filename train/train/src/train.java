/**
 * @(#)train.java
 * Trin Example [ 6.15 ] Page [ 6.58 ]
 * train Applet application
 *
 * @author
 * @version 1.00 2019/5/8
 */

import java.awt.*;
import java.applet.*;

public class train extends Applet {

	public void init()
	{
	}

	public void paint(Graphics g)
	{
		setBackground(Color.YELLOW);
		int[] x = { 0  , 140 , 140 , 150 , 150 ,
				    250 , 250 , 260 , 260 , 300 ,
				    300 , 290 , 290 , 260 , 260 ,
				    250 , 250 , 170 , 170 , 150 ,
				    150 , 140 , 140 , 0 , 0} ;

		int[] y = { 40 , 40  , 50  , 50  , 40 ,
		            40  , 20  , 20  , 40  , 40 ,
		            150 , 150 , 130 , 130 , 150 ,
		            150 , 80  , 80  , 150 , 150 ,
		             120 , 120 , 130 , 130 , 130 } ;

		g.setColor(Color.black) ;
		g.fillPolygon( x , y , 24 ) ; // train main black shap

		g.setColor(Color.yellow) ;
		g.fillRect(140 , 60 , 10 , 50 ) ; // gap  between to cars
		g.fillRect(270 , 50 , 20 , 20 ) ; // driver window

		// big wheel
		g.setColor(Color.black) ;
		g.drawOval(170 , 80 , 80 , 80 ) ;
		g.fillArc(170 , 80 , 80 , 80 , 0 , 20) ;
		g.fillArc(170 , 80 , 80 , 80 , 90 , 20 ) ;
		g.fillArc(170 , 80 , 80 , 80 , 180 , 20 ) ;
		g.fillArc(170 , 80 , 80 , 80 , 270 , 20 ) ;
		// front wheel
		g.drawOval(260 , 130 , 30 , 30 ) ;

		g.setColor(Color.yellow) ;
		g.fillRect(10 , 50 , 20 , 20 )	; // back left window
		g.fillRect(60 , 50 , 20 , 20 )	; // window in between
		g.fillRect(110 , 50 , 20 , 20 )	; // back right
		// left wheels
		g.setColor(Color.black) ;
		g.drawOval(10 , 130 , 30 , 30) ;  // left wheel
	    g.drawOval(90 , 130 , 30 , 30 )	; // right wheel
	}
}