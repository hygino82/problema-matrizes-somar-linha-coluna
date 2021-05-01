package application;

import java.util.Scanner;

public class Program {

	static void escrevaMatriz(int m[][], int linha, int coluna) {
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int geraSoma(int m[][], int l, int c, int nLinhas, int nColunas) {
		int somaLinha = 0;
		int somaColuna = 0;
		// soma os elementos da mesma linha
		for (int j = 0; j < nColunas; j++) {
			somaLinha += m[l][j];
		}
		// soma os elementos da mesma coluna
		for (int i = 0; i < nLinhas; i++) {
			somaColuna += m[i][c];
		}
		//Precisamos excluir o elemento da posição m[l][c] que foi somado duas vezes
		//uma na somaLinha outra na somaColuna
		return somaColuna + somaLinha - m[l][c];
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 3;
		// ordem da matriz

		int matriz[][] = new int[n][n];
		int matrizSoma[][] = new int[n][n];

		System.out.println("Informe os elementos da matriz");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		System.out.println("\nMatriz de entrada");

		escrevaMatriz(matriz, n, n);

		System.out.println("\n\nMatriz obtida");

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				matrizSoma[i][j] = geraSoma(matriz, i, j, n, n);
			}
		escrevaMatriz(matrizSoma, n, n);

		sc.close();
	}

}
