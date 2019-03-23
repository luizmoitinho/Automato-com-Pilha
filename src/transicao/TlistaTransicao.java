package transicao;

public class TlistaTransicao {
	public TnodoTransicao primeiro;
	public TnodoTransicao ultimo;
	
	public TlistaTransicao() {
		Cria();
	}
	
	public void Cria() {
		TinfoTransicao item =  new TinfoTransicao(0,0,"","","");
		this.primeiro= new TnodoTransicao(item);
		this.ultimo = this.primeiro;
		
	}
	//insere um estado e suas credenciais de transicao.. lendo.. push e/ou pop
	public void insereTransicao(TinfoTransicao item) {
		TnodoTransicao novo = new TnodoTransicao();
		novo.proximo =  this.ultimo.proximo;
		this.ultimo.proximo =  novo;
		this.ultimo = novo;	
	}
	public void removeTransicao(TinfoTransicao item) {
		TnodoTransicao p1 = this.primeiro;
		TnodoTransicao p2 = p1.proximo;
		
		while(p2!=null) {
			if((p2.item.de ==  item.de) & (p2.item.para== item.para) & (p2.item.comSimbolo ==  item.comSimbolo) ) {
				p1.proximo= p2.proximo;
				break;
			}
			
			p1= p2;
			p2=p2.proximo;
		}
		if(p1.proximo==null)
			this.ultimo=p1;
	}
	
	
}
	
