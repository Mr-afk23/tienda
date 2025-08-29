import control.TiendaFecher;
import ventanas.Dashboard;

public class Main {
    public static void main(String[] args) {
        try {

            //Consulta
            String urlApi = "https://jsonplaceholder.typicode.com/posts";
            String respuesta = TiendaFecher.obtenerProductos(urlApi);

            // Variables para capturar el primer objeto
            String objeto = "";
            boolean dentroObjeto = false;
            int llaves = 0;

            for (int i = 0; i < respuesta.length(); i++) {
                char c = respuesta.charAt(i);

                if (c == '{') {
                    dentroObjeto = true;
                    llaves++;
                }

                if (dentroObjeto) {
                    objeto += c;
                }

                if (c == '}') {
                    llaves--;
                    if (llaves == 0) {
                        // Terminó el primer objeto
                        break;
                    }
                }
            }

            // Mostrar el primer objeto tal cual
            System.out.println(objeto);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
