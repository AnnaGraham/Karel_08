import edu.fcps.karel2.Display;

/**
 * A SteepleChaseRacer is a Racer that can jump over hurdles of any height.
 * 
 * @author <...>
 * @version <...>
 *
 */
public class SteepleChaseRacer extends Racer {
	
	//TODO Subclasses do not inherit any constructors from their superclass
	//Consequently, you will need to provide a compatible constructor
	public SteepleChaseRacer(int y){
		super(y);
	}
	
	/**
	 * Re-implement the method to allow for jumping hurdles of any height
	 */
	
	public void jumpRight() {
		turnLeft();
		int count = 0;
		while(!rightIsClear()){
			move();
			count++;
		}
		turnRight();
		move();
		turnRight();
		for(int i = 0; i< count; i++){
			move();
			
		}
		turnRight();
	}

}
