package org.example;
import java.util.Scanner;
import java.util.Stack;

//В калькулятор добавьте возможность отменить последнюю операцию
public class Exam3 {
    public static void memoryCalculator(){
        int initialMemory = 15;     // размер памяти моего калькулятора
        int firstNumber, secondNumber;
        int result = 0;
        String operation;
        Scanner scan = new Scanner(System.in);
        Stack <Integer> stackResult = new Stack<>();
        while(initialMemory > 0){   // пока память не заполнена, будет выполняться цикл
            System.out.print("Введите операцию (+, -, *, /, cancel): ");
            operation = scan.next();
            if(operation.equals("cancel")){
                stackResult.pop();
                System.out.println(stackResult);
                continue;
            }
            System.out.print("Введите первое число: ");
            firstNumber = scan.nextInt();
            System.out.print("Введите второе число: ");
            secondNumber = scan.nextInt();
            if(operation.equals("+")) {
                result = firstNumber + secondNumber;
                System.out.println("Результат: " + result);
                stackResult.add(result);
                System.out.println(stackResult);
            }
            if(operation.equals("-")){
                result = firstNumber - secondNumber;
                System.out.println("Результат: " + result);
                stackResult.add(result);
                System.out.println(stackResult);
            }
            if(operation.equals("*")){
                result = firstNumber * secondNumber;
                System.out.println("Результат: " + result);
                stackResult.add(result);
                System.out.println(stackResult);
            }
            if(operation.equals("/")) {
                result = firstNumber / secondNumber;
                System.out.println("Результат: " + result);
                stackResult.add(result);
                System.out.println(stackResult);
            }
            initialMemory--;
        }
        scan.close();
    }

    public static void main(String[] args) {
        memoryCalculator();
    }
}
