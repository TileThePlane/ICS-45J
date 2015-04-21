// SmileyFace.java
//
// ICS 21: Lab Assignment 1
//
// Originally coded by Norm Jacobson, September 2006
// Minor modifications introduced by Alex Thornton, June 2009
// Revised and adapted for ICS45J Fall 2012 by Norman Jacobson, August 2012
//

// The class representing one smiley Face
public class SmileyFace
{
// A SmileyFace consists of four parts:
// * A Face (the circle that underlies the entire smiley Face)
// * A left eye
// * A right eye
// * A smile
// Provide fields for each
	Face Face;
	Eye LeftEye;
	Eye RightEye;
	Smile Smile;


	// When we construct a new SmileyFace from scratch, we create
	// a new Face, new eyes, and a new smile, but don't give them
	// any characteristics; they are filled in later.
	public SmileyFace()
	{
		// *** code that implements this method goes here***
		Face = new Face();
		LeftEye = new Eye();
		RightEye = new Eye();
		Smile = new Smile();
	}

	// When we construct a new SmileyFace that is intended to be a
	// copy of an original SmileyFace, we construct each new part
	// from the same part of the old Face
	public SmileyFace(SmileyFace original)
	{
		this.Face = original.getFace();
		this.LeftEye = original.getLeftEye();
		this.RightEye = original.getRightEye();
		this.Smile = original.getSmile();
	}

	// translate() moves the entire Face, including all of its parts,
	// by the given horizontal (deltaX) and vertical (deltaY)
	// distances. Positive values move the figure right and down; 
	// negative ones up and left
	public void translate(int deltaX, int deltaY)
	{
		// *** code that implements this method goes here***
		Face.translate(deltaX,deltaY);
		LeftEye.translate(deltaX, deltaY);
		RightEye.translate(deltaX, deltaY);
		Smile.translate(deltaX, deltaY);
	}


	// Accessors that return each part of a SmileyFace:

	public Face getFace()
	{
		return Face;
	}


	public Eye getLeftEye()
	{
			return LeftEye;
	}


	public Eye getRightEye()
	{
		return RightEye;
	}


	public Smile getSmile()
	{
		return Smile;
	}
	
	// Accessors that return the 'edges' of the
	// smiley - the leftmost, rightmost, topmost,  
	// and bottom-most points
	
	public int getLeftEdge()
	{
		//center x coordinate - radius(converted to int since it is double value
		return Face.getCenterX() - (int)Face.getXLength()/2;
	}
	
	public int getRightEdge()
	{
		////center x coordinate - radius(converted to int since it is double value
		return Face.getCenterX() + (int)Face.getYLength()/2;
	}
	
	public int getTopEdge()
	{
		////center y coordinate - radius(converted to int since it is double value
		return Face.getCenterY() + (int)Face.getYLength()/2;
	}

	public int getBottomEdge()
	{
		////center y coordinate - radius(converted to int since it is double value
		return Face.getCenterY() - (int)Face.getYLength()/2;
	}
}


