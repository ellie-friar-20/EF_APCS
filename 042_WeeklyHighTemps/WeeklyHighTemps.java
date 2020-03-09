public class WeeklyHighTemps {
    /* uses the weather.com info to dicate the input into the array, then print out the array for each day with the temperature*/
    public static void main(String[] args) {
     int[] temperature = {39, 42, 51, 44, 37};
     System.out.println("This is the weather forecast for Saint Paul, on March 9 through March 13. Starting on Monday and ending Friday.");
     System.out.println("Monday: " + temperature[0] + " degrees.");
     System.out.println("Tuesday: " + temperature[1] +  " degrees.");
     System.out.println("Wednesday: " + temperature[2] + " degrees.");
     System.out.println("Thursday: " + temperature[3] + " degrees.");
     System.out.println("Fridau: " + temperature[4] + " degrees."); 
    }
}