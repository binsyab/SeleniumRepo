package weekthree.dayone.system;

public class Desktop extends Computer{
	
	public void desktopSize()
	{
		System.out.println("Print Desktop size");
	}
	public static void main(String[] args)
	{
		Desktop comp = new Desktop();
		
		comp.desktopSize();
		
		comp.computerModel();
				
	}

}
