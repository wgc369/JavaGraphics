package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );

		//add more code here
      window.setColor(Color.BLACK);
      window.fillOval( 380, 300, 50, 50 );
      window.setColor(Color.GREEN);
      window.fillOval( 280, 200, 70, 50 );
      window.fillOval( 480, 200, 70, 50 );
      window.setColor(Color.RED);
      window.drawArc(290, 320, 250, 100, 180, 180);

   }
}