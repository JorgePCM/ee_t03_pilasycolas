package ee_t03_pilasycolas;

public class Cola <T>
{
    
    private Nodo<T> frente,fin;


    
    public Cola()
    {
        frente=null;
        fin=null;
    }

    public boolean vacia()
    {
      return frente==null;  
    }
    
     public void push(T o){
      Nodo<T> aux =new Nodo<T>(o);
     if (!vacia()){
       if(aux==null){System.out.println("La memoria esta llena");}
       else{
        fin.setSiguiente(aux);
        fin=aux;
       }
      }else{frente=fin=aux;}
    }
     
     
    public T pop(){
     if(vacia())return null;
     
     T o=frente.getDato();
     frente=frente.getSiguiente();
     
     return o;
    
    }
      }
