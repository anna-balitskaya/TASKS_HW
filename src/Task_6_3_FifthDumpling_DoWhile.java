import java.util.Scanner;

public class Task_6_3_FifthDumpling_DoWhile {
    public static void main(String[] args){
        Scanner dumpling = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введи номер пельменя:");
            number = dumpling.nextInt();
        } while(number!=5);
        System.out.println("Вот счастливый пельмень!");
    }
}
