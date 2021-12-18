
package exercise_2;
public class Persona {
    
    //Atributos
    String nombre;
    int edad = 0;
    String dni;
    char sexo = 'H';
    float peso = 0;
    float altura = 0;
    
    
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public Persona(String nombre, int edad, String dni, char sexo, float peso, float altura){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    //Metodos
    
    public int calcular_IMC(){
        float imc = (float) peso / (altura * altura);
        System.out.println("El indice de masa corporal: " + imc);
        if(imc < 20){
            System.out.println("Peso debajo del ideal");
            return -1;
        }
        else if((imc >= 20) && (imc <= 25)){
            System.out.println("Peso ideal");
            return 0;
        }
        else{
            System.out.println("Sobrepeso");
            return 1;
        }
    }
    
    public boolean es_mayor_de_edad(){
        if(edad > 18){
            System.out.println("es mayor de edad");
            return true;
        }
        else{
            System.out.println("Es menor de edad");
            return false;
        }
    }
    
    public void imprimir_informacion(){
        System.out.println("\nNombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }
    
    public void generar_dni(){
        int new_dni[];
        new_dni = new int[8];
        for(int  i = 0; i < 8; i++){
            new_dni[i] = (int) (Math.random() * 9);
        }
        System.out.println("The new dni");
        for(int i = 0; i < 8; i++){
            System.out.print(new_dni[i] + "");
        }
    }
    
    public void ingresar_nombre(String nombre){
        this.nombre = nombre;
    }
    
    public void ingresar_edad(int edad){
        this.edad = edad;
    }
    
    public void ingresar_sexo(char sexo){
        this.sexo = sexo;
    }
    
    public void ingresar_peso(float peso){
        this.peso = peso;
    }
    
    public void ingresar_altura(float altura){
        this.altura = altura;
    }
}
