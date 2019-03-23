package pilha;

public class TnodoPilha {

	TinfoPilha item;
	TnodoPilha proximo;

	public TnodoPilha(String simbolo) {
		this.item= new TinfoPilha(simbolo);
		this.proximo=null;
	}
}
