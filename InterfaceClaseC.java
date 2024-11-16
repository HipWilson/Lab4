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
