import java.util.Random;

public class ManejadorInteracciones {
    private final Random random;

    public ManejadorInteracciones() {
        random = new Random();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarMensajePositivo() {
        String[] mensajesPositivos = {
            "¡Muy bien!", 
            "¡Excelente!", 
            "¡Buen trabajo!", 
            "¡Sigue así!"
        };
        int indiceAleatorio = random.nextInt(mensajesPositivos.length);
        System.out.println(mensajesPositivos[indiceAleatorio]);
    }

    public void mostrarMensajeNegativo() {
        String[] mensajesNegativos = {
            "No. Por favor intenta de nuevo.",
            "Incorrecto. Intenta una vez más.",
            "¡No te rindas!",
            "No. Sigue intentando"
        };
        int indiceAleatorio = random.nextInt(mensajesNegativos.length);
        System.out.println(mensajesNegativos[indiceAleatorio]);
    }
}
