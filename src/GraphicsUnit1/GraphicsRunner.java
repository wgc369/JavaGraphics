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

		getContentPane().add(new SmileyFace());
		
                run3 run3 = new run3();
                run4 run4 = new run4();
                run5 run5 = new run5();
                
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}

class run3 extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public run3()
	{
		super("run3");

		setSize(WIDTH,HEIGHT);

                getContentPane().add(new BigHouse());
                getContentPane().add(new Robot());
                getContentPane().add(new ShapePanel());
		
                
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		run3 run = new run3();
	}
}

class run4 extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public run4()
	{
		super("run4");

		setSize(WIDTH,HEIGHT);

                getContentPane().add(new Robot());
                getContentPane().add(new ShapePanel());
		
                
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		run4 run = new run4();
	}
}

class run5 extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public run5()
	{
		super("run5");

		setSize(WIDTH,HEIGHT);

                getContentPane().add(new ShapePanel());
		
                
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		run5 run = new run5();
	}
}