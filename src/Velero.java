public class Velero extends Embarcaciones implements Validacion{

    private int cantidadMastiles;


    public Velero(Capitan capitan, int precioBase, int valorAdicional, int anioDeFabricacion, int eslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    @Override
    public String validar() {

        if (cantidadMastiles > 4){
            System.out.print("Este es un velero grande debido a que tiene ");
        }else{
            System.out.print("Este es un velero estandar debido a que tiene ");
        }
        return "";
    }
}




