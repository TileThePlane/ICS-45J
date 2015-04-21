import java.awt.Color;

// Smiley.java
//
// ICS 45J: Lab Assignment 1
//
// Originally coded by Norm Jacobson, September 2006
// Minor modifications introduced by Alex Thornton, June 2009
// Modified for ICS21 Fall 2009 by Norman Jacobson, September 2009
// Modified for ICS21 Winter 2011 by Norman Jacobson, October 2010
// Revised for ICS45J Fall 2012 by Norman Jacobson, August 2012
//
// This is where the program begins. 
// We construct a SmileyFrame (i.e., the window that holds
// the display areas where the smiley group is dawn);
// we construct a smiley group to display in it;
// we add that group into the frame.
// The provided graphics routines take over from there
// --they are called via SmileyGroupDisplay --
// and draw in the frame the graphics objects that, taken
// together, appear to the user as a group of smiley faces.
// We then make the frame visible, so the user can see the 
// drawn group.

public class Smiley
{
	public static void main(String[] args)
	{
		BasicFrame f = new BasicFrame("Smiley Faces");
		f.add(new SmileyGroupDisplay(new SmileyGroup()));
		f.setVisible(true);
	}
}
