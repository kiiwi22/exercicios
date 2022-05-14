package Model;

public class CarroBeans {
	private Integer id;
	private String chassi;
	private String renavam;
	private String placa;
	private Integer ano;
	private Integer idModelo;
	private Integer idPessoa;
	private PessoaBeans pessoa;
	private ModeloBeans modelo;

	
	public CarroBeans() {}
	
	public CarroBeans(String chassi, String renavam, String placa, Integer ano, Integer idModelo, Integer idPessoa,
			PessoaBeans pessoa, ModeloBeans modelo) {
		super();
		this.chassi = chassi;
		this.renavam = renavam;
		this.placa = placa;
		this.ano = ano;
		this.idModelo = idModelo;
		this.idPessoa = idPessoa;
		this.pessoa = pessoa;
		this.modelo = modelo;
	}

	public PessoaBeans getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaBeans pessoa) {
		this.pessoa = pessoa;
	}

	public ModeloBeans getModelo() {
		return modelo;
	}

	public void setModelo(ModeloBeans modelo) {
		this.modelo = modelo;
	}

	public Integer getId() {
		return id;
	}

	public void setIdModelo(Integer idModelo) {
		this.idModelo = idModelo;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public Integer getIdModelo() {
		return idModelo;
	}
}
