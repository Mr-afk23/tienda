package control;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class TiendaFecher {


    //! Metodo para obtener los productos desde una api
    public static String obtenerProductos(String urlApi){
        
        StringBuilder resultado = new StringBuilder();
        
        try {
            URL url = new URL(urlApi);
            
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.setConnectTimeout(5000);
            conexion.setReadTimeout(5000);
            conexion.connect();


        }catch (Exception e){
            System.out.println("Error: " + e);
        }





        
        
        return resultado.toString();
 }




}
