package site.camila.cursojava.executavel;

import javax.swing.JOptionPane;


public class PrimeiraClasseJava {
	public static void main(String[] args) {
		/*
		String nome = JOptionPane.showInputDialog("Nome: ");
		String idade = JOptionPane.showInputDialog("Idade: ");
		String dataDeNascimento = JOptionPane.showInputDialog("Data de nascimento: ");
		String rg = JOptionPane.showInputDialog("RG: ");
		String cpf = JOptionPane.showInputDialog("CPF: ");
		String mae = JOptionPane.showInputDialog("Nome da mãe: ");
		String pai = JOptionPane.showInputDialog("Nome do Pai: ");
		String dataMatricula = JOptionPane.showInputDialog("Data da Matricula: ");
		String serie = JOptionPane.showInputDialog("Série ");
		String escola = JOptionPane.showInputDialog("Escola: ");
		String nota1 = JOptionPane.showInputDialog("Nota1: ");
		String nota2 = JOptionPane.showInputDialog("Nota2: ");
		String nota3 = JOptionPane.showInputDialog("Nota3: ");
		String nota4 = JOptionPane.showInputDialog("Nota4: ");


		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataDeNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		/*
		System.out.println("O nome do aluno1 é = " + aluno1.getNome());
		System.out.println("A idade do aluno1 é = " + aluno1.getIdade() + " anos");
		System.out.println("A data de nascimento do aluno1 é = " + aluno1.getDataNascimento());
		System.out.println("Escola " + aluno1.getNomeEscola());
		System.out.println("Média da nota do aluno1 é " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.isAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Mensagem = " + aluno1.getAlunoAprovado());
		System.out.println("====================");
		
		System.out.println(aluno1);
		*/
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Camila");
		aluno1.setIdade(Integer.valueOf(28));
		aluno1.setNumeroCpf("097.091.054-18");

		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Camila");
		aluno2.setIdade(Integer.valueOf(27));
		aluno2.setNumeroCpf("097.091.054-18");


		
		if (aluno1.equals(aluno2)) System.out.println("Alunos são iguais");
		else System.out.println("Alunos NÃO são iguais");
		
	}
}