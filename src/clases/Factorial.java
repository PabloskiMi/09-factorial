package clases;


public class Factorial {
    
    public int factorial = 1;
    public int n;

    public Factorial(int n) {
        
        this.n = n;
        
    }
    
    public int getFactorial(){
        
        while(n != 0){
            
            factorial *= n;
            n --;
            
        }
        
        return factorial;
    }
    
}
