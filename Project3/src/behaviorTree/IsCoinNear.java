package behaviorTree;

import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.agents.controllers.BehaviorAgent;

//CanShoot
public class IsCoinNear implements Task {
	public IsCoinNear() {
		
	}
	
	@Override
	public boolean run(BehaviorAgent b) {
		/*int x = getMarioEgoRow();
	    int y = getMarioEgoCol();
	    
	    if(isCoin(mergedObservation[x+2][y+2])) {
	    	coinUp = true;
	    	return clearFront();
	    } else if(isCoin(mergedObservation[x+2][y])) {
	    	coinRight = true;
	    	return clearFront();
	    } else {
	    	return false;
	    }*/
		return false;
	}
}
