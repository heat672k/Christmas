public abstract class FactoryProduct {
	
	private String Name;

	public void setName(String Name) {
		this.Name = Name;
	}
	
	public abstract void prepare();

}