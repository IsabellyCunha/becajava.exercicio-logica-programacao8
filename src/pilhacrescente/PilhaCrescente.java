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
			System.out.println("Insira o "+ (i+1)+ "° valor: ");
			pilha[i] = leitor.nextInt();	
		}
		
		//lista a pilha desordenada que o usuario entrou
		for(i = 0; i<10; i++) {
			System.out.println(i+1 +"ª posição | "+ pilha[i]);
		}
		System.out.println("------------------------------------------------------------------------------------ ");
		
		for(i = 0; i < 10; i++) {//For para travar uma posição do vetor que será comparado com todas as outras posições
			for(y = 0 ; y < 9; y++) {//For que traz as demais posiçoes
				if (pilha[y] > pilha[y + 1]) {//verficação se o valor na posição y é maior do que o valor da posição y+1
					maior = pilha[y];//armazena o menor valor da verificação
					pilha[y] = pilha[y + 1];//instancia a posição atual pelo menor valor da verificação
					pilha[y + 1] = maior;//instancia a posição seguinte como maior valor

				}
			}
			
		}
		//lista o valor ordenado
		for(i = 0; i<10; i++) {
			System.out.println(i+1 +"ª posição   |  "+ pilha[i]);
		}

	}

}
