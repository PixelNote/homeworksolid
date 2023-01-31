package modelo;

import carreras.Carrera;
import service.EnvioMaterial;

public class Estudiante {

    public String nombre;
    public Carrera carrera;
    public EnvioMaterial envioMaterial;

    public Estudiante(String nombre, Carrera carrera, EnvioMaterial envioMaterial) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.envioMaterial = envioMaterial;
    }

    //Se evidenció que al tener la acción de guardar, se violaba el principio
    //de single responsibility, por lo que se decidió crear en la carpeta bd, dicha función
    //para guardar el estudiante en la base de datos
    //void guardarEstudiante() {
    //    System.out.println("Guardando estudiante en base de datos");
    //}
    public void VerMaterias () {
        carrera.mostrarMaterias();
    }

}