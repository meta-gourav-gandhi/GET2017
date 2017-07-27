package metacube.menudriven;


public class ActionableMenuItem extends MenuItem{
	
	Action action;

	
	public void triggerAction(){
		this.action.performAction();
	}

	public ActionableMenuItem(Action action) {
		
		this.action = action;
	}


}
