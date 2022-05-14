package Model;

public class MarcaBeans {
	private Integer id;
	private String descricao;
	
	
	public MarcaBeans(String descricao) {
		super();
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
