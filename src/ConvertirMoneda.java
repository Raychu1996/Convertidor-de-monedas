import java.util.Scanner;

public class ConvertirMoneda {
    private static ConsultarMoneda Consultar;

    public static void convertir (String monedaBase, String monedaTarget, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Moneda moneda = Consultar.buscarMoneda(monedaBase,monedaTarget);
        System.out.println("La tasa de conversion para hoy\n1 "+monedaBase+" = "+moneda.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingresa la cantidad de " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println(cantidad+ " "+monedaBase + " = " +cantidadConvertida + " " + moneda.target_code());

    }
    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura){
        System.out.println("Ingrese el abreviado de la moneda: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda que convertira: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, lectura);

    }
}
