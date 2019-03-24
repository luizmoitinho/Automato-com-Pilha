package transicao;

public class TnodoTransicao {
	public TinfoTransicao item;
	public TnodoTransicao proximo;
	
	public TnodoTransicao() {}
	public TnodoTransicao(TinfoTransicao item) {
		this.item =  new TinfoTransicao(item.getDe(),item.getPara(),item.getComSimbolo(),item.getLendoPilha(),item.getInserindoPilha());
		this.proximo=null;
		
	}
	

}
