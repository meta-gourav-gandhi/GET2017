package metacube.menudriven;


public class Exit implements Action {

	@Override
	public void performAction() {
		System.exit(0);
		
	}

}
