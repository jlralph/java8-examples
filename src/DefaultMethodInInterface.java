import java.util.UUID;

/**
 * @author Josh Ralph <josh.l.ralph@gmail.com>
 *
 */
public interface DefaultMethodInInterface {
	
	/** 
	 * Example of a default method in an Interface. 
	 *   
	 * @return a String representation of a random UUID
	 */
	default public String getUUID() {
		return UUID.randomUUID().toString();
	}
}
