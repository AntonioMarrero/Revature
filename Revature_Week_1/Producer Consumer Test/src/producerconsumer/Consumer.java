package producerconsumer;

public class Consumer implements Runnable{

	@Override
	public void run()
	{
	    try
	    {
	        Main.pc.consume();
	    }
	    catch(InterruptedException e)
	    {
	        e.printStackTrace();
	    }
	}
}
