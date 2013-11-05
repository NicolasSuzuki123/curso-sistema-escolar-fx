package br.com.curso.mb;

import br.com.curso.view.StageGeneric;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginController {

	@FXML
	private AnchorPane root;
    @FXML 
    private TextField usuarioAdmin;
    @FXML
    private PasswordField senhaAdmin;
  
    @FXML 
    private TextField raAluno;
	
    @FXML
    public void loginAdminAction(ActionEvent event) {
    	StageGeneric stage = new StageGeneric("/br/com/curso/view/aluno_lista.fxml");
    	stage.setLargura(600);
    	stage.setAltura(350);
    	stage.init();
    	close();
    }
    
    @FXML
    public void loginAlunoAction(ActionEvent event) {
    	close();
    }

    private void close() {
    	Stage stage = (Stage) root.getScene().getWindow();
    	stage.close();
    }
	
}

