package traffic_simulator;

public class Position
{
	private Map map;
	private float pos;
	
	private boolean checkPos()
	{
		return 0 <= pos && pos <= map.getDistance();
	}
	
	public Position(Map map, float pos)
	{
		this.map = map;
	    this.pos = pos;
	    if (!checkPos())
	    	throw new IllegalArgumentException();
	}
	
}
