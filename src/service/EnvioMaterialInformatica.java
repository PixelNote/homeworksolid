package service;

import inyeccion.EmailOutlook;
import modelo.Envio;

import java.util.ArrayList;

public class EnvioMaterialInformatica extends EnvioMaterial {
    public void enviarMaterialEstudiante() {
        Envio envio = new Envio();
        envio.material = new ArrayList<>();
        envio.material.add("Computador");
        envio.material.add("Mouse");
        envio.saludoDirector = "Jenny envia saludos";
        EmailOutlook email = new EmailOutlook();
        email.enviaCorreo(envio);
    }
}
