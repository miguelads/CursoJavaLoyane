package programacaoBasica;

import java.util.Scanner;

public class ClasseEobjeto {

	public static void main(String []args){
	
	//exercicio 1)
	// resposta: System.out.println("Alo mundo!");
	
	/* exercicio 2) resposta:
	Scanner sc = new Scanner(System.in);
	System.out.println("me infome um número");
	int numero = sc.nextInt();
	System.out.println("O número informado é " + numero);
	*/
	
	/* exercicio 3) resposta:
	Scanner sc = new Scanner(System.in);
	System.out.println("me infome dois números para ser calculados");
	System.out.println("me infome o primeiro numero");
	int nu1 = sc.nextInt();
	System.out.println("me infome o segundo numero");
	int nu2 = sc.nextInt();
	
	System.out.println("A soma dos numeros é " + (nu1 + nu2));
	*/
		
	/* exercicio 4) resposta:
	Scanner sc = new Scanner(System.in);
	System.out.println("digite a primeira nota");
	double not1 = sc.nextDouble();
	System.out.println("digite a segunda nota");
	double not2 = sc.nextDouble();
	System.out.println("digite a terceira nota");
	double not3 = sc.nextDouble();
	System.out.println("digite a quarta nota");
	double not4 = sc.nextDouble();
	
	System.out.println("A media aritimetrica é " + (not1 + not2 + not3 + not4)/4);
	*/
	 
	 /* exercicio 5) resposta:
		
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Convertendo metros para centrimetros");
	 System.out.println("Digite o valor em metros");
	 double metros = sc.nextDouble();
	 System.out.println("Convertido em " + (metros * 100) + " cm ");
	 */
		
	/*exercicio 6) resposta:
	Scanner sc = new Scanner(System.in);
	System.out.println("Calculando a area de um circulo");
	System.out.println("digite o valor do raio");
	double raio = sc.nextDouble();
	double area = Math.PI * Math.pow(raio, 2);//blibioteca Math estudar.
	System.out.println("O valor da Área é " + area +"cm");*/
	
	
	/* exercicio 7) resposta:
	Scanner sc = new Scanner(System.in);
	System.out.println("Calculando a area de um quadrado");
	System.out.println("digite o valor do lado");
	double lado = sc.nextDouble();
	double base = lado * lado;
	System.out.println("A área do quadrado é " + base);
	*/
		
	/* exercicio 8 Resposta:
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Quanto você ganha por hora?");
	 double hora = sc.nextDouble();
	 System.out.println("Qual o numero de horas trabalhadas no dia");
	 double horasTrabalhadas = sc.nextDouble();	
	 double horasTrabalhadasMes = 30;
	 double salario = (hora * horasTrabalhadas) * horasTrabalhadasMes;
	 System.out.println("Seu salário é de " + salario);
	 */
	 
	  /**exercicio 09 resposta
	  Scanner sc = new Scanner(System.in);
	  System.out.println("digite o valor da temperatura Farenheit !");
	  double fh = sc.nextDouble();
	  double c = (5*(fh - 32) / 9);
	  System.out.println("O valor em Celsius é de " + c);
	  */
		
	  /**exercicio 10 resposta
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Digite o valor celsius!");
	  double c = sc.nextDouble();
	  double f = (c * 1.8) + 32;
	  System.out.println("O valor transformado para Fahrenheit é " + f);
	  */
	  /**exercicio 11 resposta
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Me informe o primeiro número inteiro");
	  int num1 = sc.nextInt();
	  System.out.println("Me informe o segundo número inteiro");
	  int num2 = sc.nextInt();
	  System.out.println("Me informe um número real");
	  double real = sc.nextDouble();
	  
	  double valorA = (num1 * 2) + (num2 / 2);
	  double valorB = (num1 * 3) + real;
	  double valorC = Math.pow(real, 3);
	  
	  System.out.println("resposta letra A " + valorA);
	  System.out.println("resposta letra B " + valorB);
	  System.out.println("resposta letra C " + valorC);
	  */
	  
	 /**exercicio 11 resposta
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Digite sua altura");
	  double altura = sc.nextDouble();
	  double pesoIdeal = (72.7 * altura) - 58;
	  System.out.println("Seu peso ideal é " + pesoIdeal);
	  */
		
	  /**exercicio 12 resposta
	  Scanner sc = new Scanner(System.in);
	  System.out.println("quanto você ganha por hora ?");
	  double hora = sc.nextDouble();
	  System.out.println("qual o número de horas trabalhadas em um mês ?");
	  double horaTrabalhadasMes = sc.nextDouble();
	  double totalSalarioMes = hora * horaTrabalhadasMes;
	  double salarioBruto = totalSalarioMes;
	  double impostoRenda = (salarioBruto * 11)/100;
	  double impostoInss = (salarioBruto * 8)/100;
	  double impostoSindicato = (salarioBruto * 5)/100;
	  double liquido = salarioBruto - (impostoInss + impostoRenda + impostoSindicato);
	  System.out.println("O seu salário Bruto é " + salarioBruto);
	  System.out.println("Valor pago ao INSS R$ " + impostoInss);
	  System.out.println("Valor pago ao sindicato R$ " + impostoSindicato);
	  System.out.println("o salario líquido " + liquido);
      System.out.println("---------------------------------------------");
      System.out.println("Salário Bruto : R$ " + salarioBruto + " IR (11%) : R$ "+ impostoRenda + " INSS"
      + " (8%) : R$ "+impostoInss +" Sindicato (5%) : R$ "+ impostoSindicato+ " Salário Liquido : R$ "+liquido);
	  */
	  
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Qual o tamanho do arquivo para downloade MB?");
	   double tamanhoArquivo = sc.nextDouble();
	   System.out.println("Qual a velocidade de um link de internet em Mbps");
	   double velocidade = sc.nextDouble();
	   double tempoDownload = tamanhoArquivo / velocidade ;
	   System.out.println("vai terminar o download do arquivo em " + tempoDownload);
	   
	   
	  
	  
	  
	  
	  
	 		 
		
	 
	}	
	
}
