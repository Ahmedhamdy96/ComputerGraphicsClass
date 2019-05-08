/**
 * @(#)girl.java
 * Girl Example [ 6.10 ] Page [ 6.44 ]
 * girl Applet application
 *
 * @author
 * @version 1.00 2019/5/8
 */

import java.awt.*;
import java.applet.*;

public class girl extends Applet
{

	public void init()
	{
	}

	public void paint(Graphics g)
	{
		// top hair
		g.fillArc( 160 , 100 , 80 , 80 , 0 , 180 ) ;
		// left hair
		g.fillOval( 160 , 140 , 10 , 10 ) ;
		g.fillOval( 160 , 150 , 10 , 10 ) ;
		g.fillOval( 160 , 160 , 10 , 10 ) ;
		// right hair
		g.fillOval( 230 , 140 , 10 , 10 ) ;
		g.fillOval( 230 , 150 , 10 , 10 ) ;
		g.fillOval( 230 , 160 , 10 , 10 ) ;


		g.drawOval( 170 , 110 , 60 , 60 ) ;			 // face shape
		g.setColor(Color.yellow) ;
		g.fillOval( 170 , 110 , 60 , 60 ) ;			 // fill face

		g.setColor(Color.white) ;
		g.fillOval( 180 , 120 , 10 , 20 ) ;           // left eye white part
		g.fillOval( 210 , 120 , 10 , 20 ) ;			  // right eye white part

		g.setColor( Color.black ) ;
		g.fillOval( 180 , 130 , 10 , 10 ) ;           // left eye black part
		g.fillOval( 210 , 130 , 10 , 10 ) ;           // right eye black part
		// the red dress
		g.setColor(Color.red) ;
		int[] x_body = { 190 , 210 , 210 , 250 , 300 , 280 , 240 , 230 , 300 , 100 , 170 , 160 , 130 , 110 , 150 , 190  } ;
		int[] y_body = { 170 , 170 , 190 , 200 , 300 , 300 , 230 , 300 , 440 , 440 , 300 , 230 , 300 , 300 , 200 , 190  } ;
		g.fillPolygon( x_body , y_body , 16 ) ;

		g.setColor( Color.yellow ) ;
		g.fillOval(110 , 300 , 20 , 20 ) ; // left hand
		g.fillOval(280 , 300 , 20 , 20 ) ; // right hand

		// left leg
		g.setColor( Color.blue ) ;
		int[] x_left_leg = { 140 , 170 , 160 , 120 , 120 , 140 } ;
		int[] y_left_leg = { 440 , 440 , 480 , 480 , 460 , 460 } ;
		g.fillPolygon( x_left_leg , y_left_leg , 6 ) ;

		int[] x_right_leg = { 230 , 260 , 260 , 280 , 280 , 240 } ;
		int[] y_right_leg = { 440 , 440 , 460 , 460 , 480 , 480 } ;
		g.fillPolygon( x_right_leg , y_right_leg , 6 ) ;



	}
}