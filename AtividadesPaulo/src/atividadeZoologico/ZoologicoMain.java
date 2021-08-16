package atividadeZoologico;
import java.util.ArrayList;
public class ZoologicoMain {

	public static void main(String[] args) {
		CadastradorAnimal c = new CadastradorAnimal();
		BuscadorAnimal b = new BuscadorAnimal();
		ArrayList<Animal> animais = c.cadastraAnimal();
		b.buscaNomeAnimal(animais);
		b.pesquisaIdadeAnimal(animais);
		b.pesquisaPesoAnimal(animais);
	}
}
