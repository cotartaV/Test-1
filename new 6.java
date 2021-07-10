package test;

public class test {
	
	public static void main(String[] args) {

		int maxsize = 4;
		int candle1 = 2, candle2 = 3, candle3 = 4, candle4 = 4;
		int count = 0;
		
		if(candle1 >= candle2 || candle1 >= candle3 || candle1 >= candle4) {
			   count++;
			}else {
				count--;
			}
		if(candle2 >= candle1 || candle2 >= candle3 || candle2 >= candle4) {
			   count++;
			}else {
				count--;
			}
		if(candle3 >= candle1 || candle3 >= candle2 || candle3 >= candle4) {
			   count++;
			}else {
				count--;
			}
		if(candle4 >= candle1 || candle4 >= candle2 || candle4 >= candle3) {
			   count++;
			}else {
				count--;
			}
     System.out.println("Only " + count + " candles qualify");

	}

}