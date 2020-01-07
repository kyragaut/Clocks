/**
 *
 * @author Kyra GauthierDickey
 * Project 3
 * February 14, 2018
 * This part of the program is responsible for setting up the constructors and getters for the emojis
 * 
 */

import java.util.Scanner;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import edu.princeton.cs.introcs.StdDraw;

public abstract class Emoji {
	private double centerX;
	private double centerY;
	private double radius;
	
	//constructor that initializes the instance variables
	public Emoji(double initialCenterX, double initialCenterY, double initialRadius)
	{
		centerX = initialCenterX;
		centerY = initialCenterY;
		radius = initialRadius;
	}
	
	//getters:
	public double getCenterX()
	{
		return centerX;
	}
	
	public double getCenterY()
	{
		return centerY;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	//abstract methods:
	public abstract void draw();
	public abstract void animate();
	
}
