package br.com.projeto.carros.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.persistence.EntityManager;

import br.com.projeto.carros.model.Pessoa;
import br.com.projeto.carros.util.JPAUtil;

@FacesConverter(value = "pessoaConverter", forClass = Pessoa.class)
public class PessoaConverter implements Converter {
	EntityManager em = JPAUtil.getEntityManager();

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value == null)
			return null;
		return em.find(Pessoa.class, Integer.parseInt(value));
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		Pessoa pessoa = (Pessoa) value;
		if (pessoa == null || pessoa.getId() == null)
			return null;
		return String.valueOf(pessoa.getId());

	}

}
