package listaEstados;


public class Tlista {
	public Tnodo primeiro;
	public Tnodo ultimo;
	public Tlista() {
		Cria();
		
	}
	private void Cria() { 
		Tinfo item = new Tinfo("",0);
		this.primeiro =  new Tnodo(item);
		this.ultimo = this.primeiro;
		
		
	}
	
	public void criaEstado() {
		Tinfo aux = new Tinfo();
		if(isVazia()) {
			aux.id=0;
			aux.nome="q0";			
		}else {	
			int idAnterior =  this.ultimo.item.id;
			idAnterior++;
			String id =  Integer.toString(idAnterior);
			aux.nome="q"+id;
			aux.id= idAnterior; // novo id, o qual acresceu +1 no id anterior
			
		}
		insereFim(aux);
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
	public void pesquisaRemove(Tinfo item) {
		Tnodo p1 =  this.primeiro;
		Tnodo p2 =  p1.proximo;
		
		if(isVazia())
			System.out.println("Não há estados para serem eliminados!");
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
	protected void msgVazia() {
		System.out.println("Lista vazia");
	}
	
	public void imprime() {
		if(isVazia())
			msgVazia();
		else {
			Tnodo aux = this.primeiro.proximo;
			while(aux!=null) {
				System.out.println(aux.item.toString());
				System.out.println("________________________");
				aux=aux.proximo;
			}
		}
		
		
	}
}
