import java.text.DecimalFormat;
import java.util.Scanner;
public class Shapes{
    public static void main(String args[]){
        
        DecimalFormat df= new DecimalFormat("0.00");
        char shape;
        char choice;
        
        Scanner sc= new Scanner(System.in);
            do{
                System.out.print("C for Circle \nS for Square \nR for Rectangle \nT for Triangle \n Enter shape:");
                shape = sc.next().charAt(0);                   
            	switch (shape){
                	case 'C':
                	case 'c':
                    	System.out.println("What is the radius?");
                		double r= sc.nextDouble();
                		double  area=Math.PI*(r*r) ;
                    	System.out.println("The area of the circle is: " +df.format(area));  
                    	break;
                    
                	case 'S':
                	case 's':    
                    	System.out.println("What is the side of the square?");    
                		double side = sc.nextDouble();
                		double square = side*side;
                    	System.out.println("The area of T Square is: "+df.format(square));
                    	break;
                    
               	 	case 'R':
               	 	case 'r':    
                    	System.out.println("What is the length of the Rectangle?");
                		double length = sc.nextDouble();
                    	System.out.println("What is the width of Rectangle?");
               	 		double width = sc.nextDouble();
                		double rec = length*width;
                    	System.out.println("The area of Rectangle is:"+df.format(rec));
                    	break;
                    
                	case 'T':
               		case 't':    
                    	System.out.println("Enter the width of the Triangle:");
                		double base = sc.nextDouble();
                    	System.out.println("Enter the height of the Triangle:");
                		double height = sc.nextDouble();
                		double tri = (base* height)/2;
                    	System.out.println("Area of Triangle is: "+ df.format(tri));
                    	break;
                                       
                	default:
                    	System.out.println("----Invalid Input----");
            }
                    	System.out.print("Try Again? \nPress and Enter Y for yes or N for no: ");
                    	choice = sc.next().charAt(0);        
            }   	while ((choice == 'y') || (choice == 'Y'));
 	
	}
}

