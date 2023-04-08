package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

////Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёт «перевёрнутый» список.
public class Exam1 {
    public static LinkedList <Integer> fillList(LinkedList <Integer> list){
        int countElement = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов в списке: ");
        countElement = sc.nextInt();
        for(int i = 0 ; i < countElement; i++){
            list.add((int)(Math.random()*20));
        }
        return list;
    }

    public static Queue<Integer> reverseList(LinkedList <Integer> list){
        Queue <Integer> newList = new LinkedList<>();
        for(int i = list.size(); i > 0; i--){
            newList.add(list.pollLast());
        }
    return newList;
    }

    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        fillList(list);
        System.out.println(list);
        Queue <Integer> queue = reverseList(list);
        System.out.println(queue);

    }
}
