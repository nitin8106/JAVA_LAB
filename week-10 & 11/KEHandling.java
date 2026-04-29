import java.awt.*;
import java.awt.event.*;
class KEHandling extends Frame implements KeyListener
{
	String msg ="", msg2 = "";
	KEHandling()
		{
			addKeyListener(this);
		}
	public void keyPressed(KeyEvent ke)
	{
			msg += "key pressed";
			repaint();
	}
	public void keyReleased(KeyEvent ke)
	{
		msg += "key released";
		repaint();
	}
	public void keyTyped(KeyEvent ke)
	{
		msg2 += ke.getKeyChar();
		msg += "Key Typed";
		repaint();
	}
	public static void main(String args[])
	{
		KEHandling kh = new KEHandling();
		kh.setTitle("My first Window");
		kh.setSize(200 , 500);
		kh.setVisible(true);
		kh.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		}
		);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg , 100 , 50);
		g.drawString(msg2 , 100, 100);
		msg = " ";
	}
		
}