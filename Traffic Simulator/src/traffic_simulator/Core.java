package traffic_simulator;

import java.util.Timer;
import java.util.TimerTask;

public class Core {

	private Timer timer;
	private int tick_period;
	
	private void tick()
	{
		
	}

	public Core(int tick_period)
	{
		timer = new Timer();
		this.tick_period = tick_period;
	}
	
	public void start()
	{
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				tick();
			}
		}, 0, tick_period);
	}
}
