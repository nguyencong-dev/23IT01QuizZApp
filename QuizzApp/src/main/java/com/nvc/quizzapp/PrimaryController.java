package com.nvc.quizzapp;

import com.nvc.utils.MyAlert;
import com.nvc.utils.MyStage;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {
    public void handleQuestionManagement(ActionEvent event) throws IOException{
//       Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
//       Stage stage = new Stage();
//       stage.setTitle("quiz app");
//        stage.setScene(scene);
//        stage.show();    

        MyStage.getInstance().showStage("questions.fxml");
    }
    
    public void handlePractice(ActionEvent event){
        MyAlert.getInstance().showSmg("a do 78");    
    }
    
    
}
