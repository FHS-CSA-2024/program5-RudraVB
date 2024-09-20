//import stuff here?

//Your code here
//import stuff here?
public class Program5{
    public static void main(String[] args){
        //assign each vehicle a variable
        String vehicle1 = "Royale";
        String vehicle2 = "Koopa King";
        String vehicle3 = "Pipe Frame";
        String vehicle4 = "Badwagon";
        
        //assign miles a variable
        double miles1 = 286;
        double miles2 = 412;
        double miles3 = 361;
        double miles4 = 161;
        
        //assign gallons a variable
        double gallons1 = 9;
        double gallons2 = 40;
        double gallons3 = 18;
        double gallons4 = 11;
        
        //calculate miles per gallons
        double mpg1 = miles1/gallons1;
        double mpg2 = miles2/gallons2;
        double mpg3 = miles3/gallons3;
        double mpg4 = miles4/gallons4;
        
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon: ");
        System.out.println();
        
        //Royale
        System.out.print(vehicle1 + " averaged ");
        System.out.printf("%.1f", mpg1);
        System.out.println(" m/g");
        System.out.println();
        
        //Koopa King
        System.out.print(vehicle2 + " averaged ");
        System.out.printf("%.1f", mpg2);
        System.out.println(" m/g");
        System.out.println();
        
        //Pipe Frame
        System.out.print(vehicle3 + " averaged ");
        System.out.printf("%.1f", mpg3);
        System.out.println(" m/g");
        System.out.println();
        
        //Badwagon
        System.out.print(vehicle4 + " averaged ");
        System.out.printf("%.1f", mpg4);
        System.out.print(" m/g");
        System.out.println();
    
    }
}

//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon: 

Royale averaged 31.8 m/g

Koopa King averaged 10.3 m/g

Pipe Frame averaged 20.1 m/g

Badwagon averaged 14.6 m/g

*/


