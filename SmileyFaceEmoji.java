/**
 *
 * @author Kyra GauthierDickey
 * Project 3
 * February 14, 2018
 * This part of the program is responsible for drawing the smile on the smiley emoji
 * 
 */

import edu.princeton.cs.introcs.StdDraw;

public class SmileyFaceEmoji extends FaceEmoji{
	
	//constructor
	public SmileyFaceEmoji(double initialCenterX, double initialCenterY, double initialRadius, boolean isWinking)
	{
		super(initialCenterX, initialCenterY, initialRadius, isWinking);
	}
	
	public void draw()
	{
		super.draw();
		//draw mouth
		StdDraw.setPenColor(StdDraw.BLACK);
		double x = getCenterX();
		double y = getCenterY() - getRadius()/2;
		double r = getRadius()/4;
		double angle1 = 180;
		double angle2 = 0;
		
		StdDraw.arc(x, y, r, angle1, angle2);
		
	}

}