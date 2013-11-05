package br.com.curso.mb;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import br.com.curso.model.Disciplina;
import br.com.curso.model.Professor;
import br.com.curso.view.StageGeneric;

public class CadastroProfessorController {
	@FXML
	private AnchorPane root;
	@FXML
	private TextField nome;
	@FXML
	private TextField disciplina;
	@FXML
	private TextField usuario;
	@FXML
	private TextField senha;
	
	@FXML
	public void cadastrarAction(ActionEvent event) {
    	Professor p = new Professor();
    	Disciplina d = new Disciplina();
    	p.setNome(nome.getText());
    	p.setUsuario(usuario.getText());
    	d.setNome(disciplina.getText());
    	p.setDisciplina(d);
    	StageGeneric s = getStage();
    	ObservableList<Professor> data = getTableProfessor();
    	data.add(p);

    	s.close();
	}
	
	
	private ObservableList<Professor> getTableProfessor() { 
        StageGeneric stage =  getStage(); 
        ListaAlunoController controller = (ListaAlunoController) stage.getPreviousController(); 
        return controller.getData(); 
	} 	
	
	private StageGeneric getStage() {
		return (StageGeneric) root.getScene().getWindow();
	}
}
