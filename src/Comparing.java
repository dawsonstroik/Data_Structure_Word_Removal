//Dawson Stroik
// Assignment 2
// 3/16/2023
import java.util.ArrayList;
//this method compares the alues and removes values from a list that are in b;
public class Comparing {
    public static ArrayList Compare(ArrayList<String>a, ArrayList<String>b){
        a.removeAll(b);
        return a;
    }
}

