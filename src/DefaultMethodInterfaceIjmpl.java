/**
 * @author Josh Ralph
 * 
 * Example implementation class that implements an interface that contains a default function
 *
 */
public class DefaultMethodInterfaceIjmpl implements DefaultMethodInInterface {
	
	DefaultMethodInInterface dmi = () -> "joshr";
	
	private String getUserNameUsingLambda() {
		return dmi.getUsername();
	}
	
	/* (non-Javadoc)
	 * @see DefaultMethodInInterface#getUsername()
	 */
	@Override
	public String getUsername() {
		return getUserNameUsingLambda();
	}

}
