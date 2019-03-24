package listaEstados;
import transicao.*;

public class Tnodo {
	
	public Tinfo item;
	public Tnodo proximo;	
	
	
	
	public Tnodo() {}
	public Tnodo(Tinfo item) {
		this.item=new Tinfo(item.nome, item.id,item.inicial,item.aceitacao);
		this.proximo=null;
		
		
	}
	
}
