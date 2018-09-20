import java.util.UUID;

public interface DefaultInterface {
	
	// just demonstrating a default method in an interface.
	default public String getUUID() {
		return UUID.randomUUID().toString();
	}
}
