package practica3;
public class Clase1 {
    //atributos 
    int resultadoM;
    
  
   
    //constructor 
    public Clase1(){
    }   
    
    
    //metodos 
   
    public int resultadoF (int numero, int factorial){
        
    while (numero !=0){
    factorial *=numero;
    numero --;
    }
    return factorial;
    
    }
    
   
    public void resultadoM (int numeroMulti){
    for (int i=1; i<=10; i++){
     System.out.println(i+" * "+numeroMulti+" = "+(numeroMulti*i));
    }
  
    }

    
 
    
    
    
   
    }
    
  
