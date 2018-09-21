import java.util.UUID;

/**
 * @author Josh Ralph <josh.l.ralph@gmail.com>
 *
 */
public interface StaticMethodInInterface {

	/** 
	 * Example of a static method in an Interface. 
	 *   
	 * @return a String representation of a random UUID
	 */
	static public String getUUID() {
		return UUID.randomUUID().toString();
	}
	
	/**
	 * @return String containing the username
	 */
	public String getUserName();

}
