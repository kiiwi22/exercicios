package pets.exercicio;

public enum MenuEnum {

	CADASTRAR_ALTERAR(1), EXCLUSAO(2), LISTAGEM(3), FINALIZAR_PROGRAMA(4);

	private Integer codigoOpcao;

	MenuEnum(Integer codigoOpcao) {
		this.codigoOpcao = codigoOpcao;
	}

	public Integer getCodigoOpcao() {
		return codigoOpcao;
	}

	public static MenuEnum recuperaEnum(Integer codigo) {
		for (MenuEnum ref : values()) {
			if (ref.getCodigoOpcao().equals(codigo)) {
				return ref;
			}
		}

		throw new IllegalArgumentException("Código " + codigo + " inválido");

	}
}
