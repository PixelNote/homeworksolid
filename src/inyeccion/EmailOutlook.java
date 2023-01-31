package inyeccion;

import modelo.Envio;

//Se decidio apartar esta clase para solucionar la violación de dependency inversion,
//ya que se estaba dependiendo directamente de EmailOutlook, lo cual en dado caso de querer cambiar
//de servicio, incurriría en dependencias de módulos de alto nivel con módulos de bajo nivel.
public class EmailOutlook {

    public void enviaCorreo(Envio envio) {
        System.out.println("ESTABLECIENDO CONEXION CON EL SERVIDOR");
        System.out.println("EMAIL ENVIADO y correspondencia " + envio);
    }
}
