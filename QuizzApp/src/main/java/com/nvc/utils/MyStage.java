/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvc.utils;

import com.nvc.quizzapp.App;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class MyStage {
    private static MyStage Instance;
    private Scene scene;
    private final Stage stage;
    
    private MyStage(){
        stage = new Stage();
        stage.setTitle("Quiz app");
    }
    
    public static MyStage getInstance(){
        if(Instance == null)
            Instance = new MyStage();
        return Instance;
    } 
    
    public void showStage(String fxml) throws IOException{
        if(scene == null){
            scene = new Scene(new FXMLLoader(App.class.getResource(fxml)).load());
        }
        else{
            scene.setRoot(new FXMLLoader(App.class.getResource(fxml)).load());
        }
        stage.setScene(scene);
        stage.show();
    }
}
