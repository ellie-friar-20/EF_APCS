public class AreasOfRectangles 
{
    public static void main(String[] args)
    {
        //calculate and print the area using doubles//
        double rec1AreaInInches = 5.5 * 7.8;
        System.out.println("Area = " + rec1AreaInInches + "inches");
        //the second rectangle still double but now just cm//
        double rec2AreaInCm = 99.4 * 500.352;
        System.out.println("Area Rect2 = " + rec2AreaInCm + "centimeters");
        //now mixing centimeters and inches using double and having calc the area//
        double inchToCm = 2.54;
        double rec3AreaInCm = ((75 *inchToCm) * 800);
        System.out.println("Area Rect3 = " + rec3AreaInCm + "centimeters");
        //created second variable to change now cm to inches//
        double cmtoInch = 0.393701;
        double rec4AreaInInches = (500029.75 * (90029384 * cmtoInch));
        System.out.println("Area Rect4 = " + rec4AreaInInches + "inches");
        //making new variables to now convert to yards//
        double cmToYards = 0.0109361;
        double inchesToYards = 0.0277778;
        double widthForYards = 600000;
        double heightForYards = 8343491034.0;
        double rec5AreaInYards = ((widthForYards * cmToYards) * (heightForYards *inchesToYards));
        System.out.println("Area Rect5 = " + rec5AreaInYards + "yards");
    }
}