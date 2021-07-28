package TrainSort;

import java.time.LocalTime;
import java.util.Collections;

import java.util.List;

import Train.Train;
import TrainStation.TrainStation;

public class TrainSort {
	
	public void sortTrainByNumber(List<Train> train) {
		int min, k;
		for(int i = 0; i < train.size(); i++) {
			k = i;
			min = train.get(i).getNumber();
			for(int j = i; j < train.size(); j++) {
				if (train.get(j).getNumber() < min) {
					min = train.get(j).getNumber();
					k = j;
				}
			}
			Collections.swap(train, i, k);
		}	
	}
	
public void sortTrain(List<Train> train) {
		LocalTime time;
		int k;
		for(int i = 0; i < train.size(); i++) {
			k = i;
			time = train.get(i).getTime();
			for(int j = i; j < train.size(); j++) {
				if (train.get(j).getTime().compareTo(time)<0) {
					time = train.get(j).getTime();
					k = j;
				}
			}
			Collections.swap(train, i, k);
		}
		

		for(int i = train.size() - 1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				if (train.get(j).getDestination().compareTo(train.get(j + 1).getDestination()) > 0) {
					Collections.swap(train, j, j + 1);
				}
			}
		}		
	}	

}
