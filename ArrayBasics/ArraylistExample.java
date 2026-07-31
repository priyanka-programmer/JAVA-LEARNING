package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
      Scanner in=new Scanner(System.in);


        System.out.println(list);
        System.out.println(list.contains(3));
        list.set(0,9);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        System.out.println("Enter elements:");
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.print(list.get(i));
        }

    }


}
