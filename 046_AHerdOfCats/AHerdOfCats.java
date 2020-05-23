public class AHerdOfCats
{
    /* created four cat with name type and weight then i made a method of for loop to go through the array of cats and assgin them an extra pound after they are given their food*/
    Cat trixie = new Cat("Trixie", "British Shorthair", 10.3);
    Cat honey = new Cat("Honey", "Persain", 8.6);
    Cat moo = new Cat("Moo", "Sphynx", 9.1);
    Cat jade = new Cat("Jade", "American Shorthair", 7.5);
    public void feedCats(Cat[] food)
    {
        for(Cat x: food)
        {
            System.out.println(x.getCatName() + " who is a " + x.getCatType() + " type of cat weighs about " + x.getCatWeight() + " lbs. So he needs about one pound of salmon fish.");
            x.setCatWeight(x.getCatWeight() + 1);
            System.out.println("The cat has now gained another pound so it weights " + x.getCatWeight());   
        }
    }
    public static void main(String[] args)
    {
        AHerdOfCats catCluster = new AHerdOfCats();
        Cat[] cats = {catCluster.trixie, catCluster.honey, catCluster.moo, catCluster.jade};
        catCluster.feedCats(cats);
    }
}