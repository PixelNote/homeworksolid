package modelo;
import bd.DataBase;

public class GuardarEstudiante {

    void guardarEstudiante(Estudiante estudiante) {
        System.out.println("Guardando estudiante en base de datos");
        DataBase db = new DataBase();
        db.guardar();
    }
}
