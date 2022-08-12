package Controlador;

import Clases.Proyecto;
import Modelo.MdProyecto;
import java.util.ArrayList;

public class CtProyecto {

    MdProyecto mdproyecto;

    public CtProyecto() {
        this.mdproyecto = new MdProyecto();
    }

    public ArrayList<Proyecto> listarProyecto() {

        ArrayList<Proyecto> consulta = new ArrayList<>();
        
        try {
            consulta = this.mdproyecto.ReporteProyecto();
        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
        }
        return consulta;
    }

}
