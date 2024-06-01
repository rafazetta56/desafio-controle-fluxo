import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (Exception e) { 
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws Exception {
	    int contagem = parametroDois - parametroUm;
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois){
            System.out.println("O segundo parametro deve ser maior que parametro um");
        }
		
		//realizar o for para imprimir os números com base na variável contagem
        for (String imprimirContagem: contagem){
            System.out.println(imprimirContagem);
        }
	}
}

