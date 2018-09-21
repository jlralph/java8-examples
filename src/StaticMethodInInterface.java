import java.util.UUID;

public interface StaticMethodInInterface {

	// demonstrating a static method in an interface.
	static public String getUUID() {
		return UUID.randomUUID().toString();
	}

}
