/**
 * 
 */

/** 
 * Basic class to show implementation of call to underlying static method in
 * the Interface.
 * 
 * @author Josh Ralph
 *
 */
public class StaticMethodInterfaceImpl implements StaticMethodInInterface {

	/**
	 * @return String representing random generated UUID.
	 */
	public String getNextUUID() {
		return StaticMethodInInterface.getUUID();
	}
	
	/* (non-Javadoc)
	 * @see StaticMethodInInterface#getUserName()
	 */
	@Override
	public String getUserName() {
		return "joshr";
	}

}
