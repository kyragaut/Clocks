/**
 *
 * @author Kyra GauthierDickey
 * Project 3
 * February 14, 2018
 * This part of the program is responsible for the simulation
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class EmojiDriver {

	public static void main(String[] args) {
		//set up scanner
		Scanner myScanner = null;
		//open file
		try
		{
			myScanner = new Scanner (new FileInputStream("emoji1.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.exit(0);
		}
		
		//reading in first two numbers, rows and columns 
		int numRow = Integer.parseInt(myScanner.nextLine());
		int numCol = Integer.parseInt(myScanner.nextLine());
		System.out.println(numRow + " " + numCol);
		
		
		//set up canvas
		int CANVAS_SIZE_X = numCol*100;
		int CANVAS_SIZE_Y = numRow*100;
		StdDraw.setCanvasSize(CANVAS_SIZE_X, CANVAS_SIZE_Y);
		StdDraw.setXscale(0, CANVAS_SIZE_X);
		StdDraw.setYscale(0, CANVAS_SIZE_Y);
		StdDraw.enableDoubleBuffering();
		
		double radius = 50;
		double xPos = radius;
		double yPos = radius;
		int hour;
		int minute;
		String test;
		
		Emoji[][] emoji = new Emoji[numRow][numCol];
		
		for(int row = 0; row < numRow; ++row)
		{
			xPos = radius;
			for(int col = 0; col < numCol; ++col)
			{
				
				test = myScanner.next();
				System.out.println(test);
				
				if(test.equals("smile"))
				{
					emoji[row][col] = new SmileyFaceEmoji(xPos, yPos, radius, true);		
				}
				else if(test.equals("frown"))
				{
					emoji[row][col] = new FrowningFaceEmoji(xPos, yPos, radius, true);
				}
				else
				{
					hour = myScanner.nextInt();
					minute = myScanner.nextInt();
					emoji[row][col] = new ClockEmoji(xPos, yPos, radius, hour, minute);
				}
				
				xPos += radius*2;
				emoji[row][col].draw();
			}
			
			yPos += radius*2;
					
		}
		
		//animate the emojis
		while(true)
		{
			for(int row = 0; row < numRow; ++row)
			{
				for(int col = 0; col < numCol; ++col)
				{
					emoji[row][col].animate();
				}
			
			}
			
			StdDraw.show();
			StdDraw.pause(20);
		}
		
		

	}

}
