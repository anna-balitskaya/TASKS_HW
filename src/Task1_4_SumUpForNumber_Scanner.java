import java.util.Scanner;

public class Task1_4_SumUpForNumber_Scanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи любое целое положительное число:");
        int number = scan.nextInt();
        System.out.println("Вы ввели: "+number);
        int sum = 0;
        for (int i=1; i<=number; i++){
            sum = sum +i;
        }
        System.out.println("Сумма чисел от 1 до " + number + " равна: " + sum);
    }
}
