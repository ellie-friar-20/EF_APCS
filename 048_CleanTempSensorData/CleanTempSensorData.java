import java.util.*;
public class CleanTempSensorData
{
    /* imported java util to use arraylist and then made instance of clas for SensorData and CleanTempSensorData then made a list of temp into an arraylist varaible made it so data is less or equal to 20 entered */ 
    public static void main(String[] args)
    {
        CleanTempSensorData friar = new CleanTempSensorData();
        SensorData newData = new SensorData();
        ArrayList<Integer> temperature = new ArrayList<Integer>();
        for(int i  : newData.getTempSensorData())
        {
            if( i <= 20)
            {
                temperature.add(i);
            }
        }
        System.out.println(temperature);
    }
}