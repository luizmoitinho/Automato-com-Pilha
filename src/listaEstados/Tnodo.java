package listaEstados;


public class Tnodo {
	
	public Tinfo item;
	public Tnodo proximo;

	public Tnodo() {}
	public Tnodo(Tinfo item) {
		this.item=new Tinfo(item.nome, item.id);
		this.proximo=null;
		
		
	}
}
