package classes;
import pilha.*;
import listaEstados.*;
import java.util.Scanner;
public class Principal {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("testando a tad pilha");
		Tlista AP = new Tlista();
		int op;
		do {
			
				menu();
				op= input.nextInt();
				switch(op) {
					case 1:
						System.out.println("\n-------------------------------------\n");
						AP.criaEstado();
						AP.imprime();
						System.out.println("\n-------------------------------------\n");
						break;
					case 2:
						Tinfo aux = new Tinfo();
						System.out.println("\t\tRemove estado");
						System.out.println("Informe o id : ");
						aux.id = input.nextInt();
						AP.pesquisaRemove(aux);	
						break;
					case 3:
						System.out.println("IMPRIMINDO..");
						AP.imprime();
						break;
					case 4:
						//transiçao
						
						break;
					case 5:
						System.out.println("programa finalizado");
						break;	
				}
		}while(op!=5);	
	  AP.imprime();
			
	}
	public static void menu() {
		System.out.println("MENU");
		System.out.println("[1] - CRIAR UM NOVO ESTADO");
		System.out.println("[2] - REMOVER ESTADO");
		System.out.println("[3] - IMPRIMIR");
		System.out.println("[5] - SAIR");
		System.out.println(">> Opção : ");
	}
	
}
