public class CarAge
{
    public static void main(String[] args)
    {
      //add one new car to the Sweet garage//
      Car prius = new Car(2013, 84000, "Toyota", "Two", true);                                       
      //add one new car tp the sweet garage. use new oject and precreated class to assemble a new car.//
      Car lamborghini = new Car(2019, 250000, "Volkswagen Group", "2019 Huracan", true);
      // new car, create a new car, fill out parameters//
      Car volkswagen = new Car(2019, 12000, "Volkswagen Group", "2019 Atlas", true);
      //another new car// 
      Car mazda = new Car(2012,56336, "Mazda Motor Corporation", "2012 Mazda 3", true);
      //final car to be made following the same format as above//
      Car cadillac = new Car(1972, 65354, "General Motors", "Eldorado Convertible", true);
      //creating the calcutlator in the world//
      ReturningCalculator calc = new ReturningCalculator();
      int currentYear = 2019;
      int priusYear = 2013;
      int lamborghiniYear = 2019;
      int volkswagenYear = 2019;
      int mazdaYear = 2012;
      int cadillacYear = 1972;
      //made each year of the car into an integar//
      System.out.println("Oh my prius is " + calc.integerSubtractor(currentYear, prius.year) + " years old.");
      //called to prius out a frase as well as use integar subrtactor with given info//
      System.out.println("Oh my lamborghini is " + calc.integerSubtractor(currentYear, lamborghini.year) + " years old");
      System.out.println("Oh my volkswagen is  " + calc.integerSubtractor(currentYear, volkswagen.year) + " years old");
      System.out.println("Oh my mazda is " + calc.integerSubtractor(currentYear, mazda.year) + " years old");
      System.out.println("Oh my cadillac is " + calc.integerSubtractor(currentYear, cadillac.year) + " years old");
    }
}