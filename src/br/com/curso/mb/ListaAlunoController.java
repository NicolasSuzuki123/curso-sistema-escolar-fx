package br.com.curso.mb;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import br.com.curso.model.Aluno;
import br.com.curso.view.StageGeneric;

public class ListaAlunoController implements Initializable {
     
    
	@FXML
	private AnchorPane root;
    @FXML
    TableView<Aluno> tabelaAluno;
 
    @FXML
    TableColumn<Aluno,String> nome;
    @FXML
    TableColumn<Aluno,String> ra;

    ObservableList<Aluno> data;
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
    	
        nome.setCellValueFactory(new PropertyValueFactory<Aluno,String>("nome"));
        ra.setCellValueFactory(new PropertyValueFactory<Aluno,String>("ra")); 
        data = FXCollections.observableArrayList();
        tabelaAluno.setItems(data);
    }    
 
    @FXML
    private void adicionaAction(ActionEvent event) {
    	StageGeneric stage = new StageGeneric("/br/com/curso/view/aluno_cadastra.fxml");
    	stage.setLargura(315);
    	stage.setAltura(190);
    	stage.setPreviousController(this);
    	stage.init();
    }
    
    @FXML 
	 private void apagaAction(ActionEvent event) { 

       //Seleciona a linha 
       int selectedIndex = tabelaAluno.getSelectionModel().getSelectedIndex(); 
       
       //Pega o registro 
       Aluno p = tabelaAluno.getItems().get(selectedIndex); 
       
       //Apaga a linha 
       tabelaAluno.getItems().remove(selectedIndex); 
       System.out.println(p.getNome()); 
    }

	public ObservableList<Aluno> getData() {
		return data;
	}

	public void setData(ObservableList<Aluno> data) {
		this.data = data;
	} 	    
	 @FXML
	    private void rgnotaAction(ActionEvent event) {
	    	
	    }
}