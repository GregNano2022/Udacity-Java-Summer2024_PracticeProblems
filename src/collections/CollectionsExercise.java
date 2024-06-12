package collections;

import java.util.ArrayList;

public class CollectionsExercise {
    public static void main(String[] args){
        //Collections List of Strings
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Mike");
        strings.add("Abe");

        //for each loop
        for (String name : strings){
            System.out.println(name +":" + name.length());
        }
    }
}
