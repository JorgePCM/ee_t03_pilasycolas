package ee_t03_pilasycolas;
import java.io.*;
public class Test {
	
public static void main(String [] args)throws java.io.IOException{

Pila<Integer> p=new Pila<Integer>();
Cola<Integer> c=new Cola<Integer>();

BufferedReader br = new BufferedReader(new FileReader("datos1.txt"));
String cadena=br.readLine();
int ini=Integer.parseInt(cadena);

if (ini==0){

while(cadena!=null){
cadena=br.readLine();
if(cadena!=null){
String[] datos=cadena.split(",");
int operador=Integer.parseInt(datos[0]);

if (operador==0){
p.push(Integer.parseInt(datos[1]));

}else if(operador==1){
System.out.println(p.pop());	
}
else{
p.peek();
}
}
}
}else{
while(cadena!=null){
cadena=br.readLine();
if(cadena!=null){
String[] datos=cadena.split(",");
int operador=Integer.parseInt(datos[0]);

if (operador==0){
c.push(Integer.parseInt(datos[1]));

}else if(operador ==1){
System.out.println(c.pop());	
}
	
}

	
}
}
}
}
	
	

