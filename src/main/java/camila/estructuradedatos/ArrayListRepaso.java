package camila.estructuradedatos;
import java.util.ArrayList;

//se crea la clase ArrayListRepaso
public class ArrayListRepaso {
    ArrayList<String> objLanguage = new ArrayList<>();
    
    //se crea el metodo addLanguage
    public void addLanguage (String language){
        //se anade el lenguaje 
        objLanguage.add(language);
    }
    //se crea el metodo removeLanguage
    public void removeLanguage(int languageIndex){
        //se borra el lenguaje indicado en la poscicion del indice a seleccionar
        objLanguage.remove(languageIndex);
    }
    
    //se crea el metodo editLanguage
    public void editLanguage (int index, String language) {
        //se edita el lenguage 
          objLanguage.set(index, language); 
    }
    
    //se crea el método returnSize
    public int returnSize() {
        // Devuelve el tamaño de la lista
        return objLanguage.size();
    }
    //se eliminan todos los elementos
    public void clearAllLanguages() {
        objLanguage.clear();
        //se imprime el tamano de la lista actual despues de eliminar todo
        System.out.println("Tamano de la lista: " + objLanguage.size());
    }    
}
