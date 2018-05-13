package producerconsumer;

public class Producer implements Runnable {

	@Override
	public void run()
	{
	    try
	    {
	        Main.pc.produce();
	    }
	    catch(InterruptedException e)
	    {
	        e.printStackTrace();
	    }
	}
}
