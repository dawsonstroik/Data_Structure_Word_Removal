
//Dawson Stroik
// Assignment 2
// 3/16/2023
import java.io.IOException;
import java.util.*;
import java.io.File;


public class Main {
    public static void main(String[] args)
            //initialising arrays and scanners to read the documents
            throws IOException {
        Scanner scanner = new Scanner(new File(".idea/Quit_India_Speech_Gandhi.txt"));
        ArrayList<String> words = new ArrayList<>();
        while (scanner.hasNextLine()) {
            words.add(scanner.next());
        }
            Scanner scanner2 = new Scanner(new File(".idea/Common_Stop_Words.txt"));
            ArrayList<String> cwords = new ArrayList<>();
            while (scanner2.hasNextLine()) {
                cwords.add(scanner2.next());
        }
            //calling word count method to get wordcount
            int x;
        x = NumberOfWords.total(words);
        System.out.println("The total amount of words in India speech is "+x);
        x = NumberOfWords.total(cwords);
        System.out.println("The total amount of words in Common words is "+x);
        //using distinct count to get distinct amount of words
                int numOfUniqueWords = (int) words.stream().distinct().count();
        System.out.println("The speech has this many unique words: "+numOfUniqueWords);
        int numOfUniqueCWords = (int) cwords.stream().distinct().count();
        System.out.println("The common words has this many unique words:"+numOfUniqueCWords);
        //making the speech lowercase
        words = LowerCase.LowerCase(words);
        System.out.println("The speech has this many distant words "+words.stream().distinct().count());
        //comparing the arrays to find similar values and then deleting the same values.
        Comparing.Compare(words,cwords);
        System.out.println("The speech has this many words after the common words are taken out "+words.size());

        //WordFrequency.Frequency(words);










    }
}