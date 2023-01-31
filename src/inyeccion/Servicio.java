package inyeccion;

//Para solucionar el problema de dependency inversion se decide crear una interfaz (EnviarCorreo)
//que será la que intercatue con EmailOutlook, así el servicio dejará de depender de qué tipo de correo
//se quiere usar
public class Servicio {
    private EnviaCorreo interfaz;
    public Servicio(EnviaCorreo interfaz) {
        this.interfaz = interfaz;
    }
    void metodo() {
        interfaz.enviaCorreo();
    }
}