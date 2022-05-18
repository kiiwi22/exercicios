package Model;

public class ModeloBeans {
	
	private Integer id;
	private String descricao;
	private Integer idMarca;
	private MarcaBeans marca;

	public ModeloBeans(int id, String descricao, int idMarca) {
		this.id = id;
		this.descricao = descricao;
		this.idMarca = idMarca;
	}

	public ModeloBeans(String descricao, MarcaBeans marca) {
		this.descricao = descricao;
		this.marca = marca;
	}
	
	public MarcaBeans getMarca() {
		return marca;
	}

	public void setMarca(MarcaBeans marca) {
		this.marca = marca;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}
}
