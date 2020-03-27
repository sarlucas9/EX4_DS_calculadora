package exercicio4;

import exercicio4.Calculadora;

public class calculoscalculadora {

	public static void main(String[] args) {
		
		//crio o objeto Soma
		Calculadora Soma = new Calculadora();
		
		//dou valor ao Primeiro Numero
		Soma.Numero1=15;
		
		
		//dou valor ao SEgundo Numero
		Soma.Numero2=520;
		
		//eu printo o valor ddo primeiro e segundo Numero
		System.out.println("Valor do Primeiro Numero: "+Soma.Numero1);
		System.out.println("Valor do SEgundo Numero: "+Soma.Numero2);
		
		System.out.println("Resultado da Soma: "+Soma.Somar());
		
		System.out.println(" ");
		
		//crio o objeto Dividir
				Calculadora Dividir = new Calculadora();
				
				//dou valor ao atributo base
				Dividir.Numero1=25;
				
				
				//dou valor ao atributo altura
				Dividir.Numero2=5;
				
				//eu printo o valor de altura e base
				System.out.println("Valor do Primeiro Numero: "+Dividir.Numero1);
				System.out.println("Valor do SEgundo Numero: "+Dividir.Numero2);
				
				System.out.println("Resultado da Divisão: "+Dividir.Dividir());
				
				System.out.println(" ");
				
				//crio o objeto Triangulo
				Calculadora Subtracao = new Calculadora();
				
				//dou valor ao atributo base
				Subtracao.Numero1=250;
				
				
				//dou valor ao atributo altura
				Subtracao.Numero2=100;
				
				//eu printo o valor de altura e base
				System.out.println("Valor do Primeiro Numero: "+Subtracao.Numero1);
				System.out.println("Valor do SEgundo Numero: "+Subtracao.Numero2);
				
				System.out.println("Resultado da Subtracao: "+Subtracao.Subtrair());
				
				System.out.println(" ");
				
				//crio o objeto Soma
				Calculadora MUltiplicacao = new Calculadora();
				
				//dou valor ao Primeiro Numero
				MUltiplicacao.Numero1=10;
				
				
				//dou valor ao SEgundo Numero
				MUltiplicacao.Numero2=205;
				
				//eu printo o valor ddo primeiro e segundo Numero
				System.out.println("Valor do Primeiro Numero: "+MUltiplicacao.Numero1);
				System.out.println("Valor do SEgundo Numero: "+MUltiplicacao.Numero2);
				
				System.out.println("Resultado da MUltiplicacao: "+MUltiplicacao.Multiplicar());
				
		
	}

}
