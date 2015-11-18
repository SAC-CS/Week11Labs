public class Dice {
private int Value, average;
public Dice(){
}

private static int OneThrow;
public static int OneThrow(){
OneThrow = 1 + (int) (Math.random() * 6);
return OneThrow;
}

public int getDice(){
return Value;
}

public void Throw(int bounces, int dices){
int X = 0;
int Total = 0;
for (int A=1; A <= dices; A++) {
for (int Y=1; Y <= bounces; Y++){
X = 1 + (int) (Math.random() * 6);
Total = Total + X;
}
average = Total/bounces;
Value = Total;
}
}

/* public void Throw(int bounces){
int X = 0;
int Total = 0;
for (int Y=0; Y <= bounces; Y++){
X = 1 + (int) (Math.random() * 6);
Total = Total + X;
}
average = Total/bounces;
Value = Total;
} */

public Dice (int bounces, int dices){
int total = 0, sum = 0;
Dice Roll = new Dice();
for (int i = 0; i <= bounces; i++){
Roll.Throw(bounces, dices);
total = Roll.Value();
sum = sum + total;
}
average = sum/bounces;
Value = total;
}

public int Value(){
		return Value;
	}
}

//Please consider a private int to keep track of the numer of times Dice method is called
