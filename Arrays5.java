package testSample;

public class Arrays5 {
	private static int hour;
	private static int minute;
	private static int second;

	public static void main(int h, int m, int s) {
	hour = ((h>0 && h<24) ? h:0);	
	minute = ((m>0 && m<60) ? m:0);	
	second = ((s>0 && s<60) ? s:0);	
	

	}
public String military(){
	return String.format("%02d:%02d:%02d",hour,minute,second);
}
}
