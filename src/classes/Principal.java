package classes;
import pilha.*;
import transicao.*;
import listaEstados.*;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;
public class Principal {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		Tlista AP = new Tlista();
		TlistaTransicao transicao =  new TlistaTransicao();
		//-----------------------------------
		Tinfo infoEstados = new Tinfo();
		TinfoTransicao infoTransicao =  new TinfoTransicao();
		Tnodo aux =  new Tnodo();
		
		int op;
		do {
			
				menu();
				op= input.nextInt();
				switch(op) {
					case 1:
						System.out.println("\n\t-------------------------------------\n");		
						System.out.print("\t\tInicial? ");
						infoEstados.inicial = input.nextBoolean();
						System.out.print("\t\tFinal? ");
						infoEstados.aceitacao = input.nextBoolean();
						
						AP.criaEstado(infoEstados);
						System.out.println("\n\t-------------------------------------\n");
						break;
					case 2:
						System.out.println("\t\tRemove estado");
						System.out.print("Informe o id : ");
						infoEstados.id = input.nextInt();
						AP.pesquisaRemoveEstados(infoEstados);	
						break;
					case 3:
						System.out.println("\tIMPRIMINDO..");
						AP.imprimeEstados();
						break;
					case 4:
						//Procurar um elemento, caso esteja na lista então é inserida uma transição para o mesmo.
						//tomando por base que tenhamos esse elemento na lista, faço a transição alocando ela do estado que a mesma parte.
						//suponha que exista dois estados par serem ligados, então nao coloquei nenhuma execeção.
						transicao.preencheDados(infoTransicao);
						AP.insereTransicao(infoTransicao);
						break;
					case 5:
					
						break;
					case 6:
					
						System.out.println("TODAS AS TRANSICOES");
						System.out.println("Informe o id : ");
						infoEstados.id= input.nextInt();
						AP.imprimeTransicaoPorEstado(infoEstados);
						break;
						
					case 7:
						input.nextLine();
						String palavra;
						System.out.println("\tTESTAR PALAVRAS");
						System.out.print("\tDigite a palavra: ");
						palavra = input.nextLine();
						if(AP.valida(palavra))
							System.out.println("Palavra aceita!");
						else
							System.out.println("Palavra não foi aceita!");
						break;
					case 8:
						System.out.println("programa finalizado");
						break;	
				}
		}while(op!=8);	
	 
			
	}
	public static void menu() {
		System.out.println("\t\tMENU");
		System.out.println("\t[1] - CRIAR UM NOVO ESTADO");
		System.out.println("\t[2] - REMOVER ESTADO");
		System.out.println("\t[3] - IMPRIMIR ESTADOS");
		
		System.out.println("\t-----------------------------");
		System.out.println("\t[4] - ADICIONAR TRANSIÇÃO");
		//System.out.println("\t[5] - REMOVER TRANSICAO");
		System.out.println("\t[6] - IMPRIMIR TRANSIÇÕES");
		
		System.out.println("\t-----------------------------");
		System.out.println("\t[7] - TESTAR PALAVRA");
		System.out.println("\t[8] - SAIR");
		System.out.print("\t>> Opção : ");
	}
	
}
