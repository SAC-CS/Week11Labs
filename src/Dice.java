
public class Dice {
	
private int Value, average;



public void Throw(){
	Value = 1 + (int) (Math.random() * 6);
	}

public void Throw(int bounces){
	int X = 0;
	int Total = 0;
	
	for (int Y=0; Y <= bounces; Y++){
	X = 1 + (int) (Math.random() * 6);
	
	Total = Total + X;
	}
	average = Total/bounces;
	Value = Total;
}

public int getAverage(){
	return average;
}

public int Value(){
		return Value;
	}
}
