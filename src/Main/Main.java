package Main;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Train.Train;
import TrainSort.TrainSort;
import TrainStation.TrainStation;
import View.View;
import SearchTrain.SearchTrain;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrainStation trainStation = new TrainStation();
		View view = new View();
		
		List<Train> trainStation1 = new ArrayList<Train>();
		
		trainStation.add(new Train(3, "�����", LocalTime.parse( "19:40" )));
		trainStation.add(new Train(6, "������", LocalTime.parse( "15:00" )));
		trainStation.add(new Train(4, "�����", LocalTime.parse( "10:20" )));
		trainStation.add(new Train(8, "������", LocalTime.parse( "17:00" )));
		trainStation.add(new Train(1, "�����", LocalTime.parse( "12:00" )));
		
		view.trainView(trainStation);
		
		trainStation1.add(new Train(3, "�����", LocalTime.parse( "19:40" )));
		trainStation1.add(new Train(6, "������", LocalTime.parse( "15:00" )));
		trainStation1.add(new Train(4, "�����", LocalTime.parse( "10:20" )));
		trainStation1.add(new Train(8, "������", LocalTime.parse( "15:00" )));
		trainStation1.add(new Train(1, "�����", LocalTime.parse( "12:00" )));
		
		TrainSort trainSort = new TrainSort();
		
		System.out.println("���������� �� ������: ");
		trainSort.sortTrainByNumber(trainStation.getTrains());
		view.trainView(trainStation);
		
		System.out.println("���������� �� ����� ���������� � �������: ");
		trainSort.sortTrain(trainStation.getTrains());
		view.trainView(trainStation);
		
		System.out.println("����� �� ������: ");
		SearchTrain.searchTrainByNumber(trainStation.getTrains(), 1);
		
//		for (Train s : trainStation1) {
//	        System.out.println(s.getNumber()+" "+s.getDestination()+" "+s.getTime());
//	    }
		
		
		
		
	}

}
