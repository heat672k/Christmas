public class Christmas {

	private static Christmas instance;
	
	private Christmas() {
		// TODO Auto-generated constructor stub
	}

	public static Christmas getInstance() {
		
		if(instance == null) {
			instance = new Christmas();
		}
		
		return instance;
	}
	
	public void postMessage(String message) {

		System.out.println("Posting a message" + message);

		
	}
	
}