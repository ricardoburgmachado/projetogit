public class fatorial {

	//versao iterativa do calculo do fatorial
	public int calcularFatorial(int n)throws IllegalArgumentException{
	   if(n < 0)
	      throw new IllegalArgumentException("N�o existe fatorial para os numeros negativos");
	   int resultado = 1;
	
	   if(n!= 0){
	     for(int i = 2; i <= n; i++){
		resultado *= i;  

	     }
	   }	
	   return resultado;

	}

}