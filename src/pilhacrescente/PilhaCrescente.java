package pilhacrescente;

import java.util.Scanner;

public class PilhaCrescente {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int y = 0 ;
		int i = 0;
		int[] pilha = new int[10];
		int maior = 0;
		
		
		for(i = 0; i<10; i++) {
			System.out.println("Insira o "+ (i+1)+ "� valor: ");
			pilha[i] = leitor.nextInt();	
		}
		
		//lista a pilha desordenada que o usuario entrou
		for(i = 0; i<10; i++) {
			System.out.println(i+1 +"� posi��o | "+ pilha[i]);
		}
		System.out.println("------------------------------------------------------------------------------------ ");
		
		for(i = 0; i < 10; i++) {//For para travar uma posi��o do vetor que ser� comparado com todas as outras posi��es
			for(y = 0 ; y < 9; y++) {//For que traz as demais posi�oes
				if (pilha[y] > pilha[y + 1]) {//verfica��o se o valor na posi��o y � maior do que o valor da posi��o y+1
					maior = pilha[y];//armazena o menor valor da verifica��o
					pilha[y] = pilha[y + 1];//instancia a posi��o atual pelo menor valor da verifica��o
					pilha[y + 1] = maior;//instancia a posi��o seguinte como maior valor

				}
			}
			
		}
		//lista o valor ordenado
		for(i = 0; i<10; i++) {
			System.out.println(i+1 +"� posi��o   |  "+ pilha[i]);
		}

	}

}
