//Declaraciones de las excepciones de un método
package exepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class prueba_excepciones {
    
    public void leerArchivo() throws FileNotFoundException, IOException{
        File archivo = new File("C:\\Users\\52871\\Desktop\\hola.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;
        while((linea = bf.readLine()) != null){
            System.out.println(linea);
        }
    }
    
    public void leerArchivo2(){
        try{
            leerArchivo();
        } catch(FileNotFoundException ex){
            System.out.println("No se ha encontrado el archivo, verificar la ruta");
        } catch(IOException e){
            System.out.println("Ha ocurrido una excepción verificada");
        }
        System.out.println("Programa ha terminado");
    }
    
    public static void main(String[] args){
        prueba_excepciones prueba = new prueba_excepciones();
        prueba.leerArchivo2();
    }
}
