package uni.aed.tda.LinkedListTDA;
import uni.aed.tda.ListTDA.IteratorTDA;
import uni.aed.tda.ListTDA.ListTDA;
import uni.aed.tda.LinkedListTDA.LinkedListTDA;
public class DiegoRoman20221624A {
    ListTDA<String> lista1=new LinkedListTDA<>();
    ListTDA<String> lista2=new LinkedListTDA<>();
    public Nodo<String> Union(){
        Nodo<String> aux1=lista1;
        Nodo<String> aux2=lista2;
        Nodo<String> union=lista1;


        while(aux1!=null){
            aux2.delete(aux1.getData());

            aux1=aux1.getNext();
        }
        while(aux2!=null){
            union.add(aux2.getData());
            aux2=aux2.getNext();
        }
        return union;
    }
    //La implementación de la intersección problema1
    public Nodo<String> Intersection(){
        Nodo<String> aux1=lista1;
        Nodo<String> aux2=lista2;
        Nodo<String> intersection=lista2;


        while(aux1!=null){
            aux2.delete(aux1.getData());

            aux1=aux1.getNext();
        }
        while(aux2!=null){
            intersection.delete(aux2.getData());
            aux2=aux2.getNext();
        }
        return intersection;
    }

    public Nodo<String> difference(){
        Nodo<String> aux1=lista1;
        Nodo<String> aux2=lista2;
        Nodo<String> difference=lista1;


        while(aux1!=null){
            aux2.delete(aux1.getData());

            aux1=aux1.getNext();
        }
        while(aux2!=null){
            difference.add(aux2.getData());
            aux2=aux2.getNext();
        }
        Nodo<String> aux1=lista1;
        Nodo<String> aux2=lista2;
        while(aux2!=null){
            aux1.delete(aux1.getData());

            aux2=aux2.getNext();
        }
        while(aux1!=null){
            difference.add(aux1.getData());
            aux1=aux1.getNext();
        }


        return difference;
    }


}
