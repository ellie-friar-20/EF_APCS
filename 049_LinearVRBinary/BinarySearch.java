public class BinarySearch
{
    public static void main(String[] args)
    {
        BinarySearch search = new BinarySearch();
        OneThousandSortedRandomNumbers sorted = new OneThousandSortedRandomNumbers();
        int[] x = sorted.getSortedArray();
        search.binarySearch(sorted.getSortedArray(), 7250);
        search.binarySearch(sorted.getSortedArray(), 9463);
        search.binarySearch(sorted.getSortedArray(), 1137);
        search.binarySearch(sorted.getSortedArray(), 4837);
        int counter = 0;
    }
    public int binarySearch(int[] y, int firstNumber, int lastNumber, int target)
    {
        int middleNumber = (firstNumber + lastNumber) / 2;
        while(firstNumber <= lastNumber)
        {
            if(y[middleNumber] < target)
            {
                firstNumber = middleNumber + 1;
            }
            else if(y[middleNumber] == target)
            {
                System.out.println(target + " at the index " + mid);
                System.println(counter + " times to find the number.");
            }
            else
            {
                lastNumber = middleNumber - 1;
            }
            middleNumber = (firstNumber + lastNumber) / 2;
            counter++;
        }
        return -1;
    }
}