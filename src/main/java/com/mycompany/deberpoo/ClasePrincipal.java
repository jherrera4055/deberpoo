import java.util.Scanner;

public class ClasePrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ManejadorInteracciones manejadorInteracciones = new ManejadorInteracciones();
        RastreadorRendimiento rastreadorRendimiento = new RastreadorRendimiento();

        manejadorInteracciones.mostrarMensaje("Elige el nivel de dificultad (1, 2, ...): ");
        int nivelDificultad = entrada.nextInt();

        manejadorInteracciones.mostrarMensaje("Elige el tipo de problema aritmético (1: Suma, 2: Resta, 3: Multiplicación, 4: División, 5: Aleatorio): ");
        int tipoProblema = entrada.nextInt();
        

    }
}

