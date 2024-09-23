import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nombreCliente = "Tony Star";
        String tipoDeCuenta = "Corriente";
        double saldo = 16000;
        //variablespara el menu
        int opcion = 0;


        System.out.println("***************************************");
        System.out.println("Nombre de cliente: "+ nombreCliente);
        System.out.println("Tipo de cuenta: "+ tipoDeCuenta);
        System.out.println("Saldo: $" +saldo);
        System.out.println("****************************************");
        System.out.println();

       Scanner teclado = new Scanner(System.in);


        //creacion menu
        while (opcion!=9){

            String menu = """
                Menu
                1- Consultar saldo
                2- Retirar Dinero
                3- Depositar Dinero
                9- Salir
                """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){

                case 1:
                    System.out.println("El salo en la cuenta es: $" + saldo);
                    break;

                case 2:
                    System.out.println("Cuanto dinero desea retirar? ");
                    double valorRetirar = teclado.nextDouble();

                    if (valorRetirar > saldo){
                        System.out.println("Saldo Isuficiente");
                    }else {
                        saldo = saldo-valorRetirar;
                        System.out.println("El saldo en la cuenta es: $" +saldo);
                    }
                    break;

                case  3:
                    System.out.println("Cuanto dinero desea depositar? ");
                    double depositar = teclado.nextDouble();
                    saldo = saldo + depositar;
                    System.out.println("El salo en la cuenta es: $"+saldo);

                case 9:
                    System.out.println("Gracias por usar nuestros servicios");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }





    }
}
