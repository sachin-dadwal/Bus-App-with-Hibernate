package dto;

public class Bus 
{
	private int busid;
	private String busname;
	private String source;
	private String destination;
	private double fare;
	public int getBusid() {
		return busid;
	}
	public void setBusid(int busid) {
		this.busid = busid;
	}
	public String getBusname() {
		return busname;
	}
	public void setBusname(String busname) {
		this.busname = busname;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getFare() {
		return fare;
	}
	@Override
	public String toString() {
		return "Bus [busid=" + busid + ", busname=" + busname + ", source="
				+ source + ", destination=" + destination + ", fare=" + fare
				+ "]";
	}
	public void setFare(double fare) {
		this.fare = fare;
		
	}

}
