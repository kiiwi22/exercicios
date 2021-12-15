package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TesteArquivos {

	Leitor leitor = new Leitor();

	public void leArquivo(String arquivo) {

		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public List<Aluno> transformaDadosDeArquivoEmLista(String arquivo) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				String[] vect = line.split(",");
				String nome = vect[0];
				Integer idade = Integer.parseInt(vect[1]);
				String turma = vect[2];

				Aluno aluno = new Aluno(nome, idade, turma);
				alunos.add(aluno);

				line = br.readLine();
			}
			System.out.println("Alunos: ");
			for (Aluno ref : alunos) {
				System.out.println(ref);
			}
		} catch (IOException e) {
			System.out.println("Error" + e.getMessage());
		}
		return alunos;
	}
}
