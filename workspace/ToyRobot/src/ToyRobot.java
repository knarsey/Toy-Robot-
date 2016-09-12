import java.util.Scanner;

public class ToyRobot {

	public static void main(String[] args) {
		placeRobot();
		robotCoordinate();
	}
	
	public static void placeRobot(){

		
		 String placeCommand;
		 /*
		  * Keyboard object has being created to allow user
		  * input/
		  */
		 Scanner keyboard = new Scanner (System.in);
		 
		 Scanner kb = new Scanner(System.in);
		 
		 System.out.println("Enter Command");
		 placeCommand = kb.nextLine();
		 
		 /*
		  * Validates whether the command 'PLACE' has being entered or not.
		  */
		 while(!placeCommand.contains("place") && !placeCommand.contains("PLACE")){
			 
			 System.out.println("The command 'PLACE' must be entered to begin.");
			 placeCommand = kb.nextLine();
		 }		
	}
	
	public static void robotCoordinate(){
		 /*
		  * Coordinates are set to zero because the robot
		  * is currently positioned at 0, 0 (SOUTH WEST)
		  */
		 int X_Coordinate = 0, Y_Coordinate = 0, countSteps = 0;
		 
		 String facingDirection, userCommand = "move", reportStatus = "Report";
		 
		 Scanner keyboard = new Scanner(System.in);

		 
		/*
		 * User is required to enter the X and Y Coordinates to
		 * position the toy robot on the table. By default, the robot
		 * is assumed to be located at 0, 0 (South West)
		 */
		 
		 System.out.println("Enter X Coordinate: ");
		 X_Coordinate = keyboard.nextInt();
		
		 /*
		  * Validates whether or not the X-Axis Coordinates
		  * is less than the requested dimensions which is 5. If it 
		  * is above 5, the program will request the user to re-enter
		  * the dimensions again.
		  */
		 
		 
		 while(X_Coordinate >= 5){
			 System.out.println("Out of Range");
			 System.out.println("Enter X Coordinate: ");
			 X_Coordinate = keyboard.nextInt();
		 }
		 
		 System.out.println("Enter Y Coordinate: ");
		 Y_Coordinate = keyboard.nextInt();
		 
		 /*
		  * Validates whether or not the Y-Axis Coordinates
		  * is less than the requested dimensions which is 5. If it 
		  * is above 5, the program will request the user to re-enter
		  * the dimensions again.
		  */
		 while(Y_Coordinate >= 5){
			 System.out.println("Out of Range");
			 System.out.println("Enter Y Coordinate: ");
			 Y_Coordinate = keyboard.nextInt();
		 }
		 
		 System.out.println("Enter Direction [NORTH, SOUTH, EAST, WEST] ");
		 facingDirection = keyboard.nextLine();
		 
		 while(!facingDirection.contains("NORTH") && !facingDirection.contains("SOUTH")&&
				 !facingDirection.contains("EAST") && !facingDirection.contains("WEST")){
			 
			 System.out.println("Enter Valid Direction");
			 facingDirection = keyboard.nextLine();
		 }

		 while(!userCommand.contains("report") && !userCommand.contains("REPORT")){
		
			 System.out.println();
			 userCommand = keyboard.nextLine();
			 
			 if(userCommand.contains("move")){
				  countSteps++;
				  Y_Coordinate =  Y_Coordinate + countSteps;
			 }
	
		 }

		 /*
		  * Displays result of the Toy Robot's Location
		  */
		 System.out.println("Output: "  +  X_Coordinate + " , " 
		 + Y_Coordinate + "  " + facingDirection);
	}
	
		
}


