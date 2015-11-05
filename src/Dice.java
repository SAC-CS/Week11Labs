
public class Dice {
	
private int Value, average, W;

public Dice (int bounces){
	W = bounces;
}


public int getDice(){
	return Value;
}
public void Throw(){
	int X = 0;
	int Total = 0;
	
	for (int Y=0; Y <= W; Y++){
	X = 1 + (int) (Math.random() * 6);
	
	Total = Total + X;
	}
	average = Total/W;
	Value = Total;
}

/*
public void Throw(){
	Value = 1 + (int) (Math.random() * 6);
	}
*/

public int getAverage(){
	return average;
}

public int Value(){
		return Value;
	}
}
