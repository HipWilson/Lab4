public class RadioClaseC implements InterfaceGeneral, InterfaceClaseC {
    private boolean encendido = false;
    private int volumen = 10;
    private String banda = "FM";
    private double frecuencia = 88.1;
    private String[] emisorasGuardadas = new String[50];
    private int emisoraIndex = 0;

    // Metodos de FuncionalidadesGenerales
    @Override
    public String encender() {
        this.encendido = true;
        return mostrarEstado("Radio encendido.");
    }

    @Override
    public String apagar() {
        this.encendido = false;
        return mostrarEstado("Radio apagado.");
    }

    @Override
    public String cambiarVolumen(int incremento) {
        if (encendido) {
            this.volumen += incremento;
            return mostrarEstado("Volumen: " + this.volumen);
        } else {
            return mostrarEstado("El radio esta apagado, Encendelo primero.");
        }
    }

    @Override
    public String cambiarBanda() {
        if (encendido) {
            banda = banda.equals("FM") ? "AM" : "FM";
            return mostrarEstado("Banda actual: " + banda);
        }
        return mostrarEstado("El radio esta apagado, Encendelo primero.");
    }

    @Override
    public String cambiarEmisora(double incremento) {
        if (encendido) {
            frecuencia += incremento;
            return mostrarEstado("Frecuencia actual: " + frecuencia + " " + banda);
        }
        return mostrarEstado("El radio esta apagado, Encendelo primero.");
    }

    @Override
    public String guardarEmisora(String emisora) {
        if (encendido && emisoraIndex < emisorasGuardadas.length) {
            emisorasGuardadas[emisoraIndex++] = emisora;
            return mostrarEstado("Emisora guardada: " + emisora);
        }
        return mostrarEstado("No se pudo guardar la emisora, Verifique el estado del radio.");
    }

    @Override
    public String cargarEmisora(int posicion) {
        if (encendido && posicion < emisorasGuardadas.length && emisorasGuardadas[posicion] != null) {
            return mostrarEstado("Cargando emisora guardada en posicion " + posicion + ": " + emisorasGuardadas[posicion]);
        }
        return mostrarEstado("Posicion invalida o emisora no guardada.");
    }

    @Override
    public String conectarTelefono() {
        return mostrarEstado("Telefono conectado.");
    }

    @Override
    public String desconectarTelefono() {
        return mostrarEstado("Telefono desconectado.");
    }

    // Metodos de FuncionalidadesClaseC
    @Override
    public String ModoEspera() {
        if (encendido) {
            return mostrarEstado("Cambiando a llamada en espera.");
        }
        return mostrarEstado("El radio esta apagado, Encendelo primero.");
    }

    @Override
    public String VerPronostico() {
        if (encendido) {
            return mostrarEstado("Pronostico del tiempo: Soleado, 25°C.");
        }
        return mostrarEstado("El radio esta apagado, Encendelo primero.");
    }

    // Metodo auxiliar para generar el estado
    private String mostrarEstado(String mensaje) {
        return mensaje;
    }
}
