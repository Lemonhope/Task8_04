
package Task8_04;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void getIntegerList(final int n, LinkedList<Integer> list){
        Random rand =new Random();
        for (int i = 0; i < n; i++) {
            list.add(rand.nextInt(1000));
        }
    }
    public static Integer getMinimum(LinkedList<Integer> list){
        Integer min=list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            min=Math.min(list.get(i), min);
        }
        return min;
    }
    public static void showList(LinkedList<Integer> list){
        for (Integer i:list) {
            System.out.print(i+"  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input number N: ");
        int N = scanner.nextInt();
        if(N<= 0){
            System.out.println("Wrong input number!");
        }else{
            LinkedList<Integer> myList=new LinkedList<>();
            getIntegerList(N, myList);
            showList(myList);
            System.out.println("Min = "+getMinimum(myList));
            // Оптимізуємо отримання мінімального числа - пошук за O(1), якщо відсортуємо список спочатку (сортування займе O(N))
            Collections.sort(myList);
            System.out.println("Min = "+myList.getFirst());
        }
    }
}
