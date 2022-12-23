import java.util.Scanner;

public class Task_5_1_Puzzle_Switch {
    public static void main (String[] args){
        String answer;
        boolean exit;

        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?: ");
        Scanner enterAnswer = new Scanner(System.in);

        exit = false;
        for(int i = 1; i <= 3; i++) {
            if (exit == true)
                break;

                answer = enterAnswer.nextLine();
                switch (answer) {
                    case "троллейбус":
                        System.out.println("Правильно!");
                        exit = true;
                        break;
                    case "сдаюсь":
                        System.out.println("Правильный ответ: троллейбус");
                        exit = true;
                        break;
                    default:
                        System.out.println("Подумай еще");
                }
            }
    }
}
