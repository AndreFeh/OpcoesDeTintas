package git;
import java.util.Scanner;

public class LojasTintas2 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Tamanho Do Espaço A Ser Pintado Em Metros²: ");
		float tamanhoArea = scan.nextFloat();
		
		double lataTinta = 18;
		double galoesTinta = 3.6;
	
		int valorGalao = 25;
		int valorLata = 80;
		
		int coberturaTinta = 6;
		
		double metrosPorLitro = tamanhoArea / coberturaTinta;
		double qtdLatas = metrosPorLitro / lataTinta;	
		double qtdGaloes = metrosPorLitro / galoesTinta;
		
	// CONVERTER PARA INTEIRO A QUANTIDADE DE LATAS 
		// EXEMPLO - int roundedNumA = (int)Math.ceil(a/100);
			
		int qtdLatasInt = (int)Math.ceil(qtdLatas);
			double valorTotalLata = qtdLatasInt * valorLata;
		
		int qtdGaloesInt = (int)Math.ceil(qtdGaloes);
			double valorTotalGalao = qtdGaloesInt * valorGalao;
		
			
			System.out.println("Total De " + metrosPorLitro + " Litros! Para " + tamanhoArea + " m²" + "\n");
			
			System.out.println("EM LATAS:");
			System.out.println("Total Exato De " + qtdLatas + " Latas Para Pintura!");
			System.out.println("Total De " + qtdLatasInt + " Lata(s) Para Pintura!");
			System.out.println("Valor Total: R$ " + valorTotalLata + "\n");	

			System.out.println("EM GALÕES:");
			System.out.println("Total Exato De " + qtdGaloes + " Galões Para Pintura!");
			System.out.println("Total De " + qtdGaloesInt + " Galão(ões) Para Pintura!");
			System.out.println("Valor Total: R$ " + valorTotalGalao + "\n");
			
//			misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga 
//			e sempre arredonde os valores para cima, isto é, considere latas cheias.
//
//			double ?metrosPorLitro = tamanhoArea / coberturaTinta;
//			double faixaErro = 0.1;
//			double qtdTotal = 0;
//			int qtdTotalInt = (int)Math.ceil(qtdTotal);
	}
}
