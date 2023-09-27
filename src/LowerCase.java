//Dawson Stroik
// Assignment 2
// 3/16/2023
import java.util.ArrayList;
public class LowerCase {
    //takes in an array and makes the string lowercase, also takes out commmas, I tried taking out periods but nothing worked then
    public static ArrayList LowerCase(ArrayList<String> a){
        ArrayList<String> b = new ArrayList<>();
        int x = 0,z =a.size();
        while(x <z){
            String c = a.get(x);
            c =c.toLowerCase();
            c =c.replaceAll(",","");
            //c =c.replaceAll(".","");
            b.add(c);
            x++;
        }
        return b;
    }

}
