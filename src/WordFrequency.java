//Dawson Stroik
// Assignment 2
// 3/16/2023


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
//this method takes in an array and computes how many of each word are in the speech. the top 100.
public class  WordFrequency {
    public static ArrayList Frequency(ArrayList<String>a) {
        String[] distinct = a.toArray(new String[a.size()]);
        Arrays.sort(distinct);
        int[] frequencyArray = new int[distinct.length];
        int Count = 0;

        //counting the frequency of elements in the ArrayList
        for (int i = 0; i < distinct.length; i++) {
            String element = distinct[i];
            int frequency = 1;
            for (int j = i + 1; j < distinct.length; j++) {
                if (distinct[j].equals(element)) {
                    frequency++;
                    i = j;
                } else {
                    break;
                }
            }
            frequencyArray[Count] = frequency;
            Count++;
        }

        //sorting the frequency array by value in descending order
        List<Integer> sorted = new ArrayList<Integer>();
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {
                sorted.add(i);
            }
        }
        try {
            //I am having trouble gettting it to print to my document. It printed once but it was not correct
            //I then changed a few things and now I cannot get it to find my document.
            FileWriter file = new FileWriter("src/A2_Word_Word_Cloud.txt");
            int count = 0;
            for (int i = 0; i < sorted.size(); i++) {
                int elementIndex = sorted.get(i);
                String element = distinct[elementIndex];
                int frequency = frequencyArray[elementIndex];
                file.write(element + "    " + frequency + "\n");
                count++;
                if (count == 100) {
                    break;
                }
            }
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return a;
    }





}



