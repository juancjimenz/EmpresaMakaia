import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a embarcaciones MAKAIA");
        int opcion;

        do {
            opciones();
            System.out.println("Ingrese opción");
            opcion = entrada.nextInt();
            seleccionOpciones(opcion);
            if(opcion == 3){
                System.out.println("Adios!!!");
            }
        }while (opcion != 3);

    }

    public static void opciones(){
        System.out.println("----MAKAIA----");
        System.out.println("- 1. Yates   -");
        System.out.println("- 2. velero  -");
        System.out.println("- 3. salir   -");
        System.out.println("______________");
    }

    public  static void seleccionOpciones(int i){
        Scanner entrada = new Scanner(System.in);

        Capitan capitan1 =  new Capitan("Juan", "Jimenez", "32478924");
        Embarcaciones embarcaciones = new Embarcaciones(capitan1, 500,20000, 2019, 15);



        switch (i){
            case 1:
                System.out.println("--------Yate--------------");
                System.out.println("Ingrese modelo");
                int anioFabricacionY = entrada.nextInt();
                System.out.println("Ingrese cantidad camarotes");
                int cantidadCamarotesY = entrada.nextInt();
                Yate yate1 = new Yate(capitan1, embarcaciones.getPrecioBase(), embarcaciones.getValorAdicional(), anioFabricacionY, embarcaciones.getEslora(), cantidadCamarotesY);
                System.out.println("El valor del alquiler es de: " + yate1.calculo());
                System.out.println(yate1.validar() + cantidadCamarotesY + " Camarotes");
                System.out.println("El capitan de este yate sera: " + yate1.getCapitan().getNombre() +" "+ yate1.getCapitan().getApellido());
                System.out.println("Con matricula: " + yate1.getCapitan().getMatriculaDeNavegacion());
                System.out.println("__________________________");
                break;
            case 2:
                System.out.println("--------Velero--------------");
                System.out.println("Ingrese modelo");
                int anioFabricacionV = entrada.nextInt();
                System.out.println("Ingrese cantidad mastiles");
                int cantidadMastilesV = entrada.nextInt();
                Velero velero1 = new Velero(capitan1, embarcaciones.getPrecioBase(), embarcaciones.getValorAdicional(), anioFabricacionV, embarcaciones.getEslora(), cantidadMastilesV);
                System.out.println("El valor del alquiler es de: " + velero1.calculo());
                System.out.println(velero1.validar() + cantidadMastilesV + " Mastiles");
                System.out.println("El capitan de este velero sera: " + velero1.getCapitan().getNombre() +" "+ velero1.getCapitan().getApellido());
                System.out.println("Con matricula: " + velero1.getCapitan().getMatriculaDeNavegacion());
                System.out.println("___________________________");
                break;
        }
    }
}