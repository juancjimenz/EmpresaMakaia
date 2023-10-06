public class Yate extends Embarcaciones implements Validacion{
    private int cantidadCamarotes;

    public Yate(Capitan capitan, int precioBase, int valorAdicional, int anioDeFabricacion, int eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public String validar() {

        if (cantidadCamarotes > 7){
            System.out.print("Este yate es mas lujoso debido a que tiene ");
        }else{
            System.out.print("Este yate es de tipo estandar debido a que tiene ");
        }

        return "";
    }
}
