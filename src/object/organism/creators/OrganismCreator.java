package object.organism.creators;

import object.Snail;
import object.organism.Fish;
import object.organism.Fodder;
import object.organism.RapaciousFish;

public class OrganismCreator {

	public OrganismCreator() 
	{
		
	}

	public Fish createFish()
	{
		
	}
	
	public Fodder createFodder()
	{
		
	}
	
	public RapaciousFish createRapaciousFish()
	{
		
	}

	public Snail createSnail()
	{
		
	}

	public createOrganisms(int fishNum, int fodderNum, int rapaciousFishNum, int snailNum)
	{
		for(int i=0; i<fishNum; i++) this.createFish();
		for(int i=0; i<fodderNum; i++) this.createFodder();
		for(int i=0; i<rapaciousFishNum; i++) this.createRapaciousFish();
		for(int i=0; i<snailNum; i++) this.createSnail();
	}
}
