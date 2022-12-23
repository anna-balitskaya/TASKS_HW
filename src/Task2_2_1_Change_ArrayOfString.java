public class Task2_2_1_Change_ArrayOfString {
    public static void main(String[] args){
        String [] a = {"Без ", "труда ", "не ", "выловишь ", "и ", "рыбку ", "из ", "пруда "};
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;
        String temp;

        for (int i =0 ; i<n/2; i++){
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
