/**
 *
 * @author Kyra GauthierDickey
 * Project 3
 * February 14, 2018
 * This part of the program is responsible for drawing the frown on the frowning emoji
 * 
 */

import edu.princeton.cs.introcs.StdDraw;

public class FrowningFaceEmoji extends FaceEmoji{
	
	//call super constructor from Emoji class
	public FrowningFaceEmoji(double initialCenterX, double initialCenterY, double initialRadius, boolean isWinking)
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
		double angle1 = 0;
		double angle2 = 180;
		StdDraw.arc(x, y, r, angle1, angle2);
		
		
	}
	
	

}
