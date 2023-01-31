package service;

import inyeccion.EmailOutlook;
import modelo.Envio;

import java.util.ArrayList;

public class EnvioMaterialAdministracion extends EnvioMaterial {
    public void enviarMaterialEstudiante() {
        Envio envio = new Envio();
        envio.material = new ArrayList<>();
        envio.material.add("Documentos");
        envio.material.add("Constitución");
        envio.saludoDirector = "Se envia saludos desde Administracion";
        EmailOutlook email = new EmailOutlook();
        email.enviaCorreo(envio);
    }
}
