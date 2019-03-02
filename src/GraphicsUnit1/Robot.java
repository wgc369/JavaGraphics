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

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      //call other methods
      upperBody(window);
      lowerBody(window);
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);
      		//add more code here
      window.setColor(Color.BLACK);
      window.fillOval( 380, 130, 30, 20 );
      window.setColor(Color.GREEN);
      window.fillOval( 320, 120, 30, 30 );
      window.fillOval( 430, 120, 30, 30 );
      window.setColor(Color.RED);
      window.drawArc(350, 150, 100, 40, 180, 180);
				
   }

   public void upperBody( Graphics window )
   {
       window.setColor(Color.BLUE);
       window.fillRect(320, 220, 150, 100);
       window.setColor(Color.BLACK);
       window.drawLine(320, 220, 200, 150);
       window.drawLine(470, 220, 590, 150);
   }

   public void lowerBody( Graphics window )
   {
       window.setColor(Color.GRAY);
       window.fillRect(320, 350, 150, 100);
       window.setColor(Color.BLACK);
       window.drawLine(320, 450, 250, 550);
       window.drawLine(470, 450, 550, 550);

   }
}