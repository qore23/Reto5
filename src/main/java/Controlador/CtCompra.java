package Controlador;

import Clases.Compra;
import Modelo.MdCompra;
import java.util.ArrayList;

public class CtCompra {

    MdCompra mdcompra;

    public CtCompra() {
        this.mdcompra = new MdCompra();
    }

    public ArrayList<Compra> listarCompra() {

        ArrayList<Compra> resultado = new ArrayList<>();
        try {
            resultado = this.mdcompra.ReporteCompras();
        } catch (Exception e) {

        }
        return resultado;
    }

}
