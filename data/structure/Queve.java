package data.structure;

public class Queve {
    private int MAX = 5;
    private int[]cola;
    private int front;
    private int end;

    public Queve(){
        this.front = 0;
        this.end = -1;
        cola = new  int [MAX];
    }

    public boolean colaLlena(){
        if(end == MAX-1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean colaVacia(){
        if(end<=front){
            return true;
        }else{
            return false;
        }
    }

    public void insertar(int dato){
        if(!colaLlena()){
            end++;
            cola[end]= dato;
        }

    }

    public Object quitar(){
        Object aux = null;
        if(!colaVacia()){
            aux = cola[front];
            front++;
        }

        return aux;
    }
    public Object front(){
        return cola[front];
    }
     
    
    public void mostrarCola(){
        System.out.println("COLA ACTUAL");
        for(int i = front;i>=end;i++){
            System.out.println("la cola es:  "+cola[i]+"\t");
        }

      
        
        
}
}

