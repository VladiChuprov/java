import java.util.Scanner;


public class task2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        int num = in.nextInt();
        int j = 1;       
        for (int i=1 ; i < num+1 ; i++)        
            j *= i;        
        System.out.printf("Факториал равен %d", j);
        in.close();
    }  
    
}
