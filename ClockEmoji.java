/**
 *
 * @author Kyra GauthierDickey
 * Project 3
 * February 14, 2018
 * This part of the program is responsible for drawing the clock emoji and animating it
 * 
 */

import edu.princeton.cs.introcs.StdDraw;

public class ClockEmoji extends Emoji{
	private int hour;
	private int minute;
	
	//call super constructor from Emoji class
	public ClockEmoji(double initialCenterX, double initialCenterY, double initialRadius, int initialHour, int initialMinute)
	{
		super(initialCenterX, initialCenterY, initialRadius);
		hour = initialHour;
		minute = initialMinute;
	}
	public void draw()
	{
		
		//draw blue circle for clock face
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.filledCircle(getCenterX(), getCenterY(), getRadius());
		
		//calculate angles of where to put hands
		int newMin = 60 - minute;
		int newHour = 11 - hour;
		
		double bigAngle = Math.toRadians(360/60*newMin + 90);
		double littleAngle = Math.toRadians((360.0/(12.0*60.0))*(newHour*60.0+ newMin) + 90.0);

		//calculate the x1 and y1 points for the big hand
		double bigX1 = Math.cos(bigAngle)*getRadius() + getCenterX();
		double bigY1 = Math.sin(bigAngle)*getRadius() + getCenterY();
		//for the little hand
		double littleX1 = Math.cos(littleAngle)*getRadius()*.5 + getCenterX();
		double littleY1 = Math.sin(littleAngle)*getRadius()*.5 + getCenterY();
		
		//draw big hand
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.line(getCenterX(), getCenterY(), 
				bigX1, bigY1);
		//draw little hand
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.line(getCenterX(), getCenterY(), littleX1, littleY1);
	}
	
	private void addMinute()
	{
		if(minute == 60)
		{
			minute = 0;
			if(hour == 11)
			{
				hour = 0;
			}
			else
			{
				++hour;
			}
		} 
		else 
		{
			++minute;
		}
	}
	
	public void animate()
	{
		draw();
		addMinute();
	}
}
