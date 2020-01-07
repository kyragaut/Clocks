/**
 *
 * @author Kyra GauthierDickey
 * Project 3
 * February 14, 2018
 * This part of the program is responsible for drawing the face, and animating the winking
 * 
 */

import edu.princeton.cs.introcs.StdDraw;

public abstract class FaceEmoji extends Emoji{
	private boolean isWinking;
	
	//call super constructor from Emoji class
	public FaceEmoji(double initialCenterX, double initialCenterY, double initialRadius, boolean initialIsWinking)
	{
		super(initialCenterX, initialCenterY, initialRadius);
		isWinking = initialIsWinking;
	}
	
	public void draw()
	{
		
		//draw yellow circle for face
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(getCenterX(), getCenterY(), getRadius());
		
		//draw eyes on the face
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(getCenterX() - getRadius()/2, getCenterY() + getRadius()/2, getRadius()/10); //left eye
		//draw eye differently if the emoji is winking
		if(isWinking == false)
		{
			StdDraw.filledCircle(getCenterX() + getRadius()/2, getCenterY() + getRadius()/2, getRadius()/10); //right eye
		}
		else //this is a line instead of a circle, to represent a closed eye
		{
			StdDraw.arc(getCenterX() + getRadius()/2, getCenterY() + getRadius()/2, getRadius()/7, 10, 170);
		}
			
		
	}
	public void animate()
	{
		if(isWinking == false)
		{
			isWinking = true;
		}
		else
			isWinking = false;
		
		draw();
	}

}
