package uni.aed.tda.LinkedListTDA;
import uni.aed.tda.ArrayListTDA.ArrayListTDA;
import uni.aed.tda.ListTDA.IteratorTDA;
import uni.aed.tda.ListTDA.ListTDA;
public class DiegoRoma20221624A_Interfaz {
    public void show(){
        ListTDA<String> lista1=new LinkedListTDA<>();
        System.out.println("Probando la implementación \n");
        lista1.add("Uno");
        lista1.add("Dos");
        lista1.add("Tres");
        lista1.add("Cuatro");
        lista1.add("Cinco");
        System.out.println("La lista 1 es: \n");
        ListTDA<String> lista=new LinkedListTDA<>();
        lista=lista1;
        while(lista!=null){
            System.out.println(lista.getData()+"\n");
            lista.getData();
        }


        ListTDA<String> lista2=new LinkedListTDA<>();
        System.out.println("Probando la implementación \n");
        lista2.add("Uno");
        lista2.add("Cinco");
        lista2.add("Cero");
        lista2.add("Cuatro");
        lista2.add("Ocho");
    }
}
