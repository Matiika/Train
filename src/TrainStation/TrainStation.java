package TrainStation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Train.Train;

public class TrainStation {
	private List<Train> trains;
	

	public TrainStation() {
		trains = new ArrayList<Train>();
	}
	
	public void add (Train train) {
		trains.add(train);
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}
	
	public void sort() {
		Collections.sort(this.trains);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trains == null) ? 0 : trains.hashCode());
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
		TrainStation other = (TrainStation) obj;
		if (trains == null) {
			if (other.trains != null)
				return false;
		} else if (!trains.equals(other.trains))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TranStation [trains=" + trains + "]";
	}
	
	

	
	
	

}
