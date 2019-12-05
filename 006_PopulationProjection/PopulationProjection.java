public class PopulationProjection
{
    public static void main(String[] args)
    {
        int currentPopulation = 312032486;
        int oneYear = 365;
        //one birth every 7 seconds and yearly births//
        int newBirth = 7;
        int yearlyBirths = (((86400 * oneYear) / newBirth));
        // one death every 13 seconds//
        int newDeath = 13;
        int yearlyDeath = (((86400 * oneYear) / newDeath));
        //one new immigrant every 45 seconds//
        int newImmigrant = 45;
        int yearlyImmigrant = (((86400 * oneYear) / newImmigrant));
        //total yearly population//
        int yearlyPopulation = yearlyBirths + yearlyImmigrant - yearlyDeath;
        //printing the population for five years//
        System.out.println("The Current Population =" + currentPopulation);
        System.out.println("The First Years Population ="+ (currentPopulation + yearlyPopulation));
        System.out.println("The Second Years Population =" + (currentPopulation + yearlyPopulation + yearlyPopulation));
        System.out.println("The Third Years Population =" + (currentPopulation + yearlyPopulation + yearlyPopulation + yearlyPopulation));
        System.out.println("The Fourth Years Population =" + (currentPopulation + yearlyPopulation + yearlyPopulation + yearlyPopulation + yearlyPopulation));
        System.out.println("The Fifth Years Population =" + (currentPopulation + yearlyPopulation + yearlyPopulation + yearlyPopulation + yearlyPopulation + yearlyPopulation));
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               