public class SweetGarage
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

      //printing out the info contained in each of the new cars//
      System.out.println("What is in my sweet garage? Oh its a Prius. My Prius is a " + prius.year + " with " + prius.milesDriven + " miles. Its manufacturer is " + prius.manufacturerName + " and the model is " + prius.modelName);
      System.out.println("What else in my garage. I have a lamborghini " + lamborghini.year + " with " + lamborghini.milesDriven + " miles. Its manufacturer is " + lamborghini.manufacturerName + " and the model is " + lamborghini.modelName);
      System.out.println("I see another car. It is a Volkswagen "+ volkswagen.year + " with " + volkswagen.milesDriven + " miles. Its manufacturer is " + volkswagen.manufacturerName + " and the model is " + volkswagen.modelName);
      System.out.println("Omg! There is another car back here. It is a mazda from " + mazda.year + " with " + mazda.milesDriven + " miles. Its manufacturer " + mazda.manufacturerName + "and the model is " + mazda.modelName);
      System.out.println("This has to the last car back here. I see a caillac from " + cadillac.year + " with " + cadillac.milesDriven + " miles. I think the manufacturer is " + cadillac.manufacturerName + " and the model is " + cadillac.modelName);
      cadillac.revEngine();
      prius.engageTurbo();

    }
}
  