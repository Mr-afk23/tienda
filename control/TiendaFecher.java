package control;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class TiendaFecher {


    //! Metodo para obtener los productos desde una api
    public static String obtenerProductos(String urlApi){
        
        StringBuilder resultado = new StringBuilder();
        HttpURLConnection conexion =null;
        
        try {
            URL url = new URL(urlApi);
            conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.setConnectTimeout(5000);
            conexion.setReadTimeout(5000);
            conexion.connect();


            //! Verifica respuestas del servidor 
            int code = conexion.getResponseCode();
            System.out.println(code);       

            try (BufferedReader br = new BufferedReader( new InputStreamReader(conexion.getInputStream() , StandardCharsets.UTF_8))
            ){
                String linea;
                while ((linea = br.readLine()) != null ) {
                    resultado.append(linea).append('\n');
                    
                }
            }

        }catch (Exception e){
            System.out.println("Error: " + e);
        }finally{
            if (conexion != null) conexion.disconnect(); 
        }
   
        return resultado.toString();
  }

}
