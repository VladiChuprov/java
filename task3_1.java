import java.util.Scanner;


public class task4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 1 -e число ");
        int num1 = in.nextInt();        
        System.out.print("Введите 2-e число ");
        int num2= in.nextInt();
        System.out.print("Введите операцию ");
        String name = in.next();
        switch(name){  
            case "+" :
                System.out.println( num1 + num2 );
                break;
            case "-" :
                System.out.println( num1 - num2 );
                break;
            case "*" :
                System.out.println( num1 * num2 );
                break;
            case "/" :
                System.out.println( num2==0 ? "Деление на 0" : (double)num1/num2);
                break;
            default:
                System.out.println("Неизвестное действие");          
        in.close();
        }              
    }
    
}
