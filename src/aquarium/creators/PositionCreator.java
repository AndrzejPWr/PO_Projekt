package me.jakkard.aquarium.creators;

import me.jakkard.aquarium.Position;

public class PositionCreator {

	public static Position createPosition(int x, int y, int z)
	{
		return new Position(x, y, z);
	}
}
