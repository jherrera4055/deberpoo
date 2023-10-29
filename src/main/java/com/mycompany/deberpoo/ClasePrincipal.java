import java.util.Scanner;

public class ClasePrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ManejadorInteracciones manejadorInteracciones = new ManejadorInteracciones();
        RastreadorRendimiento rastreadorRendimiento = new RastreadorRendimiento();

        manejadorInteracciones.mostrarMensaje("Elige el nivel de dificultad (1, 2, ...): ");
        int nivelDificultad = entrada.nextInt();

        manejadorInteracciones.mostrarMensaje(
              "Elige el tipo de problema aritmético "
        + "(1: Suma, 2: Resta, 3: Multiplicación, 4: División, 5: Aleatorio): "
        );
        int tipoProblema = entrada.nextInt();
        
        GeneradorProblemas generadorProblemas = new GeneradorProblemas(nivelDificultad, tipoProblema);

        int totalPreguntas = 10;

        for (int i = 0; i < totalPreguntas; i++) {
            int[] operandos = generadorProblemas.generarOperandos();
            String pregunta = generadorProblemas.generarPregunta(operandos[0], operandos[1]);

            manejadorInteracciones.mostrarMensaje(pregunta);
            int respuestaUsuario = entrada.nextInt();
            int respuestaCorrecta = generadorProblemas.calcularRespuesta(operandos[0], operandos[1]);

            if (respuestaUsuario == respuestaCorrecta) {
                rastreadorRendimiento.registrarAcierto();
                manejadorInteracciones.mostrarMensajePositivo();
            } else {
                rastreadorRendimiento.registrarFallo();
                manejadorInteracciones.mostrarMensajeNegativo();
            }
        }

        String mensajeFinal = rastreadorRendimiento.generarMensajeFinal();
        manejadorInteracciones.mostrarMensaje(mensajeFinal);
        
        entrada.close();
    }
}

