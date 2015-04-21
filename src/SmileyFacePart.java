// SmileyFacePart.java
//
// ICS 45J: Lab Assignment 1
//
// Originally coded by Norm Jacobson, September 2006
// Minor modifications introduced by Alex Thornton, June 2009
// Face part copy constructor added by Norman Jacobson for ICS 21 
//  Fall 2009, September 2009
// computerUpperLeft() removed; that's now handled by the graphics routines,
//  by Norman Jacobson for ICS21 WInter 2011, December 2011
// Updated for ICS45J by Norman Jacobson, August 2012


// Color objects are needed to represent the color of the face part
import java.awt.Color;

// A SmileyFacePart represents one part of a smiley face (i.e.,
// the face, an eye, or the smile); it has a color, position and size
abstract class SmileyFacePart
{
	// A part consists of its color, x and y coordinates of its center,
	// and its length in the x and y coordinates


	int cenX;
	int cenY;
	double lenX;
	double lenY;
	Color CurrentColor;
	

	// When we construct an "empty" SmileyFacePart, we set its color to
	// gray, while leaving as 0 all the values of its other attributes
	public SmileyFacePart()
	{
		
		this.setAttributes(Color.GRAY,0,0,0,0);
		
	}


	// A copy of a face part is a copy of each of its components
	public SmileyFacePart(SmileyFacePart orig)
	{
		//Call set attribute with a reference to this class and use accessor methods for values
		this.setAttributes(orig.getColor(),orig.getCenterX(),orig.getCenterY(),orig.getXLength(),orig.getYLength());
		
	}


	// setAttributes() uses the appropriate helper methods to set the
	// various attributes of a SmileyFacePart.
	public void setAttributes(
		Color newColor, int newCenterX, int newCenterY,
		double newXLength, double newYLength)
	{
		setColor(newColor);
		setCenter(newCenterX, newCenterY);
		setXLength(newXLength);
		setYLength(newYLength);
	}


	// translate() moves a SmileyFacePart the given distance horizontally
	// (deltaX) and vertically (deltaY). Positive values move right and down;
	// negative values move left and up
	public void translate(int deltaX, int deltaY)
	{
		this.setCenter((cenX+deltaX),(cenY+deltaY));
	}


	// scale() changes the size of a SmileyFacePart by the given factor.
	// For example, if the part is 20 x 20 and the scaleFactor is 3.5,
	// the part's new size should be 70 x70.
	public void scale(double scaleFactor)
	{
		this.setXLength((lenX*scaleFactor));
		this.setYLength((lenY*scaleFactor));
	}


	// setColor() sets the color of a SmileyFacePart to be the color
	// specified by c.
	public void setColor(Color c)
	{
		CurrentColor=c;
	}


	// setCenter() sets the center x- and y-coordinates of a SmileyFacePart
	public void setCenter(int x, int y)
	{
		cenX=x;
		cenY=y;
	}


	// setXLength() sets the horizontal length of a SmileyFacePart
	public void setXLength(double xLen)
	{
		lenX=xLen;
	}


	// setYLength() sets the vertical length of a SmileyFacePart
	public void setYLength(double yLen)
	{
		lenY=yLen;
	}

	// Accessor methods to return each of the attributes
	// of a SmileyFacePart.

	public Color getColor()
	{
		return CurrentColor;
	}


	public int getCenterX()
	{
		return cenX;
	}


	public int getCenterY()
	{
		return cenY;
	}


	public double getXLength()
	{
		return lenX;
	}


	public double getYLength()
	{
		return lenY;
	}
}

// Each part of the face is just a SmileyFacePart --
// but we have each face part as a separate class to
// help keep them straight, and in case in future
// we want specific parts to have characteristics
// particular to them.

// Each class as a constructor that builds a
// "default part"; that is, it calls the
// SmileyFacePart no-parameter constructor.
// Each class also has a copy constructor that 
// makes a copy of its kind of object; again, 
// since every part here is a face part, we 
// just invoke SmileyFacePart's copy constructor.

class Face extends SmileyFacePart
{
	public Face()
	{
		super();
	}

	public Face(Face orig)
	{
		super(orig);
	}
}


class Eye extends SmileyFacePart
{
	public Eye()
	{
		super();
	}

	public Eye(Eye orig)
	{
		super(orig);
	}
}


class Smile extends SmileyFacePart
{
	public Smile()
	{
		super();
	}

	public Smile(Smile orig)
	{
		super(orig);
	}

}

