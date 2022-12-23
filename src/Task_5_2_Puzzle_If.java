import java.util.Scanner;

public class Task_5_2_Puzzle_If {
    public static void main (String[] args){
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?: ");
        Scanner enterAnswer = new Scanner(System.in);
        String answer = enterAnswer.nextLine();

        if (answer == "троллейбус") {
            System.out.println("Правильно!");
        }
        else if (answer == "сдаюсь") {
            System.out.println("Правильный ответ: троллейбус");
        }
        else {
            System.out.println("Подумай еще");
        }

    }
}
