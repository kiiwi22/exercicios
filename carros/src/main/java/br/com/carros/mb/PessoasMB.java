package br.com.carros.mb;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.carros.dao.CarrosDAO;
import br.com.carros.dao.PessoasDAO;
import br.com.carros.entity.Carro;
import br.com.carros.entity.Pessoa;

@ManagedBean(name="pessoaMB")
@RequestScoped
public class PessoasMB implements Serializable{
	
	private static final long serialVersionUID = -8287820768619261694L;
	
	private PessoasDAO pessoasDao = new PessoasDAO();
	private CarrosDAO carrosDao = new CarrosDAO();
	private List<Pessoa> pessoas;
	private List<Carro> carros;
	
	public PessoasMB() {
		pessoas = pessoasDao.findAll();
		carros = carrosDao.findAll();
	}
	
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
	
}
