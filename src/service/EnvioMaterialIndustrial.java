package service;

import inyeccion.EmailOutlook;
import modelo.Envio;

import java.util.ArrayList;

public class EnvioMaterialIndustrial extends EnvioMaterial {
    public void enviarMaterialEstudiante() {
        Envio envio = new Envio();
        envio.material = new ArrayList<>();
        envio.material.add("Power BI");
        envio.material.add("Excel");
        envio.saludoDirector = "Se envia saludos desde Industrial";
        EmailOutlook email = new EmailOutlook();
        email.enviaCorreo(envio);
    }
}
