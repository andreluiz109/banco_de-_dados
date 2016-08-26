package br.com.fainor.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.fainor.dao.AlunoDAO;
import br.com.fainor.dao.ProfessorDAO;
import br.com.fainor.model.Aula;
import br.com.fainor.model.Disciplina;
import br.com.fainor.model.Frequencia;
import br.com.fainor.model.Sala;
import br.com.fainor.model.TipoSala;

public class TesteProfessorRegistrandoFaltaNosAlunos {
	public static void main(String[] args) throws ParseException {
		
		
		
		Sala labFisica = new Sala();//Cria uma Sala
		labFisica.setDescricao("Lab Exp.");
		labFisica.setNumero("35");
		labFisica.setTipoSala(TipoSala.PRATICA);

		Aula aula1 = new Aula();//Cria Aula
		//aula1.setProfessor(takya);
		//aula1.setTurma(fisica1);
		aula1.setSala(labFisica);
		aula1.setConteudo("Vetores");
		aula1.setDataAula(new Date());
		
		Disciplina fisica_1 = new Disciplina();// Cria uma Disciplina
		fisica_1.setNome("Fisica experimental 1");
		fisica_1.setCodigo("COD32");
		
		Disciplina banco = new Disciplina();// Cria uma Disciplina
		banco.setNome("Banco de Dados");
		banco.setCodigo("COD42");
		
		Disciplina calc = new Disciplina();// Cria uma Disciplina
		calc.setNome("Calculo 4");
		calc.setCodigo("COD66");
		
		AlunoDAO alunoDAO = new AlunoDAO();
		ProfessorDAO professorDAO = new ProfessorDAO();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
		
		Frequencia fisic = new Frequencia();//Dando falta nos alunos
		fisic.setAluno(alunoDAO.porId(1L));
		fisic.setDisciplina(fisica_1);
		fisic.setProfessor(professorDAO.porId(2L));
		fisic.setFaltou(false);
		fisic.setDataFrequencia(df.parse("14/05/2010"));
		
		Frequencia banco_dados = new Frequencia();//Dando falta nos alunos
		banco_dados.setAluno(alunoDAO.porId(2L));
		banco_dados.setDisciplina(banco);
		banco_dados.setProfessor(professorDAO.porId(1L));
		banco_dados.setFaltou(false);
		banco_dados.setDataFrequencia(df.parse("19/05/2010"));
		
		Frequencia calculo_4 = new Frequencia();//Dando falta nos alunos
		calculo_4.setAluno(alunoDAO.porId(3L));
		calculo_4.setDisciplina(calc);
		calculo_4.setProfessor(professorDAO.porId(3L));
		calculo_4.setFaltou(false);
		calculo_4.setDataFrequencia(df.parse("23/05/2010"));
	
		
		
		
		
		
		//Mostrar na tela******************************************************
		System.out.println("O professor: " + fisic.getProfessor().getNome() + ", de CPF: " + fisic.getProfessor().getCpf() + 
				", ministrou a aula de: " + fisic.getDisciplina().getNome() + ", de codigo: "+fisic.getDisciplina().getCodigo() +
				" no dia " + df.format(fisic.getDataFrequencia()) + ", e deu falta no aluno: " + fisic.getAluno().getNome()); 

		System.out.println("O professor: " + banco_dados.getProfessor().getNome() + ", de CPF: " + banco_dados.getProfessor().getCpf() + 
				", ministrou a aula de: " + banco_dados.getDisciplina().getNome() + ", de codigo: "+banco_dados.getDisciplina().getCodigo() +
				" no dia " + df.format(banco_dados.getDataFrequencia()) + ", e deu falta no aluno: " + banco_dados.getAluno().getNome()); 
		
		System.out.println("O professor: " + calculo_4.getProfessor().getNome() + ", de CPF: " + calculo_4.getProfessor().getCpf() + 
				", ministrou a aula de: " + calculo_4.getDisciplina().getNome() + ", de codigo: "+calculo_4.getDisciplina().getCodigo() +
				" no dia " + df.format(calculo_4.getDataFrequencia()) + ", e deu falta no aluno: " + calculo_4.getAluno().getNome()); 
	}
}
