package main;

import modelo.Estudiante;
import service.EnvioMaterialAdministracion;
import service.EnvioMaterialInformatica;
import service.EnvioMaterialIndustrial;
import carreras.Administracion;
import carreras.Informatica;
import carreras.Industrial;

public class Main {

    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Estudiante("Daniel", new Administracion(), new EnvioMaterialAdministracion()),
                new Estudiante("Monica", new Informatica(), new EnvioMaterialInformatica()),
                new Estudiante("Liliana", new Industrial(), new EnvioMaterialIndustrial())
        };
        verMateriasEstudiantes(listadoEstudiantes);
    }

    //Se presentaba una violación del principio Open/Closed, debido a que
    //cuando se tienen muchos IF, se producen problemas de escalabilidad.
    //Para solucionarlo, generamos una clase abstracta de Carrera, a partir
    //de la cual se generaron sus 3 clases hijas (Industrial, Informatica, Administracion).
    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
           estudiante.VerMaterias();
           estudiante.envioMaterial.enviarMaterialEstudiante();
        }
    }
}
