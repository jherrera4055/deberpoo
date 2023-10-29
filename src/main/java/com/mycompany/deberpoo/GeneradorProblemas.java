import java.security.SecureRandom;

public class GeneradorProblemas {
    private final int nivelDificultad;
    private final int tipoProblema;
    private final SecureRandom random;

    public GeneradorProblemas(int nivelDificultad, int tipoProblema) {
        this.nivelDificultad = nivelDificultad;
        this.tipoProblema = tipoProblema;
        this.random = new SecureRandom();
    }

    public int[] generarOperandos() {
        int limite = (int) Math.pow(10, nivelDificultad) - 1;
        int operando1 = random.nextInt(limite) + 1;
        int operando2 = random.nextInt(limite) + 1;
        return new int[]{operando1, operando2};
    }

    public String generarPregunta(int operando1, int operando2) {
        switch (tipoProblema) {
            case 1: return "¿Cuánto es " + operando1 + " + " + operando2 + "?";
            case 2: return "¿Cuánto es " + operando1 + " - " + operando2 + "?";
            case 3: return "¿Cuánto es " + operando1 + " x " + operando2 + "?";
            case 4: return "¿Cuánto es " + operando1 + " / " + operando2 + "?";
            default: return "Operación no reconocida";
        }
    }

    public int calcularRespuesta(int operando1, int operando2) {
        switch (tipoProblema) {
            case 1: return operando1 + operando2;
            case 2: return operando1 - operando2;
            case 3: return operando1 * operando2;
            case 4: return operando1 / operando2;
            default: return 0;
        }
    }
}
