
package Controlador;

import Clases.Lider;
import Modelo.MdLider;
import java.util.ArrayList;

public class CtLider {
    MdLider mdlider;

    public CtLider() {
        this.mdlider = new MdLider();
    }

       
    public ArrayList<Lider> listarLider(){
        
        ArrayList<Lider> consulta = new ArrayList<>();
        try {
            consulta = this.mdlider.ReporteLideres();
        } catch (Exception e) {
            System.out.println("Exception"+e.getMessage());
        }
        
        return consulta;
        
    }
}
