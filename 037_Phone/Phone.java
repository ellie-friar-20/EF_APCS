import java.util.Scanner;
public class Phone { 
    /* set of custom methods that define the phone based on user input and when they are called/whether or not they are*/
    private String version;
    private String color;
    private int batteryLife;
    private int ageOfPhone;
    public Phone(String phoneVersion, String phoneColor, int phoneBatteryLife, int phoneAgeOfPhone) {
        version = phoneVersion;
        color = phoneColor;
        batteryLife = phoneBatteryLife;
        ageOfPhone = phoneAgeOfPhone;
    }
    public void updatedVersion(String lastestVersion) {
        System.out.println("You're latest updated to phone has made it so you have IOS : " + version);
    }
    /*public String versionOfPhone(String phoneVersion) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your IOS version: ");
        version = scan.nextLine();
        if(version.equals("13")) {
            System.out.println("You are up to date with IOS.");
        }
        else {
            System.out.println("You are behind");
        }
        scan.close();
        */
    public void getColor(String color) {
        System.out.println("You're phone color is  " + color + ".");
    }
    public void batteryAmount(int lifeOfBattery) {
        System.out.println("You're battery life is " + batteryLife + " hours.");
    }
    public void totalAge(int howOld) {
        System.out.println("You're phone is about " + ageOfPhone + " years old.");
    }
    public static void main(String[] args) {

    }

}
