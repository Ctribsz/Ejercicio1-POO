import java.util.Random;

public class calcMethods {
    public static boolean sumTotal() {
        Random rd = new Random();

        int rand_1 = rd.nextInt(0,33000);

        int a = rd.nextInt(0,15000); 
        int b = rd.nextInt(0,15000);

        int sumT = a+b+rand_1;

        if(sumT % 2 == 0){
            System.out.println("Eres uno de los elegidos para comprar un boleto");
            return true;
        }else {
            System.out.println("Lo sentimos no eres apto a comprar un boleto.");
            return false;
        } 
        
    }

    
}
