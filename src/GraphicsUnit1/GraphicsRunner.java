package GraphicsUnit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Gary Wu
//Date - 3/1/2019
//Class - 1
//Lab  - 2,3,4,5

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Graphics Runner");

		setSize(WIDTH,HEIGHT);

		//getContentPane().add(new SmileyFace());
                //getContentPane().add(new SmileyFace());
                //getContentPane().add(new BigHouse());
                //getContentPane().add(new Robot());
                getContentPane().add(new ShapePanel());
		
                
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}