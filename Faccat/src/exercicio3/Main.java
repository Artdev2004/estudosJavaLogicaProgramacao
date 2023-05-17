package exercicio3;

public class Main {

	public static void main(String[] args) {
		/*Os pares de instruções abaixo produzem o mesmo resultado?
				A (4/2)+(2/4) e A 4/2+2/4
				B 4/(2+2)/4 e B 4/2+2/4
				C (4+2)*2-4 e C 4+2*2-4 */

		
		float a = (4/2)+(2/4);
	    float parA = 4/2+2/4;
	    float b = 4/(2+2)/4;
	    float parB = 4/2+2/4;
	    float c = (4+2)*2-4;
	    float parC = 4+2*2-4;
	    
	    System.out.printf("Par A: " + a + " e " + parA);
	    System.out.printf("\nPar B: " + b + " e " + parB);
	    System.out.printf("\nPar C: " + c + " e " + parC);
	    
	    
	}
}
