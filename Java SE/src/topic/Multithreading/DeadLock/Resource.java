package topic.Multithreading.DeadLock;

public class Resource {
	private String resource;

	public Resource(String resource) {
		this.resource = resource;

	}

	public String getName() {
		return resource;
	}

}
