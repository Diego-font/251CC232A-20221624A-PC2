package uni.aed.circlelinkedlist;
import uni.aed.simplelinkedlist.Nodo;
public class CircleLinkedList {
    private Nodo head;
    private int lenght=0;
    
    public void addLast(int data){
        Nodo newNodo=new Nodo(data);
        if(head==null){//se trata del 1 nodo de la lista
            head=newNodo;
            head.setNext(head);
            lenght++;
            return;
        }
        Nodo current=head;
        while(current.getNext()!=head)//considerando que es lista circular
            current=current.getNext();
        current.setNext(newNodo);
        newNodo.setNext(head);
        lenght++;    
    }
    
    public boolean search(int data){
        if(head==null)
            return false;
        Nodo current=head;
        do{
            if(current.getData()==data)
                return true;
            current=current.getNext();
            
        }while(current!=head);
        return false;
    }
    
    public void remove(int data){
        if(head==null)
            return;
        //si el elemento a eliminar se encuentra en la parte frontal
        if(head.getData()==data){
            Nodo current=head;
            while(current.getNext()!=head)
                current=current.getNext();
            head=head.getNext();
            current.setNext(head);//seteamos el nuevo head
            lenght--;    
            return;
        }
        //asumiendo que se encuentra en el cuerpo de la lista
        Nodo current=head;
        while(current.getNext()!=head
                && current.getNext().getData()!=data)
            current=current.getNext();
        //salio del bucle anterior por que lo encontro en la lista
        if(current.getNext()!=head){
            current.setNext(current.getNext().getNext());
            lenght--;    
        }
    }
    //Metodo remover para resolver el problema Joshepus
    public int remover(int n){
        if(head==null || n<=0)
            return -1;
        head=remover(head,n);
        return head.getData();
    }
    //Metodo recursivo para resolver el problema de Joshepus
    private Nodo remover(Nodo head,int n){
        if(head==null || head.getNext()==head)
            return head;//solo queda un nodo
        Nodo current=head;
        Nodo prev=null;
        //contamos hasta n
        for(int i=1;i<n;i++){
            prev=current;
            current=current.getNext();
        }
        //Eliminar el nodo actual
        prev.setNext(current.getNext());
        lenght--;
        //llamada recursiva
        return remover(prev.getNext(),n);
    }
    
    public void clear(){
        head=null;
        lenght=0;
    }
    
    public boolean isEmpty(){
        return (lenght==0);
    }
    
    public int size(){
        return lenght;
    }

    @Override
    public String toString() {
        StringBuilder str=new StringBuilder();
        Nodo current=head;
        do{
            if(!str.isEmpty())
                str.append("->");
            str.append(current.getData());
            current=current.getNext();
            
        }while(current!=head);
        return "->"+str.toString()+"->";
    }
}
