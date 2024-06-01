/*
Nombre: Galo Guevara
Deber: S9 Taller de arreglos , colecciones y diseño avanzado de clases
Descripcion: realizar el taller a partir del repositorio: https://github.com/BERNYSAN77/EjercicioParqueadero.git
 */
import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();

        System.out.println("Puestos libres: "+ parqueadero.calcularPuestosLibres());

        parqueadero.entrarCarro("PPP-001");
        parqueadero.entrarCarro("PAA-002");
        parqueadero.entrarCarro("PBA-234");

        System.out.println("Puestos libres: "+parqueadero.calcularPuestosLibres());
        System.out.println("Promedio horas: "+parqueadero.darTiempoPromedio());
        System.out.println("Carro: "+ parqueadero.DevuelveCarroMayorTiempo().darPlaca());
        System.out.println("Hay carro más de ocho horas: "+ parqueadero.hayCarroMasDeOchoHoras());

        ArrayList<Carro> carrosTresHoras =new ArrayList<>();
        carrosTresHoras=parqueadero.darCarrosMasDeTresHorasParqueados();
        if (!carrosTresHoras.isEmpty()){
            parqueadero.mostrarLista(carrosTresHoras);
        } else {
            System.out.println("No hay carros con más de 3 horas parqueado");
        }

        System.out.println("Hay carros con placas iguales es: "+ parqueadero.hayCarrosPlacaIgual());
        //parqueadero.hayCarrosPlacaIgual();

        parqueadero.contarCarrosQueComienzanConPlacaPB();
        System.out.println("Hay carros con más de 24 horas: "+ parqueadero.hayCarroCon24Horas());
    }

}