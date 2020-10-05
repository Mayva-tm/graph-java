package data.structure;

public class Stack {
    private int TAMPILA = 10; 
    private int top; 
    //estructura que simulara la pila 
    private Object [] pilaArray ; 
    //constructor
    public Stack(){
        this.top = -1;
        this.pilaArray = new Object [TAMPILA]; 
    }
    
    //operaciones 
    private boolean pilaLlena(){
        
        if(this.top == TAMPILA -1){
            return true;
        }else{
            return false;
        }
    }
    private boolean pilaVacia(){
        if(this.top == -1){
            return true;
        }else{
            return false;
        }
        
    }
    public Object cimaPila(){
        if(!pilaVacia()){
            return pilaArray[top];
        }else{
            System.out.println("la pila esta vacia");
            return null; 
        }
    }
    public void insertar(Object elemento){
        if(pilaLlena()){
            System.out.println("NO SE PUEDE INSERTAR "+elemento+" LA PILA ESTA LLENA");
        }else{
            this.top++;
            pilaArray[top] = elemento;
        }
    }
    public Object quitar(){
        Object aux = null;
        if(pilaVacia()){
            System.out.println("NO SE PUEDE EXTRAER, LA PILA ESTA VACIA");
        }else{
            aux = pilaArray[top];
            System.out.println("se ha extraido el elemento-->"+aux);
            top--;
            
        }
        return aux;
    }
    public void mostrarPila(){
      if(!pilaVacia()){
          for(int i=top; i>=0;i--){
              System.out.println("|"+pilaArray[i]+"|");
          }
      }  
    }
    public void limpiarPila(){
        this.top = -1;

}
}
