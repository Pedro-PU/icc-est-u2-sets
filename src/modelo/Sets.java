package modelo;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Comparator;
public class Sets {
    public Sets(){

    }
    public Set<String> construirHashSet(){
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");
        return palabras;
        
    }   
    public void construirHashSetComparator(){
    }
    public Set<String> construirLinkedSet(){
        Set<String> palabras = new LinkedHashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");
        return palabras;

    }

    public Set<String> construirTreeSet(){
        Set<String> palabras = new TreeSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");
        return palabras;
        
    }
    public Set<String> construirTreeSetComparator(){
        // Crear un Comparadorque compare las palabras en orden alfabético inverso
        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //Comparamos la longitud
                int resultado = Integer.compare(s1.length(), s2.length());
                //Si tiene la misma longitud, comparamos alfabeticamente
                if(resultado == 0){
                    resultado = s1.compareTo(s2);
                }
                return resultado;
            }
        };

        Set<String> palabras = new TreeSet<>(comparadorLongitud);
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");
        palabras.add("Celulas");
        return palabras;
    }
    
    public Set<String> construirTreeSetComparatorDescendente(){
        // Crear un Comparadorque compare las palabras en orden alfabético inverso
        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //Comparamos la longitud
                int resultado = Integer.compare(s2.length(), s1.length());
                //Si tiene la misma longitud, comparamos alfabeticamente
                if(resultado == 0){
                    resultado = s2.compareTo(s1);
                }
                return resultado;
            }
        };

        Set<String> palabras = new TreeSet<>(comparadorLongitud);
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");
        palabras.add("Celulas");
        return palabras;
    }
}
