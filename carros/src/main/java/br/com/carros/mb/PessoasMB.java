package br.com.carros.mb;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.carros.dao.PessoasDAO;
import br.com.carros.entity.Pessoa;

@ManagedBean(name="pessoaMB")
@RequestScoped
public class PessoasMB implements Serializable{
	
	private static final long serialVersionUID = -8287820768619261694L;
	
	private PessoasDAO dao = new PessoasDAO();
	private List<Pessoa> pessoas;
	
	public PessoasMB() {
		pessoas = dao.findAll();
	}
	
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
}
