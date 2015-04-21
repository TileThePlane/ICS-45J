import java.awt.Color;

public class SmileyGroup
{
	// Provide fields for the three Smiley faces that make up the group
	SmileyFace Smiley1;
	SmileyFace Smiley2; 
	SmileyFace Smiley3; 
	// The constructor builds up to three Smileys in the group.  You
	// can construct each face either from scratch or as a copy of an
	// existing one, setting the attributes of the various face parts,
	// translating and/or scaling face parts, or translating the
	// entire Smiley face, by calling the appropriate methods.
	//
	// See the lab write-up for the kinds of Smiley faces we're expecting
	// you to create and the methods we expect you to employ; withint those
	// requirements, the exact characteristics (shape, color, position) of 
	// each Smiley is up to you.
	
	public SmileyGroup()
	{
		//construct Smileys 1,2,3
		Smiley1 = new SmileyFace();
		//Test copy constructor
		Smiley1.Face.setAttributes(Color.GRAY, 57, 57, 30, 30);
		Smiley1.RightEye.setAttributes(Color.BLUE, 60,50,5,5);
		Smiley1.LeftEye.setAttributes(Color.GREEN, 50,50,5,5);
		Smiley1.Smile.setAttributes(Color.BLUE, 55,65,12,2);
		
		Smiley2 = new SmileyFace(Smiley1);
		
		Smiley2.Face.setAttributes(Color.YELLOW, 100, 100, 30, 30);
		Smiley2.RightEye.setAttributes(Color.BLUE, 103,93,5,5);
		Smiley2.LeftEye.setAttributes(Color.GREEN, 93,93,5,5);
		Smiley2.Smile.setAttributes(Color.BLUE, 97,108,12,2);
		
		Smiley3 = new SmileyFace(Smiley2);
		
		Smiley3.Face.setAttributes(Color.ORANGE, 200, 200, 30, 30);
		Smiley3.RightEye.setAttributes(Color.BLUE, 203,193,5,5);
		Smiley3.LeftEye.setAttributes(Color.GREEN, 193,193,5,5);
		Smiley3.Smile.setAttributes(Color.BLUE, 197,208,12,8);
	}
	
	// Obtain the first Smiley face of the group
	public SmileyFace getSmiley1()
	{
		/*Smiley1.Face.setAttributes(Color.GRAY, 57, 57, 30, 30);
		Smiley1.RightEye.setAttributes(Color.BLUE, 60,50,5,5);
		Smiley1.LeftEye.setAttributes(Color.GREEN, 50,50,5,5);
		Smiley1.Smile.setAttributes(Color.BLUE, 55,65,12,2);*/
		return Smiley1;
	}
	
	
	// Obtain the second Smiley face of the group
	public SmileyFace getSmiley2()
	{
		/*Smiley2.Face.setAttributes(Color.YELLOW, 100, 100, 30, 30);
		Smiley2.RightEye.setAttributes(Color.BLUE, 103,93,5,5);
		Smiley2.LeftEye.setAttributes(Color.GREEN, 93,93,5,5);
		Smiley2.Smile.setAttributes(Color.BLUE, 97,108,12,2);*/
		return Smiley2;
	}
	
	
	// Obtain the third Smiley face of the group
	public SmileyFace getSmiley3()
	{
		/*Smiley3.Face.setAttributes(Color.ORANGE, 200, 200, 30, 30);
		Smiley3.RightEye.setAttributes(Color.BLUE, 203,193,5,5);
		Smiley3.LeftEye.setAttributes(Color.GREEN, 193,193,5,5);
		Smiley3.Smile.setAttributes(Color.BLUE, 197,208,12,8);*/
		return Smiley3;
	}
}

