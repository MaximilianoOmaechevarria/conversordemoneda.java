import javax.swing.*;
import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        double cantidadMonedaLocal, divisa, tasaDeCambio, miDouble;
        String monedaLocal, monedaCambio, prueba;

        System.out.println("Ingrese  el tipo de cambio al que desea cambiar: ");
        monedaCambio= scan.nextLine();

        System.out.println("Ingrese moneda que desea cambiar: ");
        monedaLocal= scan.nextLine();

        System.out.println("Ingrese la cantidad de moneda a cambiar: ");
        cantidadMonedaLocal=scan.nextDouble();

        System.out.println("Ingrese el valor de 1 "+monedaCambio+"en "+monedaLocal);
        tasaDeCambio= scan.nextDouble();

        divisa=cantidadMonedaLocal/tasaDeCambio;

        scan.close();

        System.out.println(cantidadMonedaLocal+" "+monedaLocal+"equivale a "+divisa+" "+monedaCambio);




    }
}
