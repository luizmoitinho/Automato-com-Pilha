package classes;
import pilha.*;
public class Estado {
	private String name;
	private int id;			//	Primary key -  identificador chave.
	private String lendo; //letra
	private String vaiPara;//id do estado
	TinfoPilha p;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLendo() {
		return lendo;
	}
	public void setLendo(String lendo) {
		this.lendo = lendo;
	}
	public String getVaiPara() {
		return vaiPara;
	}
	public void setVaiPara(String vaiPara) {
		this.vaiPara = vaiPara;
	}

}
