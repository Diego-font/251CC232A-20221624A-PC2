package uni.aed.tda.ArrayListTDA;
import uni.aed.tda.ListTDA.IteratorTDA;
import uni.aed.tda.ListTDA.ListTDA;
import uni.aed.tda.ArrayListTDA.ArrayListTDA;
public class DiegoRoman20221624A {
    ListTDA<String> lista1=new ArrayListTDA<>();
    ListTDA<String> lista2=new ArrayListTDA<>();
    //La implementación del problema 1
    public String[] Union(){
        String[] aux=lista2;
        String[] union=lista1;

        for(int i=1; i<=lista1.size(); i++){
            for(int j=1; j<=lista2.size();j++){
                if(lista1[i]==aux[j]){
                    aux.delete(lista1[i]);
                }
            }
        }
        for(int j=1; j<=lista2.size(); j++){
            if(aux[j]!=null){
                union.add(aux[j]);
            }
        }
        return union;
    }
    //La implementación de la intersección problema1
    public String[] Intersection(){
        String[] aux=lista2;
        String[] intersection=lista1;

        for(int i=1; i<=lista1.size(); i++){
            for(int j=1; j<=lista2.size();j++){
                if(lista1[i]!=aux[j]){
                    aux.delete(lista1[i]);
                }
            }
        }
        intersection.clear();
        for (int i = 0; i < lista2.size; i++) {
            if(aux[i]!=null){
                intersection.add(aux[i]);
            }
        }
        return intersection;
    }

    public String[] difference(){
        String[] aux1=lista1;
        String[] aux2=lista2;
        String[] difference=lista1;

        for(int i=1; i<=lista1.size(); i++){
            for(int j=1; j<=lista2.size();j++){
                if(lista1[i]!=aux2[j]){
                    aux2.delete(lista1[i]);
                }
            }
        }
        for(int i=1; i<=lista2.size(); i++){
            for(int j=1; j<=lista1.size();j++){
                if(lista2[i]!=aux1[j]){
                    aux1.delete(lista2[i]);
                }
            }
        }
        difference.clear();
        for (int i = 0; i < lista1.size; i++) {
            if(aux1[i]!=null){
                difference.add(aux1[i]);
            }
        }
        for (int i = 0; i < lista2.size; i++) {
            if(aux2[i]!=null){
                difference.add(aux2[i]);
            }
        }
        return difference;
    }


}
