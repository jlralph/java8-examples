import java.util.UUID;

public interface DefaultInterface {
	default public String getUUID() {
		return UUID.randomUUID().toString();
	}
}
