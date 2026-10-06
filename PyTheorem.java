
/**
 * 
 *This program calculates the hypotenuse of two different right angled triangles
 * Milind Tuladhar
 * October 5th
 */
public class PyTheorem
{   
    public static void main(String[] args){
    
    //For triangle 1
    int min = 5;
    int max = 23;
    int p1 = (int)(Math.random()*(max-min))+min;     //perpendicular1  
    int b1 = (int)(Math.random()*(max-min))+min;     //base1
    double h1 = Math.sqrt(p1*p1+b1*b1);                  //hypotenuse1 calculation
    
    System.out.println("Traingle: 1\t Side1: "+ p1 + "\tSide2:"+ b1 + "\tHypotenuse:" + h1);
    
    //For triangle 2
    int p2 = (int)(Math.random()*(max-min))+min;    //perpendicular2 
    int b2 = (int)(Math.random()*(max-min))+min;    //base2
    double h2 = Math.sqrt(p2*p2+b2*b2);                 //hypotenuse2 calculation
    
    System.out.println("Traingle: 2 \t Side1: "+ p2 + "\tSide2:"+ b2 + "\tHypotenuse:" + h2);
    
    
    
    
    
    
    }// 
}