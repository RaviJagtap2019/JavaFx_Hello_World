package org.dnyanyog;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public  class ActorsOnStage extends Application{
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage stageRovidedByJavaFx111) {
		Stage stage =new Stage();
		
		stage.setTitle("Text Learn");
		
		Text actorText=new Text();
		actorText.setText("Hello World");
		actorText.setFont(Font.font("Verdana",50));
		actorText.setFill(Color.WHITE);
		actorText.setX(50);
		actorText.setY(50);
		
		Line actorLine =new Line();
		actorLine.setStroke(Color.WHITE);
		actorLine.setStrokeWidth(5);
		actorLine.setStartX(60);
		actorLine.setStartY(60);
		actorLine.setEndX(360);
		actorLine.setEndY(60);
		
		Rectangle actorRect=new Rectangle();
		actorRect.setFill(Color.WHITE);
		actorRect.setX(80);
		actorRect.setY(80);
		actorRect.setWidth(250);
		actorRect.setHeight(250);
		
//		Circle actorcle=new Circle();
//		actorcle.setFill(Color.WHITE);
//		actorcle.setScaleX(100);
//		actorcle.setScaleY(100);
//		actorcle.setRadius(1);
		
		Group actorgroup=new Group();
		actorgroup.getChildren().add(actorText);
		actorgroup.getChildren().add(actorLine);
		actorgroup.getChildren().add(actorRect);
//		actorgroup.getChildren().add(actorcle);
		
		Scene scene=new Scene(actorgroup,Color.BLACK);
		
		stage.setScene(scene);
		
		stage.show();
	}
}
