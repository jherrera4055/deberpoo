public class RastreadorRendimiento {
    private int aciertos;
    private int intentos;

    public RastreadorRendimiento() {
        this.aciertos = 0;
        this.intentos = 0;
    }

    public void registrarAcierto() {
        aciertos++;
        intentos++;
    }

    public void registrarFallo() {
        intentos++;
    }

    public double calcularPorcentajeAciertos() {
        return ((double) aciertos / (double) intentos) * 100.0;
    }

    public String generarMensajeFinal() {
        double porcentaje = calcularPorcentajeAciertos();
        if (porcentaje < 75.0) {
            return "Por favor pide ayuda adicional a tu instructor.";
        } else {
            return "Felicidades, estás listo para pasar al siguiente nivel!";
        }
    }
}


