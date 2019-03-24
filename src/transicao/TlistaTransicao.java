package transicao;
import pilha.*;
import listaEstados.Tinfo;
import listaEstados.Tnodo;

import java.util.Scanner;
public class TlistaTransicao {
	Scanner input = new Scanner(System.in);
	public TnodoTransicao primeiro;
	public TnodoTransicao ultimo;
	public TPilha pilha =  new TPilha();
	public TlistaTransicao() {
		Cria();
	}
	public void preencheDados(TinfoTransicao infoTransicao) {
		
		
		System.out.print("\t\tCRIAR TRANSICAO");
		System.out.print("\n\tDo estado.......: ");
		infoTransicao.setDe(input.nextInt());
		System.out.print("\n\tPara o estado......: ");
		infoTransicao.setPara(input.nextInt());
		input.nextLine();
		System.out.print("\n\tCom o símbolo.......: ");
		infoTransicao.setComSimbolo(input.nextLine());
		System.out.print("\n\tRemovendo na pilha.: ");
		infoTransicao.setLendoPilha(input.nextLine());
		System.out.print("\n\tInserindo na pilha.: ");
		infoTransicao.setInserindoPilha(input.nextLine());
		
	}
	public void Cria() {
		TinfoTransicao item =  new TinfoTransicao();
		this.primeiro= new TnodoTransicao(item);
		this.ultimo = this.primeiro;
		
	}

	
	//insere um estado e suas credenciais de transicao.. lendo.. push e/ou pop
	public void insereFim(TinfoTransicao item) {		
		TnodoTransicao novo = new TnodoTransicao(item);
		novo.proximo =  this.ultimo.proximo;
		this.ultimo.proximo =  novo;
		this.ultimo = novo;	
	}
	
	public void removeTransicao(TinfoTransicao item) {
		TnodoTransicao p1 = this.primeiro;
		TnodoTransicao p2 = p1.proximo;
		while(p2!=null) {
			if((p2.item.getDe() ==  item.getDe()) &(p2.item.getComSimbolo()== item.getComSimbolo()) &(p2.item.getPara()== item.getPara()) & (p2.item.getLendoPilha()== item.getLendoPilha()) &(p2.item.getInserindoPilha()== item.getInserindoPilha())) 
				break;	
			p1= p2;
			p2=p2.proximo;
		}
		if(p1.proximo==null)
			this.ultimo=p1;
	}
	
	public boolean isTransicaoVazia() {
		return this.primeiro==this.ultimo?true:false;
	}
	public void msgVazia() {
		System.out.println("A lista está vazia!");
	}
			
			
	
}
	
