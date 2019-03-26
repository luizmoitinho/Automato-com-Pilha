package listaEstados;
import pilha.*;
import transicao.*;
public class Tlista extends TlistaTransicao {
	protected Tnodo primeiro;
	protected Tnodo ultimo;
	protected TPilha pilha =  new TPilha();
	
	public Tlista() {
		CriaListaEstado();
		
	}
	
	public void CriaListaEstado() { 
		Tinfo item = new Tinfo("",0,false,false);
		this.primeiro =  new Tnodo(item);
		this.ultimo = this.primeiro;
		
		
	}
	
	public void criaEstado(Tinfo item) {
		
		if(isVazia()) {
			item.id=0;
			item.nome="q0";
			
		}else{	
			Tnodo pesquisa = verificaEstadoInicial();
			int idAnterior =  this.ultimo.item.id;
			idAnterior++;
			String id =  Integer.toString(idAnterior);
			item.nome="q"+id;
			item.id= idAnterior; // novo id, o qual acresceu +1 no id anterior
			
			if(pesquisa.item.inicial==item.inicial)
				pesquisa.item.inicial=false;
			
		}
		insereFim(item);
	}
	public void insereInicio(Tinfo item) {
		Tnodo aux =  this.primeiro.proximo;
		Tnodo novo =  new Tnodo(item);
		novo.proximo = aux;
		this.primeiro.proximo=novo;
		if(aux==null)
			this.ultimo=aux;
		this.primeiro.item.id++;					
	}
	
	public void insereFim(Tinfo item) {
		Tnodo novo =  new Tnodo(item);
		novo.proximo =  this.ultimo.proximo;
		this.ultimo.proximo=novo;
		this.ultimo = novo;	
	}
	public void removeInicio(){
		if(isVazia())
			msgVazia();
		else {
			Tnodo aux = this.primeiro.proximo;
			System.out.println("elemento removido: "+ aux.item.id);
			this.primeiro.proximo = aux.proximo;
			if(this.primeiro.proximo==null)
				this.ultimo=this.primeiro;
		}
	}
	


	
	public boolean valida(String palavra) {
		boolean validada = false;
		Tnodo estado = verificaEstadoInicial();
		TnodoTransicao transicao =  estado.item.transicoes.primeiro.proximo;
		TPilha pilha =  new TPilha();
		validaPalavra(estado, transicao,palavra, 0, palavra.length(),validada,pilha);
		return validada;
		
	}
	public void  validaPalavra(Tnodo estado, TnodoTransicao transicao,String palavra ,int i,int j, boolean validada, TPilha pilha) {
		//System.out.println("\n Entrei : \n"+transicao.item.toString()+" \n ");
		TPilha novaPilha = new TPilha();
		novaPilha =  pilha;
		pilha.imprime();
		if(transicao!=null && estado!=null && i<j) {
			//validaPalavra(estado, transicao.proximo,palavra,i,j,validada,pilha);
			System.out.println("\n"+ transicao.item.toString()+"\n");
			if(transicao.item.getComSimbolo().equals(Character.toString(palavra.charAt(i))) ) {
				if(transicao.item.getLendoPilha().equals(pilha.Topo())) 
					pilha.pop();
				if(!transicao.item.getInserindoPilha().equals(""))
					pilha.push(transicao.item.getInserindoPilha());		
				i++;
				estado = pesquisaElementoById(transicao.item.getPara());
				transicao = estado.item.transicoes.primeiro.proximo;

				validaPalavra(estado,transicao,palavra,i,j,validada,novaPilha);
				if(estado.item.aceitacao || novaPilha.isVazia())
					System.out.println("Palavra aceita!");
			
			}
		}	
		
	}

		
	public Tnodo verificaEstadoInicial() {
		Tnodo aux =  this.primeiro.proximo;
		while(aux!=null) {
			if(aux.item.inicial==true)
				break;
			aux = aux.proximo;
		}
		return aux;
	}

	public Tnodo pesquisaElementoById(int id) {
		Tnodo aux =  this.primeiro.proximo;
		
		if(isVazia()) 
			msgVazia();	
		else 
			while(aux!=null) {
				if(aux.item.id==id)
					break;
				aux = aux.proximo;
			}
		return aux;
	}
	
	public void pesquisaRemoveEstados(Tinfo item) {
		Tnodo p1 =  this.primeiro;
		Tnodo p2 =  p1.proximo;
		
		if(isVazia())
			msgVazia();
		else {
			while(p2!=null) {
				if(p2.item.id ==  item.id){
					p1.proximo=  p2.proximo;
					System.out.println(p2.item.toString());
					break;
				}
				p1=p2;
				p2 = p2.proximo;
			}
			if(p1.proximo==null)
				this.ultimo=p1;
				
		}		
	}
	
	public boolean isVazia() {
		return this.primeiro==this.ultimo?true:false;
	}
	@Override
	public void msgVazia() {
		System.out.println("Lista vazia");
	}
	
	public void imprimeEstados() {
		if(isVazia())
			msgVazia();
		else {
			Tnodo aux = this.primeiro.proximo;
			while(aux!=null) {
				System.out.println(aux.item.toString());
				System.out.println("\t________________________");
				aux=aux.proximo;
			}
		}
		
		
	}
	
	public void insereTransicao(TinfoTransicao transicao) {
		Tnodo aux = pesquisaElementoById(transicao.getDe());
		aux.item.toString();
		if(aux!=null) {
			aux.item.transicoes.insereFim(transicao);
			aux = aux.proximo;
		}
		
	}
	public void imprimeTransicaoPorEstado(Tinfo item) {
		Tnodo pesquisa = pesquisaElementoById(item.id);
		TnodoTransicao aux =  pesquisa.item.transicoes.primeiro.proximo;
		if(aux==null)
			msgVazia();
		else {
			while(aux!=null) {
				System.out.println(aux.item.toString());
				System.out.println("_____________________");
				aux = aux.proximo;
			}
		}
	}


}
