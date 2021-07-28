package Train;

import java.time.LocalTime;

public class Train implements Comparable<Train>{
	private int number; 
	private String destination;
	private LocalTime time;
	
	public Train(int number, String destination, LocalTime time) {
		super();
		this.number = number;
		this.destination = destination;
		this.time = time;
	}

	public Train() {
		// TODO Auto-generated constructor stub
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + number;
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (number != other.number)
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train [number=" + number + ", destination=" + destination + ", time=" + time + "]";
	}

	@Override
	public int compareTo(Train o) {
		int compare = destination.compareTo(o.destination);
		if (compare == 0) {
			compare = time.compareTo(o.time);
		}
		return compare;
	}
	
	
	
	

}
