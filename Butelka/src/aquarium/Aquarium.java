package me.jakkard.aquarium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import me.jakkard.aquarium.creators.PositionCreator;

public class Aquarium {

	private int x;
	private int y;
	private int z;
	
	private Map<Position, Object> objectsPositions;
	private List<Object> objects;
	//dostep do wspolrzednych pozycji z zewnatrz
	public Position position[][][];
	private List<Position> positionList;
	
	//tworzy akwarium
	public Aquarium(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		objectsPositions = new HashMap<Position, Object>();
		objects = new LinkedList<Object>();
		position = new Position[x][y][z];
		positionList = new ArrayList<Position>();
		for(int i=0; i<x; i++)
			for(int j=0; j<y; j++)
				for(int k=0; k<z; k++)
				{
					position[i][j][k] = PositionCreator.createPosition(i, j, k);
					positionList.add(position[i][j][k]);
					objectsPositions.put(position[i][j][k], null);
				}
	}
	
	public int getLength()
	{
		return x;
	}
	
	public int getWidth()
	{
		return y;
	}
	
	public int getHeight()
	{
		return z;
	}
	
	//pobiera obiekt na pozycji
	public Object getObject(Position pos)
	{
		if(pos != null && objectsPositions.containsKey(pos)) return objectsPositions.get(pos);
		else return null;
	}
	
	//pobiera pozycje obiektu
	public Position getObjectPosition(Object obj)
	{
		if(obj != null && objects.contains(obj))
			if(objectsPositions.containsValue(obj)) 
				for (Position key : objectsPositions.keySet())
					if(obj.equals(this.getObject(key))) return key;
		return null;
		
	}
	
	//zwraca true jesli do pozycji nie jest przypisany zadej obiekt
	public boolean isPositionEmpty(Position pos)
	{
		if(pos != null && positionList.contains(pos))
			if (objectsPositions.get(pos) == null) return true;
		return false;
	}
	
	//usuwa obiekt z akwarium
	//zwaraca true jesli powiodlo
	public boolean remove(Object obj)
	{
		if(objects.contains(obj))
		{
			if(this.getObjectPosition(obj) != null)
				objectsPositions.put(this.getObjectPosition(obj), null);
			objects.remove(obj);
			return true;
		}	
		else return false;
	}
	
	//umieszcza obiekt na pozycji, usuwajac go z jego poprzedniej pozycji jest takowa posiadal
	//jesli nie posiadal dodaje go do akwarium
	//zwraca true jesli powiodlo
	public boolean settleObject(Object obj, Position pos)
	{
		if(!objectsPositions.containsKey(pos) || !positionList.contains(pos)) return false;
		if(this.isPositionEmpty(pos) != true) return false;
		if(!objects.contains(obj)) objects.add(obj);
		if(this.getObjectPosition(obj) != null) objectsPositions.put(this.getObjectPosition(obj), null);
		objectsPositions.put(pos, obj);
		return true;
	}
	
}