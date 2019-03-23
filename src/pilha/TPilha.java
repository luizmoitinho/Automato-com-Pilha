package pilha;

public class TPilha {
	protected TnodoPilha primeiro;
	protected TnodoPilha ultimo;
	
	public TPilha() {
		Cria();
	}
	public void Cria() {
		TinfoPilha item =  new TinfoPilha("");
		this.primeiro =  new TnodoPilha(item.simbolo);
		this.primeiro = this.ultimo;
	}
	public void push(String simbolo){
		TnodoPilha aux =  this.primeiro.proximo;
		TnodoPilha novo =  new TnodoPilha(simbolo);
		novo.proximo = aux;
		this.primeiro.proximo=novo;
		if(aux==null)
			this.ultimo=aux;
		this.primeiro.item.id++;
	}
	public void pop(){
		
		if(isVazia())
			msgVazia();
		else {
			TnodoPilha aux = this.primeiro.proximo;
			System.out.println("elemento removido: "+ aux.item.id);
			this.primeiro.proximo = aux.proximo;
			if(this.primeiro.proximo==null)
				this.ultimo=this.primeiro;
		}
	}
	public TnodoPilha Topo() {
		TnodoPilha primeiroElemento =  this.primeiro.proximo;
		if(isVazia()) {
			msgVazia();
			return this.primeiro;
		}
		else {
			return primeiroElemento;
		}
		
		
	}

	public boolean isVazia() {
		return this.primeiro==this.ultimo?true:false;
	}
	protected void msgVazia() {
		System.out.println("Pilha vazia");
	}
	
	public void imprime() {
		if(isVazia())
			msgVazia();
		else {
			TnodoPilha aux = this.primeiro.proximo;
			while(aux!=null) {
				System.out.println(aux.item.toString());
				System.out.println("________________________");
				aux=aux.proximo;
			}
		}
		
		
	}
	

}