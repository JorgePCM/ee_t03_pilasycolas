package ee_t03_pilasycolas;

public class Pila<T>
{
    private Nodo<T> tope;

  
    public Pila()
    {
      tope=null;  
    }

    public boolean vacia()
    {
        return tope==null;
    }
    
    
    
    public void push(T o){
     Nodo<T> aux=new Nodo<T>(o);
     if(aux==null){
     System.out.print("La memoria esta llena");
     }
     else{
    	 if(vacia()){
      tope=aux;
    	 }else {
    		aux.setSiguiente(tope); 
    		tope=aux;
    	 }
     }
    }
    
    public T pop(){
     if (vacia())return null;
     T o=tope.getDato();
     tope=tope.getSiguiente();
     return o;
    }
    
    public void peek(){
    
    	System.out.println(tope);
    	
    }
}