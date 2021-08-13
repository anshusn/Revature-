package eg1;

public class Bus implements Comparable<Bus> {
	
	
	private int id;
	private String providername;
	private double cost;
	private float ratings;
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bus(int id, String providername, double cost, float ratings) {
		super();
		this.id = id;
		this.providername = providername;
		this.cost = cost;
		this.ratings = ratings;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvidername() {
		return providername;
	}
	public void setProvidername(String providername) {
		this.providername = providername;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	@Override
	public int compareTo(Bus o) {
		Integer i1=this.id;
		Integer i2=o.id;
		return i1.compareTo(i2 );
	}
	@Override
	public String toString() {
		return "Bus [id=" + id + ", providername=" + providername + ", cost=" + cost + ", ratings=" + ratings + "]";
	}
	
	

}
