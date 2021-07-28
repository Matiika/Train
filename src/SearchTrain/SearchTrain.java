package SearchTrain;
import java.util.List;

import Train.Train;


public class SearchTrain {
	public static Train searchTrainByNumber(List<Train> train, int number) {
		Train trainNumber = new Train();
		for(int i = 0; i < train.size(); i++) {
			if(train.get(i).getNumber() == number) {
				trainNumber = train.get(i);
				System.out.println(trainNumber.getNumber()+" "+trainNumber.getDestination()+" "+
						trainNumber.getTime());
			}
		}
		
		
		return trainNumber;
	}
}
