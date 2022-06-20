package br.com.projeto.carros.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.projeto.carros.dao.CarroDao;
import br.com.projeto.carros.model.Carro;
import br.com.projeto.carros.model.Marca;
import br.com.projeto.carros.model.Modelo;
import br.com.projeto.carros.model.Pessoa;

@ManagedBean
@SessionScoped
public class CarroBean {

	private Carro carro;
	private CarroDao carroDao;
	private Marca marca;
	private Pessoa pessoa;
	private Modelo modelo;
	private List<Carro> carros;
	private List<Marca> marcas;
	private List<Modelo> modelos;
	private List<Pessoa> pessoas;

	@PostConstruct
	public void init() {
		carroDao = new CarroDao();
		carro = new Carro();
		carros = carroDao.listaCarros();
		marcas = carroDao.listaMarcas();
		modelos = carroDao.listaModelos();
		pessoas = carroDao.listaPessoas();
		marca = new Marca();
		modelo = new Modelo();
		pessoa = new Pessoa();
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public CarroDao getCarroDao() {
		return carroDao;
	}

	public void setCarroDao(CarroDao carroDao) {
		this.carroDao = carroDao;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

	public List<Marca> getMarcas() {
		return marcas;
	}

	public void setMarcas(List<Marca> marcas) {
		this.marcas = marcas;
	}

	public List<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public String salva() {
		carroDao.salva(carro);
		carros = carroDao.listaCarros();
		System.out.println("salvando carro");
		return "index.xhtml?faces-redirect=true";
	}

}
