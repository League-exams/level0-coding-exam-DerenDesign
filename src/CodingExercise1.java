import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
   	 // 3. ask the user what color they would like the Robot to draw
    	String answer = JOptionPane.showInputDialog("What color do you want?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
    	
   	 // 2. set the pen width to 10

   	 // 1. make the Robot draw a shape
    	Robot rob = new Robot();
    	rob.penDown();
    	rob.setSpeed(20);
    	rob.setPenWidth(10);
    	if (answer.equals("Red")){
    			rob.setPenColor(Color.RED);
    			
    	    }
    	else if (answer.equals("Green")){
			rob.setPenColor(Color.GREEN);
			
	    	
	    }
    	else if (answer.equals("Blue")){
			rob.setPenColor(Color.BLUE);
			
	    	
	    }
    	else if (answer.equals("Black")){
			rob.setPenColor(Color.BLACK);
			
	    	
	    }
    	for (int i = 0; i < 4; i++) {
	    	
	    	rob.move(30);
	    	rob.turn(90);
	    	
	    }
    	
    	
   	 
    }


}