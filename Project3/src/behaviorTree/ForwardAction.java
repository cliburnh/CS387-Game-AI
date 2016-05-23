package behaviorTree;

import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.agents.controllers.BehaviorAgent;
import ch.idsia.benchmark.mario.engine.sprites.Mario;

public class ForwardAction implements Task {
	public boolean run(BehaviorAgent b) {
		b.rightKey();
		
		System.out.println("Forward");
		return true;
	}
}
