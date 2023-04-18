interface EventListner{
	void performEvent();
}

interface MouseListner extends EventListner{
	void mouseclick();
	void mousePressed();
	void mouseReleased();
	void mouseMoved();
	void mouseDragged();
}

interface KeyListener extends EventListner{
	void keyPressed();
	void keyReleased();
}

class EventDemo implements MouseListner , KeyListener
{
	public void performEvent()
	{
		System.out.println("event performed ");
	}
	public void mouseclick()
	{
		System.out.println(" mouse clicked ");
	}
	public void mousePressed()
	{
		System.out.println("mouse pressed ");
	}
	public void mouseReleased()
	{
		System.out.println("mouse Released ");
	}
	public void mouseMoved()
	{
		System.out.println("mouse moved");
	}
	public void mouseDragged()
	{
		System.out.println("mouse dragged ");
	}
	public void keyPressed()
	{
		System.out.println("key pressed ");
	}
	public void keyReleased()
	{
		System.out.println("key Released ");
	}
	
}

public class Exe912
{
	public static void main(String[] args) {
		
		EventDemo e1 = new EventDemo();
		e1.mouseclick();
		e1.mousePressed();
		e1.mouseReleased();
		e1.mouseMoved();
		e1.mouseDragged();
		e1.keyPressed();
		e1.keyReleased();
	}
}