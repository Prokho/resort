//пользователь вводит 3 числа, которые сохраняються в отдельные переменные.
//задача - поместить в первую самое маленькое число, во вторую - среднее и в третью максимальное число.


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     int a = scanner.nextInt();
     int b = scanner.nextInt();
     int c = scanner.nextInt();
     int t = 0;

     if(a > b && a > c){
        t = a;
        a = c;
        c = t;

     }
     if(b>a && b>c){
         t = b;
         b = c;
         c = t;

     }
        if(a>b){
            t = b;
            b = a;
            a = t;

        }

        System.out.println(a+" "+b+" "+c);
    }
}
