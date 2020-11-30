/*
 * Class: CMSC201 
 * Instructor:
 * Description: (Give a brief description for each Program)
 * Due: 11/22/20
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Quentin Jefferies
*/


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;



public class Project6 extends Application {
  
private final double width = 500;
private final double height = 400;


@Override
public void start(Stage primaryStage) {//create primary stage
Pane pane = new Pane();//create pane 
pane.setStyle("-fx-border-color : lightBlue");


//string for x axis 
String[] piAxis = {"", "-2\u03c0", "-\u03c0", "0", "\u03c0", "2\u03c0", ""};

//Define number axis and show arrows
Polyline polylineX = new Polyline();//https://docs.oracle.com/javase/8/javafx/api/javafx/scene/shape/Polyline.html
polylineX.getPoints().addAll(new Double[]{
	20.0, 90.0, 400.0, 90.0, 370.0, 110.0, 
	370.0, 70.0, 400.0, 90.0
});


Polyline polylineY = new Polyline();
polylineY.getPoints().addAll(new Double[]{
	200.0, 10.0, 200.0, 200.0
});


//text for x axis with piAxis string 
for (int i = 50; i <= 350; i += 50)
{
	Text t1 = new Text(i, 100, piAxis[i/50 - 1]);
	pane.getChildren().addAll(t1);
}

//create text for x AND y axis label
Text textX = new Text(400, 80, "X");
pane.getChildren().addAll(textX);

Text textY = new Text(205, 20, "Y");
pane.getChildren().addAll(textY);


//sine formula set color to red
Polyline polylineSin = new Polyline();
polylineSin.setStroke(Color.RED);
ObservableList<Double> list = polylineSin.getPoints();
double scaleFactor = 50;
for (int x = -170; x <= 170; x++) {
list.add((double) (x + 200));
list.add(100 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
}

//Cosine formula and set color to blue 
Polyline polylineCos = new Polyline();
polylineCos.setStroke(Color.BLUE);
ObservableList<Double> list2 = polylineCos.getPoints();
scaleFactor = 50;
for (int x = -170; x <= 170; x++) {
list2.add((double) (x + 200));
list2.add(100 - 50 * Math.cos((x / 100.0) * 2 * Math.PI));
}

//add all instantiated objects to the pane
pane.getChildren().addAll(polylineX, polylineY, polylineCos, polylineSin);
primaryStage.setScene(new Scene(pane, width, height)); 
primaryStage.setTitle("Project 11");//create title
primaryStage.show();//make window visible 
}



public static void main(String[] args) {
launch(args);
}
  
}
