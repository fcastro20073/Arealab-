/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arealab;

/**
 *
 * @author 20073 Francisco Castro-Wetzstein
 */
import java.util.Scanner;
 

public class AreaLab {

    
    
    private static Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int surfaceArea = 0;
        surfaceArea += triangle();
        surfaceArea += triangle();
        surfaceArea += circle();
        surfaceArea += circle ();
        surfaceArea += circle();
        surfaceArea += parrallelogram();
        surfaceArea += square();
        System.out.println ("");
        System.out.println ("Now the data for the empty space inside the square.");
        surfaceArea -= square();
        System.out.println ("\nThe total area of Michael's truck is: " + surfaceArea);
    }
        
    public static int triangle (){ 
    
        System.out.println ("\nThe area of a triangle is 1/2 * base * height");
        System.out.println ("base >");
        int base = in.nextInt();
        System.out.println ("height >");
        int height = in.nextInt();
        int area = (int)(0.5 * base * height);
        System.out.println ("The area of this shape is: " + area);
        return area;
        
        
    }
    
    public static int circle () {
         System.out.println ("\nThe area of a circle is PI * radius^2");
         System.out.println ("Provide radius: ");
         int radius = in.nextInt();
         System.out.println ("The radius of the circle is: " + radius);
         double circleArea = (int)( Math.pow(radius, 2)* Math.PI); 
         System.out.println ("The area of the circle is "+ circleArea);
         return (int) circleArea; 
         
        
    }
    
    public static int parrallelogram () {
        System.out.println ("\nThe area of a circle is base * height");
        System.out.println ("Provide base: ");
        int baseParrallelogram = in.nextInt();
        System.out.println ("The base of the parrallelogram is " + baseParrallelogram);
        System.out.println ("Provide height: ");
        int heightParrallelogram = in.nextInt();
        System.out.println ("The height of the parrallelogram is " + heightParrallelogram);
        double areaParrallelogram = (heightParrallelogram * baseParrallelogram);
        System.out.println ("The area of the parrallelogram is "+ areaParrallelogram);
        return (int)areaParrallelogram; 
    
    }
    
    public static int square () {
        System.out.println ("\nThe area of a square is base * height or a side squared");
        System.out.println ("Provide the lenght of one side of the square");
        int sideSquare = in.nextInt();
        System.out.println ("The side of the sqaure is "+ sideSquare);
        int areaSquare = (int)(Math.pow(sideSquare, 2));
        System.out.println ("The area of the square is " + areaSquare);
        return (int)areaSquare; 
               
         
         
         
         
         
    }

}
