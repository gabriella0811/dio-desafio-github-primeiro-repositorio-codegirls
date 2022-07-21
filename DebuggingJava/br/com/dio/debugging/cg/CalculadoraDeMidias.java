package br.com.dio.debugging.cg;

import java.util.Scanner;

public class CalculadoraDeMidias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner scan = new Scanner(System.in);
		    String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

		    double media = calculaMediaDaTurma(alunos, scan);

		    System.out.printf("Média da turma %.1f", media);
		}

		public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

		    double soma = 0;
		    for(String aluno : alunos) {
		        System.out.printf("Nota do aluno %s: ", aluno);
		        double nota = scanner.nextDouble();
		        soma += nota;
		    }

		    return soma / alunos.length;
	}

}

   