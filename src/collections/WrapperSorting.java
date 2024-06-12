package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class WrapperSorting {
    public static void main(String[] args){
        List<Integer> numbers = new LinkedList<Integer>();

        numbers.add(200);
        numbers.add(201);
        numbers.add(100);
        numbers.add(400);

        //Before Sorting
        for (Integer number : numbers) {
            System.out.println(number);
        }
            //Sorting
            Collections.sort(numbers);
            System.out.println("------Sorted------");

            //after sorting
            for (Integer number : numbers){
                System.out.println(number);
            }
        }
    }

