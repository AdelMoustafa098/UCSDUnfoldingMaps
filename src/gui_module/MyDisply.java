package gui_module;

import processing.core.PApplet;
import processing.core.PImage;

public class MyDisply extends PApplet 
{
	PImage image;
	public void setup()
	{
		
		
		
		size(400,400);
		String url = "https://processing.org/img/processing-web.png";
		  
		image = loadImage(url, "png");
		
		
	}
	
	public void draw()
	{
		
		image(image, 0, 0);
		//ellipse(height / 5, width / 5, width / 6, height / 6);
	}

}
