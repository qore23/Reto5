
package Modelo;

import Clases.Proyecto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MdProyecto {

    public ArrayList<Proyecto> ReporteProyecto() {
         ArrayList<Proyecto> reporteProyecto= new ArrayList<>();

        try ( Connection conn = Conexion.getConnection()) {

            String query = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto where clasificacion = 'Casa Campestre' and ciudad in ('Santa Marta', 'Cartagena', 'Barranquilla')";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Proyecto registro = new Proyecto(result.getInt("ID_Proyecto"), result.getString("Constructora"), result.getDouble("Numero_Habitaciones"), result.getString("Ciudad"));
                reporteProyecto.add(registro);
            }
            return reporteProyecto;

        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
        }
        return reporteProyecto;
    }
    
}
