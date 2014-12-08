/**
 * A BoxTopRacer is a Racer that can jump over hurdles of any width.
 * 
 * @author <...>
 * @version <...>
 *
 */
public class BoxTopRacer extends Racer {
	
	//TODO Subclasses do not inherit any constructors from their superclass
	//Consequently, you will need to provide a compatible constructor
	public BoxTopRacer(int y){
		super(y);
	}
	
	/**
	 * Re-implement the method to allow for jumping hurdles of any width
	 */
	@Override
	public void jumpRight() {
		turnLeft();
		int count = 0;
		while(!rightIsClear()){
			move();
			count++;
		}
		
		turnRight();
		move();
		while(!rightIsClear()){
			move();
		}
		turnRight();
		
		for(int i = 0; i< count; i++){
			move();
			
		}
		turnRight();
	}

}
