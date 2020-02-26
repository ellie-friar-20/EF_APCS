import java.util.Scanner;
public class ScrabbleCalculator
{
    public static void main(String[] args)
    {
        String word;
        int points = 0;
        int allA = 9;
        int allB = 2;
        int allC = 2;
        int allD = 4;
        int allE = 12;
        int allF = 2;
        int allG = 3;
        int allH = 2;
        int allI = 9;
        int allJ = 1;
        int allK = 1;
        int allL = 4;
        int allM = 2;
        int allN = 6;
        int allO = 8;
        int allP = 2;
        int allQ = 1;
        int allR = 6;
        int allS = 4;
        int allT = 6;
        int allU = 4;
        int allV = 2;
        int allW = 2;
        int allX = 1;
        int allY = 2;
        int allZ = 1;
        int allBlank = 2;
        int blankPoint = 0;
        int aPoint= 0;
        int bPoint = 0;
        int cPoint = 0;
        int dPoint = 0;
        int ePoint = 0;
        int fPoint = 0;
        int gPoint = 0;
        int hPoint = 0;
        int iPoint = 0;
        int jPoint = 0;
        int kPoint = 0;
        int lPoint = 0;
        int mPoint = 0;
        int nPoint = 0;
        int oPoint = 0;
        int pPoint = 0;
        int qPoint = 0;
        int rPoint = 0;
        int sPoint = 0;
        int tPoint = 0;
        int uPoint = 0;
        int vPoint = 0;
        int wPoint = 0;
        int xPoint = 0;
        int yPoint = 0;
        int zPoint = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("What word do you want to make?");
        word = scan.nextLine();
        System.out.println("Checking to see if your word can be built out of tiles available");
        scan.close();
        for (int i = 0; i < word.length(); i++) {                                     
            if (word.substring(i, i + 1).equalsIgnoreCase("a")) {
                aPoint++;
            } 
            else if(word.substring(i, i + 1).equalsIgnoreCase("b")) {
                bPoint++;
            }

             else if(word.substring(i, i + 1).equalsIgnoreCase("c")) {
                cPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("d")) {
                dPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("e")) {
                ePoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("f")) {
                fPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("g")) {
                gPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("h")) {
                hPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("i")) {
                iPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("j")) {
                jPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("k")) {
                kPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("l")) {
                lPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("m")) {
                mPoint++;
            } else if(word.substring(i, i + 1).equalsIgnoreCase("n")) {
                nPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("o")) {
                oPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("p")) {
                pPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("q")) {
                qPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("r")) {
                rPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("s")) {
                sPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("t")) {
                tPoint++; 
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("u")) {
                uPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("v")) {
                vPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("w")) {
                wPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("x")) {
                xPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("y")) {
                yPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase("z")) {
                zPoint++;
            }
             else if(word.substring(i, i + 1).equalsIgnoreCase(" ")) {
                blankPoint++;
            }
             else {
                System.out.println("You cant make that word sorry there are not enough tiles");
            }

            for(int ii = 0; ii < word.length(); ii++) {
                if (word.substring(ii, ii + 1).equals("a") || word.substring(ii, ii + 1).equals("e") || word.substring(ii, ii + 1).equals("i") || word.substring(ii , ii + 1).equals("l") || word.substring(ii, ii + 1).equals("n") || word.substring(ii, ii + 1).equals("o") || word.substring(ii, ii + 1).equals("r") || word.substring(ii, ii + 1).equals("s") || word.substring(ii, ii + 1).equals("t") || word.substring(ii, ii + 1).equals("u")) {
                    points++;
                } else if(word.substring(ii, ii + 1).equals("d") || word.substring(ii, ii + 1).equals("g")) {
                    points += 2;
                } else if(word.substring(ii, ii + 1).equals("b") || word.substring(ii, ii + 1).equals("c") || word.substring(ii, ii + 1).equals("m") || word.substring(ii , ii + 1).equals("p")){
                    points += 3;
                } else if(word.substring(ii, ii + 1).equals("f") || word.substring(ii, ii + 1).equals("h") || word.substring(ii, ii + 1).equals("v") || word.substring(ii , ii + 1).equals("w") || word.substring(ii, ii + 1).equals("y")) {
                    points += 4;
                } else if(word.substring(ii, ii + 1).equals("k")) {
                    points += 5;
                } else if(word.substring(ii, ii + 1).equals("j") || word.substring(ii, ii + 1).equals("x")) {
                    points += 8;
                } else if(word.substring(ii, ii + 1).equals("q") || word.substring(ii, ii + 1).equals("z")) {
                    points += 10;
                } else if( word.substring(ii, ii + 1).equals(" ")) {
                    points += 0;
                }
                System.out.println("You word is worth " + points);
            }
        }

    }
}

        
