public class task3_1 {
    public static void main(String[] args) {
        for (int i =1 ; i<1001;i++){
            int count =0;
            for (int j =2; j< i ;j++){
                if (i%j==0)
                    count ++;            
                }
            if (count ==0 ){           
            
               System.out.printf("%d " ,i);               
            }
            else {
                count =0;
            }
            }
        }
    
    
}

