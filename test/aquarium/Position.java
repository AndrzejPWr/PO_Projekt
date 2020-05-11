package me.jakkard.aquarium;

public final class Position {

	private final int x;
	private final int y;
	private final int z;
		
	public Position(int x, int y, int z) 
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
		
	public int getX(Position pos)
	{
		return this.x;
	}
		
	public int getY(Position pos)
	{
		return this.y;
	}
		
	public int getZ(Position pos)
	{
		return this.z;
	}
		
	@Override
	 public String toString()
	 {
		return "x: " + x + " y: " + y + " z " + z;	
	 }
}
