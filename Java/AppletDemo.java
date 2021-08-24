
import java.awt.*;
import java.applet.*;
/*<Applet code=AppletDemo width=500height=600>
</Applet>*/
public class AppletDemo extends Applet
{
	public void init()
	{
		setBackground(Color.pink);
		setForeground(Color.blue);
	}
	public void paint(Graphics g)
	{
		g.drawString("Welcome to Applet", 200,200);
	}
}
