import java.util.ArrayList;
import java.util.List;

public class Embarcaciones {

    private Capitan capitan;
    private int precioBase;
    private int valorAdicional;
    private int anioDeFabricacion;
    private int eslora;

    public Embarcaciones(Capitan capitan, int precioBase, int valorAdicional, int anioDeFabricacion, int eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioDeFabricacion = anioDeFabricacion;
        this.eslora = eslora;
    }

    public int calculo(){
        if (anioDeFabricacion > 2020){
            precioBase += valorAdicional;
        }
        return precioBase;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public int getValorAdicional() {
        return valorAdicional;
    }


    public int getEslora() {
        return eslora;
    }

}

