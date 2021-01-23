// WAP to store user defined class objects into ArrayList and traverse ArrayList by Iterator and for loop.

package Assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class Lab12 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        
        System.out.println(fruits);

        Iterator<String> fruitIterator = fruits.iterator();
        fruits.set(0, "WaterMelon");
        for (; fruitIterator.hasNext();){
            String fruit = fruitIterator.next();
            System.out.println(fruit);
        }
    }
}
