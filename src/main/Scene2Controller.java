/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Yuns
 */
public class Scene2Controller implements Initializable {
@FXML
	TextField usdTextField;
    @FXML
	TextField nisTextField;
    private Label nameLabel1;
    @FXML
    private Label nameLabel11;
    @FXML
    private Label nameLabel111;
    @FXML
    private Label nameLabel1111;
    @FXML
    private Button logout;
    @FXML
    private Button convert;
@FXML
	Label nameLabel;
	
	public void displayName(String username) {
		nameLabel.setText("Hello: " + username);
	}
	
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnlogout(ActionEvent event) {
    }

    @FXML
    private void btnconvert(ActionEvent event) {
    }
    
}
