package object.organism.creators;

import object.organism.Fish;
import object.organism.RapaciousFish;

public class OrganismCreator {

	public OrganismCreator() 
	{
		
	}

	public Fish createFish()
	{
		
	}
	
	public Prawn createPrawn()
	{
		
	}
	
	public RapaciousFish createRapaciousFish()
	{
		
	}

	public Snail createSnail()
	{
		
	}

	public createOrganisms(int fishNum, int prawnNum, int rapaciousFishNum, int snailNum)
	{
		for(int i=0; i<fishNum; i++) this.createFish();
		for(int i=0; i<prawnNum; i++) this.createFodder();
		for(int i=0; i<rapaciousFishNum; i++) this.createRapaciousFish();
		for(int i=0; i<snailNum; i++) this.createSnail();
	}
}
