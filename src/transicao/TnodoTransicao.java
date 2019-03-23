package transicao;

public class TnodoTransicao {
	public TinfoTransicao item;
	public TnodoTransicao proximo;
	
	public TnodoTransicao() {}
	public TnodoTransicao(TinfoTransicao item) {
		this.item =  new TinfoTransicao(item.doEstado,item.paraEstado,item.comSimbolo,item.lendoPilha,item.inserindoPilha);
		this.proximo=null;
		
	}
	

}
