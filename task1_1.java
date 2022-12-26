import java.util.Scanner;



public class task1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        int num = in.nextInt();
        int num1 = num * (num +1 ) / 2 ;
        System.out.printf("%d-е треугольное число - %d" , num , num1 );
        in.close();   
    }   
}                                                                                                                                                                                                                                                                                                 