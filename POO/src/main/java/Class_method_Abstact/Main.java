
package Class_method_Abstact;

public class Main {
    public static void main(String[] args){
        Planta planta_1 = new Planta();
        
        planta_1.Alimentarse();
        
        AnimalCarnivoro animal_1 = new AnimalCarnivoro();
        animal_1.Alimentarse();
        
        AnimalHerbivoro animal_2 = new AnimalHerbivoro();
        animal_2.Alimentarse();
    }
}
