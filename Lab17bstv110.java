// Lab17bstv110.java
// Janee Yeak
// 4 May 2021
// This program creates a colourful square fractal.

import java.awt.*;
import java.applet.*;


public class Lab17bstv110 extends Applet
{

	public void init()
   {
      setSize(1000, 650);  
   }
   public void paint (Graphics g)
	{
		drawSquare1(g,1000,650, 5, 7357, 7357); // 7357 is just TEST. 
  	}

	public void drawSquare1(Graphics g, int maxX, int maxY, int rand, int wid, int hei)
	{    
      int startWidth = maxX/4;
      
      if (startWidth > 1 && wid > 1 && hei > 1)
      {  
         if(rand == 5)
         {
            int midX = maxX/2;
		      int midY = maxY/2;
		      int startHeight = maxY/4;
            int halfSHeight = startHeight/2;
            int halfSWidth = startWidth/2;
		      int tlX = midX - (startWidth/2);
		      int tlY = midY - (startHeight/2);

            g.fillRect(tlX,tlY,startWidth,startHeight); // First main rect
            
            g.setColor(Color.red);
            g.fillRect(tlX-halfSWidth, tlY-halfSHeight, halfSWidth, halfSHeight); // top left
            
            g.setColor(Color.green);
            g.fillRect(tlX-halfSWidth, tlY+startHeight, halfSWidth, halfSHeight); // bottom left
            
            g.setColor(Color.blue);
            g.fillRect(tlX + startWidth, tlY-halfSHeight, halfSWidth, halfSHeight); // top right
            
            g.setColor(Color.yellow);
            g.fillRect(tlX + startWidth, tlY+startHeight, halfSWidth, halfSHeight); // bottom right
            
            drawSquare1(g, tlX-halfSWidth, tlY-halfSHeight, 4, halfSWidth, halfSHeight); // top left
            drawSquare1(g, tlX-halfSWidth, tlY+startHeight, 3, halfSWidth, halfSHeight); // bottom left
            drawSquare1(g, tlX+startWidth, tlY-halfSHeight, 2, halfSWidth, halfSHeight); // top right
            drawSquare1(g, tlX+startWidth, tlY+startHeight, 1, halfSWidth, halfSHeight); // bottom right.
  
         }
         else if(rand == 4)  // DRAWING TOP LEFT SQUARE'S OTHER SQUARES, RAND == 4
         {
            int halfSHeight = hei/2;
            int halfSWidth = wid/2;
            
            g.setColor(Color.red);
            g.fillRect(maxX-halfSWidth, maxY-halfSHeight, halfSWidth, halfSHeight); // top left
            
            g.setColor(Color.green);
            g.fillRect(maxX-halfSWidth, maxY+hei, halfSWidth, halfSHeight); // bottom left
            
            g.setColor(Color.blue);
            g.fillRect(maxX+wid, maxY-halfSHeight, halfSWidth, halfSHeight); // top right 
            
            drawSquare1(g, maxX-halfSWidth, maxY-halfSHeight, 4, halfSWidth, halfSHeight); // top left
            drawSquare1(g, maxX-halfSWidth, maxY+hei, 3, halfSWidth, halfSHeight); // bottom left
            drawSquare1(g, maxX+wid, maxY-halfSHeight, 2, halfSWidth, halfSHeight); // top right           
         }
         else if (rand == 3) // DRAWING BOTTOM LEFT SQUARE'S OTHER SQUARES, RAND == 3
         {
            int halfSHeight = hei/2;
            int halfSWidth = wid/2;
            
            g.setColor(Color.red);
            g.fillRect(maxX-halfSWidth, maxY-halfSHeight, halfSWidth, halfSHeight); // top left
            
            g.setColor(Color.green);
            g.fillRect(maxX-halfSWidth, maxY+hei, halfSWidth, halfSHeight); // bottom left
            
            g.setColor(Color.yellow);
            g.fillRect(maxX+wid, maxY+hei, halfSWidth, halfSHeight); // bottom right
            
            drawSquare1(g, maxX-halfSWidth, maxY-halfSHeight, 4, halfSWidth, halfSHeight); // top left
            drawSquare1(g, maxX-halfSWidth, maxY+hei, 3, halfSWidth, halfSHeight); // bottom left
            drawSquare1(g, maxX+wid, maxY+hei, 1, halfSWidth, halfSHeight); // bottom right.
         }
         else if (rand == 2)// DRAWING TOP RIGHT SQUARE'S OTHER SQUARES, RAND == 2
         {            
            int halfSHeight = hei/2;
            int halfSWidth = wid/2;
            
            g.setColor(Color.red);
            g.fillRect(maxX-halfSWidth, maxY-halfSHeight, halfSWidth, halfSHeight); // top left
            
            g.setColor(Color.blue);
            g.fillRect(maxX+wid, maxY-halfSHeight, halfSWidth, halfSHeight); // top right 
            
            g.setColor(Color.yellow);
            g.fillRect(maxX+wid, maxY+hei, halfSWidth, halfSHeight); // bottom right
           
            drawSquare1(g, maxX-halfSWidth, maxY-halfSHeight, 4, halfSWidth, halfSHeight); // top left
            drawSquare1(g, maxX+wid, maxY-halfSHeight, 2, halfSWidth, halfSHeight); // top right  
            drawSquare1(g, maxX+wid, maxY+hei, 1, halfSWidth, halfSHeight); // bottom right.
         }
         else if(rand == 1) // DRAWING BOTTOM RIGHT SQUARE'S OTHER SQUARES, RAND == 1
         {
            int halfSHeight = hei/2;
            int halfSWidth = wid/2;
            
            g.setColor(Color.green);
            g.fillRect(maxX-halfSWidth, maxY+hei, halfSWidth, halfSHeight); // bottom left
            
            g.setColor(Color.blue);
            g.fillRect(maxX+wid, maxY-halfSHeight, halfSWidth, halfSHeight); // top right 
            
            g.setColor(Color.yellow);
            g.fillRect(maxX+wid, maxY+hei, halfSWidth, halfSHeight); // bottom right
            
            drawSquare1(g, maxX-halfSWidth, maxY+hei, 3, halfSWidth, halfSHeight); // bottom left
            drawSquare1(g, maxX+wid, maxY-halfSHeight, 2, halfSWidth, halfSHeight); // top right  
            drawSquare1(g, maxX+wid, maxY+hei, 1, halfSWidth, halfSHeight); // bottom right.

         }        

      }
	}

	public void delay(long n)
	{
		n *= 1000;
		long startDelay = System.nanoTime();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.nanoTime();
	}

}


