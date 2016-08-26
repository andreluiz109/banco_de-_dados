package br.com.fainor.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fainor.model.Professor;

public class ProfessorDAO {

public List<Professor> todos(){
		
		List<Professor> professores = new ArrayList<>();
		
		professores.add(new Professor(1L,"Charles", "231.746.516-32","CJ596"));	
		professores.add(new Professor(2L,"Takya", "265.465.232-65","KJ593"));	
		professores.add(new Professor(3L,"Munelar", "899.331.684-32","JJ889"));	
		professores.add(new Professor(4L,"Lucas", "882.326.516-82","AN895"));	
		return professores;
	}
	
	public Professor porId(Long id){
		for(Professor professor: todos()){
			if(professor.getId()== id){
				return professor;
			}
		}
		return null;
	}
}
