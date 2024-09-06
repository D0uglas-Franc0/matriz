package entities;

import java.util.Locale;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Solicita o número de linhas e colunas
        System.out.println("Insira o número de linhas: ");
        int m = sc.nextInt();
        System.out.println("Insira o número de colunas: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        // Preenche a matriz com os valores fornecidos
        System.out.println("Insira os valores da matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Solicita o número a ser buscado
        System.out.println("Busque por número: ");
        int p = sc.nextInt();

        // Verifica se o número está na matriz e imprime as posições e vizinhos
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == p) {
                    System.out.println("Número encontrado na posição: (" + i + ", " + j + ")");
                    
                    // Verificando os vizinhos (se existirem)
                    if (j > 0) {
                        System.out.println("Esquerda: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + mat[i-1][j]);
                    }
                    if (j < n - 1) {
                        System.out.println("Direita: " + mat[i][j+1]);
                    }
                    if (i < m - 1) {
                        System.out.println("Baixo: " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}

