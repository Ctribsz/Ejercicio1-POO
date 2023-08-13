import java.util.Scanner;

public class Drive{
    public static void main(String[] args) {
        System.out.println("Hola en este programa te ayudaremos a verificar y comprar tus boletos para Tomorrowland\n");
        System.out.println("---------------------------------------------------------------------------------------\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Necesitamos algunos datos para poder hacer todo el proceso de manera correcta\n");
        System.out.println("Tu nombre:\n");
        String userName = sc.nextLine();
        System.out.println("DPI:\n");
        double dpiUser = sc.nextDouble();
        System.out.println("Cantidad de boletos a comprar:\n");
        int canUser = sc.nextInt();
        System.out.println("Presupuesto maximo:");
        int prUser = sc.nextInt();
        
        calcMethods cm = new calcMethods();
        
        if (cm.sumTotal() == true){
        cm.verPresupuesto(prUser);    
        } else {
            System.exit(0);
        }
        
    }
}