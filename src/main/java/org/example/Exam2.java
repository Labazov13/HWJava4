package org.example;
import java.util.LinkedList;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//• enqueue() — помещает элемент в конец очереди,
//• dequeue() — возвращает первый элемент из очереди и удаляет его,
//• first() — возвращает первый элемент из очереди, не удаляя.
public class Exam2 {

    public static void enqueue(LinkedList <Integer> list, Integer i){
        list.add(i);
    }

    public static void dequeue(LinkedList <Integer> list){
        System.out.println(list.get(0));
        list.remove(0);
    }

    public static Integer first(LinkedList <Integer> list){
        System.out.println(list.get(0));
        return list.get(0);
    }


    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        Exam1.fillList(list);
        System.out.println(list);
        enqueue(list, 25);
        System.out.println(list);
        dequeue(list);
        System.out.println(list);
        first(list);
        System.out.println(list);

    }
}
