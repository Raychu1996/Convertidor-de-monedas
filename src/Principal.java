import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion=0;
        while (opcion != 9){
            System.out.println("*************************************\n" +
                    "BIENVENIDOS AL CONVERTIDOR DE MONEDAS\n\n" +
                    "Ingrese la conversion a realizar \n\n" +
                    "1. Peso Colombiano a Dolar\n"+
                    "2. Peso Argentino a Dolar\n" +
                    "3. Reales a Dolar\n" +
                    "4. Sol a Dolar\n" +
                    "5. Dolar a Peso Colombiano\n" +
                    "6. Dolar a Peso Argentino\n" +
                    "7. Dolar a Real\n" +
                    "8 Convertir a otra Moneda\n" +
                    "9. Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("COP","USD",lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARG","USD",lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("BRL","USD", lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("SOL","USD", lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD","COP", lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("USD","ARG", lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertir("USD","BRL", lectura);
                    break;
                case 8:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 9:
                    System.out.println("GRACIAS SALIENDO........");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;








            }
        }



    }



}
