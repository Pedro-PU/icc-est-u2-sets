import controllers.ContactoController;
import models.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();
        /*
        runHashSet(sets);
        runLinkedHashSet(sets);
        runTreeSet(sets);
        runComparatorTreeSet(sets); 
        runComparatorTreeSetDescendente(sets);
        */
        ContactoController cc = new ContactoController();
    }
    public static void runHashSet(Sets sets) {
        System.out.println("--- HashSet ---");
        System.out.println("Elementos del HashSet (no se garantniza orden)");
        System.out.println(sets.construirHashSet());
    }
    public static void runLinkedHashSet(Sets sets) {
        System.out.println("--- LinkedHashSet ---");
        System.out.println("Elementos del LinkedHashSet (respeta orden de insercion)");
        System.out.println(sets.construirLinkedSet());
    }
    public static void runTreeSet(Sets sets) {
        System.out.println("--- TreeSet ---");
        System.out.println("Elementos del TreeSet (orden alfabeticamente - in order -)");
        System.out.println(sets.construirTreeSet());
    }
    public static void runComparatorTreeSet(Sets sets){
        System.out.println("--- Comparator TreeSet ---");
        System.out.println("Elementos del TreeSet (orden por tamaño)");
        System.out.println(sets.construirTreeSetComparator());
    }
    public static void runComparatorTreeSetDescendente(Sets sets){
        System.out.println("--- Comparator TreeSet ---");
        System.out.println("Elementos del TreeSet (orden por tamaño descendente)");
        System.out.println(sets.construirTreeSetComparatorDescendente());
    }
}
