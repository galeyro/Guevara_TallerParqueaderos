public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();

        System.out.println("Puestos libres: "+ parqueadero.calcularPuestosLibres());

        parqueadero.entrarCarro("PPP-001");
        parqueadero.entrarCarro("PAA-002");

        System.out.println("Puestos libres: "+parqueadero.calcularPuestosLibres());
        System.out.println("Promedio horas: "+parqueadero.darTiempoPromedio());
        System.out.println("Carro: "+ parqueadero.DevuelveCarroMayorTiempo().darPlaca());
        System.out.println("Hay carro más de ocho horas: "+ parqueadero.hayCarroMasDeOchoHoras());
    }

}