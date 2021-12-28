
package exepciones;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Exception_verified {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        //Excepciones verificadas (IOException)
        //Lectura de un archivo de texto (.txt)
        
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\52871\\Desktop\\hola.txt"));
        String linea;
        while((linea = bf.readLine()) != null){
            System.out.println(linea);
        }
    }
}
