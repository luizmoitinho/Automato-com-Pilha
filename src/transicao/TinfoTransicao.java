package transicao;

public class TinfoTransicao {
		private int de;
		private int para;
		private String lendoPilha, inserindoPilha,comSimbolo;

		public TinfoTransicao() {};
		public TinfoTransicao(int doEstado, int paraEstado, String comSimbolo,String lendoPilha, String inserindoPilha) {
			this.de = doEstado;
			this.para = paraEstado;
			this.lendoPilha = lendoPilha;
			this.inserindoPilha = inserindoPilha;
			this.comSimbolo =  comSimbolo;
		
		}
		@Override
	
		public String toString() {
			return  "\tDe........: "+this.getDe()
				 +"\n\tPara......: "+this.getPara()
				 +"\n\tCom simbolo: "+this.getComSimbolo()
				 +"\n\tLendo.....: "+this.getLendoPilha()
				 +"\n\tEscrevendo: "+this.getInserindoPilha();
				 
		}
		public String getComSimbolo() {
			return comSimbolo;
		}
		public void setComSimbolo(String comSimbolo) {
			this.comSimbolo = comSimbolo;
		}
		public int getDe() {
			return de;
		}
		public void setDe(int de) {
			this.de = de;
		}
		public int getPara() {
			return para;
		}
		public void setPara(int para) {
			this.para = para;
		}
		public String getLendoPilha() {
			return lendoPilha;
		}
		public void setLendoPilha(String lendoPilha) {
			this.lendoPilha = lendoPilha;
		}
		public String getInserindoPilha() {
			return inserindoPilha;
		}
		public void setInserindoPilha(String inserindoPilha) {
			this.inserindoPilha = inserindoPilha;
		}	

		
}
