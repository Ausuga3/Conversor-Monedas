import com.google.gson.Gson;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws Exception {
        ConsultaDivisa consulta = new ConsultaDivisa();
        Scanner scanner = new Scanner(System.in);
        int inicio = 0;
        int cantidad = 0;
        String divisa = "null";
        while (inicio == 0) {
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1.Dolar (USD) a Peso Argentino()" +
                    "\n2. Peso Argentino() a Dolar (USD)"+
                    "\n3. Dolar(USD) a Real Brasileño())"+
                    "\n4. Real Brasileño a Dolar(USD)"+
                    "\n5. Dolar a Peso Colombiano"+
                    "\n6. Peso Colombiano a Dolar"+
                    "\n7. Salir"
            );
            int opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Digite el numero de dolares");
                    cantidad = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Digite el numero de pesos");
                    cantidad = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Digite el numero de dolares");
                    cantidad = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Digite el numero de pesos");
                    cantidad = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Digite el numero de dolares");
                    cantidad = scanner.nextInt();
                    break;
                case 6:
                    System.out.println("Digite el numero de pesos");
                    cantidad = scanner.nextInt();
                    break;
                case 7:
                    System.out.println("Hasta Pronto");
                    inicio = 1;
                    break;
                case 8:
                    try{
                        scanner.nextLine();
                        System.out.println("Que divisa deseas ver?");
                        divisa = scanner.nextLine();
                        Divisa divisas = consulta.buscarDivisa(divisa);
                        System.out.println(divisas);

                    }catch (Exception e){
                        System.out.println("No existe esa divisa");
                    }



            }
        }
    }
}
