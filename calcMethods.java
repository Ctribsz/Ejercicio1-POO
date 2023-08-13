import java.util.Random;

public class calcMethods {
    int loc1 = 20;
    int loc5 = 20;
    int loc10 = 20;

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
            System.out.println("Lo sentimos no eres apto a comprar un boleto. Vuelve a intentarlo.");
            return false;
        } 

    }

     public static void verPresupuesto(int val) {
        if(val >= 2300){
            Random rand = new Random();
            int rand1 = rand.nextInt(3) + 1;
            if(rand1 == 1){
                System.out.println("Felicidades fuiste seleccionado para estar en la localidad 1");
            } else if (rand1 == 2){
                System.out.println("Felicidades fuiste seleccionado para estar en la localidad 5");
            } else { 
                System.out.println("Felicidades fuiste seleccionado para estar en la localidad 10");
            }
        } else if(val >= 695){
            Random rand = new Random();
            int rand1 = rand.nextInt(2) + 1;
            if(rand1 == 1){
                System.out.println("Felicidades fuiste seleccionado para estar en la localidad 1");
            } else if (rand1 == 2){
                System.out.println("Felicidades fuiste seleccionado para estar en la localidad 5");
            }  
        } else {
            System.out.println("Felicidades fuiste seleccionado para estar en la localidad 1");
        }
    }
}