package aulas;

import java.util.Scanner;

public class Aula14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
        System.out.println("entre com sua idade ");
        int idade = sc.nextInt();
        
        	if(idade >= 18) {
        		System.out.println("é maior de idade");
        	}else {
        		System.out.println("não é maior de idade");
        	}*/
		
		// estrutura aninhada if else
		/*barato <= 10
		 * 10 entre 15 pedir desconto
		 * estiver entre 15 e 17 pesquisar mais
		 * maior que 17 sai fora que esta muito caro*/
		
		/*System.out.println("Informe o valor do produto");
		double valor = sc.nextDouble();
		
			if(valor <= 10) {
				System.out.println("Está barato");
			}else if(valor > 10 && valor <= 15){
				System.out.println("pedir desconto");
			}else if(valor > 15 && valor <= 17) {
				System.out.println("pesquisar mais");
			}else {
				System.out.println("sai fora");
			}*/
		
		System.out.println("digite o dia da semana");
		
		int diaSemana = sc.nextInt();	
		/*switch(diaSemana) {
		    case 1:
			System.out.println("Domingo");
			break;
		    case 2:
		    System.out.println("Segunda");
		    break;
		    case 3:
			System.out.println("Terça");
			break;
		    case 4:
			System.out.println("Quarta");
			break;
		    case 5:
			System.out.println("Quinta");
			break;
		    case 6:
			System.out.println("Sexta");
			break;
		    case 7:
		    System.out.println("Sábado");
		    break;
		    default:
		    	System.out.println("não é dia da semana");
		}*/
		
		
		/*outra forma de se usar o switch*/
		
		switch(diaSemana) {
	    case 2:
	    System.out.println("Segunda");
	    System.out.println("dia util");
	    case 3:
		System.out.println("Terça");
		System.out.println("dia util");
	    case 4:
		System.out.println("Quarta");
		System.out.println("dia util");
	    case 5:
		System.out.println("Quinta");
		System.out.println("dia util");
	    case 6:
		System.out.println("Sexta");
		System.out.println("dia util");
		break;
	    case 1:
		System.out.println("Domingo");
		System.out.println("Final de semana");
		
	    case 7:
	    System.out.println("Sábado");
	    System.out.println("Final de semana");
	    break;
	    default:
	    	System.out.println("não é dia da semana");
	}
	
	}			
	

}
