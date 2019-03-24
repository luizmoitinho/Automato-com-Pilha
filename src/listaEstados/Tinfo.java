package listaEstados;
import transicao.*;

//classe que representa um estado
public class Tinfo {
	 public int id;  // campo indentificador do estado
	 public String nome;
	 public boolean inicial,aceitacao;	 
	 public TlistaTransicao transicoes =  new TlistaTransicao();
	 
	public Tinfo() {}
	public Tinfo(String nome, int id, boolean inicial, boolean aceitacao) {
		this.id=id;
		this.nome = nome;
		this.inicial=inicial;
		this.aceitacao=aceitacao;
		
	}
	@Override
	public String toString() {
		return "\tNome   : "+this.nome+
			 "\n\tId     : "+this.id+
			 "\n\tInicial: "+this.inicial+
			 "\n\tFianl  : "+this.aceitacao;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	


}
