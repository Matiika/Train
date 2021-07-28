package View;

import Train.Train;
import TrainStation.TrainStation;

public class View {
	
	public void trainView(TrainStation trainStation) {
		for (Train s : trainStation.getTrains()) {
	        System.out.println(s.getNumber()+" "+s.getDestination()+" "+s.getTime());
	    }
	}

}
