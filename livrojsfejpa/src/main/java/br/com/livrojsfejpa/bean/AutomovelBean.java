package br.com.livrojsfejpa.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.livrojsfejpa.dao.AutomovelDao;
import br.com.livrojsfejpa.model.Automovel;

@ManagedBean
public class AutomovelBean {

	private AutomovelDao dao;
	private Automovel automovel;
	private List<Automovel> automoveis;

	@PostConstruct
	public void init() {
		dao = new AutomovelDao();
		automovel = new Automovel();
		automoveis = dao.getAutomoveis();
	}

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

	public AutomovelDao getDao() {
		return dao;
	}

	public void setDao(AutomovelDao dao) {
		this.dao = dao;
	}

	public void setAutomoveis(List<Automovel> automoveis) {
		this.automoveis = automoveis;
	}

	public List<Automovel> getAutomoveis() {
		return automoveis;
	}

	public String salva() {
		dao.salva(automovel);
		automoveis = dao.getAutomoveis();
		return "index.xhtml?faces-redirect=true";
	}

	public String exclui() {
		dao.exclui(automovel.getId());
		automoveis = dao.getAutomoveis();
		return "index.xhtml?faces-redirect=true";
	}

	public void selecionar() {
		automovel = dao.selecionar(automovel.getId());
	}
	
	public String atualizar() {
		dao.atualizar(automovel);
		automoveis = dao.getAutomoveis();
		
		return "index.xhtml?faces-redirect=true";
	}
}
