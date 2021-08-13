package eg1;

import java.io.Serializable;

public class Bus implements Comparable<Bus>, Serializable {
	private int id;
	private String Providername;
	private double cost;
	private float rating;
	
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
    public Bus(int id, String providername, double cost, float rating) {
		super();
		this.id = id;
		Providername = providername;
		this.cost = cost;
		this.rating = rating;
	}
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvidername() {
		return Providername;
	}
	public void setProvidername(String providername) {
		Providername = providername;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Bus [id=" + id + ", Providername=" + Providername + ", cost=" + cost + ", rating=" + rating + "]";
	}
	@Override
	public int compareTo(Bus arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
