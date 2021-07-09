
public class uc {
public static void main(String[] args) {
int flipcoin=20;
 int heads=0;
 int tails=0;
for (int i =0 ; i< 20;i++ ) {
	if(Math.random()>0.5) {
heads++;
tails++;
	double percentageofheads =(heads *100)/ flipcoin;
	double percentageoftails=(tails +100)/ flipcoin;
System.out.println("heads:"+ percentageofheads);
	System.out.println("tails:"+ percentageoftails);
}
}
}
}