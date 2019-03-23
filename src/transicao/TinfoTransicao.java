package transicao;

public class TinfoTransicao {
		int de;
		int para;
		String comSimbolo;
		String lendoPilha, inserindoPilha;
	
		public TinfoTransicao(int doEstado, int paraEstado, String comSimbolo, String lendoPilha, String inserindoPilha) {
			this.de = doEstado;
			this.para = paraEstado;
			this.comSimbolo = comSimbolo;
			this.lendoPilha = lendoPilha;
			this.inserindoPilha = inserindoPilha;
		}	

		
}
