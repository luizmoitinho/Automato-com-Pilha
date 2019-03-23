package listaEstados;

//classe que representa um estado
public class Tinfo {
	 public int id;  // campo indentificador do estado
	 public String nome;
	
	public Tinfo() {}
	public Tinfo(String nome, int id) {
		this.id=id;
		this.nome = nome;

		
	}
	@Override
	public String toString() {
		return "Nome : "+this.nome+
			 "\nId   :"+this.id;

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
