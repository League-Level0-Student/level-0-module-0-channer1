import org.jointheleague.graphical.robot.Robot;

public class graffiti {

;
public static void main(String[] args) throws Exception{
Robot name=new Robot();
 name.penDown();
 name.setSpeed(100);
 for (int i = 0; i < 3; i++) {
	name.turn(-90);
	 name.move(200);
}



}}