package br.com.projeto.carros.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.persistence.EntityManager;

import br.com.projeto.carros.model.Modelo;
import br.com.projeto.carros.util.JPAUtil;

@FacesConverter(value = "modeloConverter", forClass = Modelo.class)
public class ModeloConverter implements Converter {
	EntityManager em = JPAUtil.getEntityManager();

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {

		if (value == null)
			return null;

		return em.find(Modelo.class, Integer.parseInt(value));
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		Modelo modelo = (Modelo) value;
		
		if(modelo == null || modelo.getId()== null) return null;

		return String.valueOf(modelo.getId());

	}

}
