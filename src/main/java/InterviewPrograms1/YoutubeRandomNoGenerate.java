package InterviewPrograms1;

import java.util.Random;

public class YoutubeRandomNoGenerate {

	public static void main(String[] args) {
		int num=1000;
		System.out.println(generateRandom1(num));
		System.out.println(generateRandom2(200,400));
	}

	static int generateRandom1(int num) {
		Random rand =new Random();
		return rand.nextInt(num);
	}
	
	
	static double generateRandom2(int min,int max) {
		return Math.random()*(max-min+1)+min;
	}
	
}
