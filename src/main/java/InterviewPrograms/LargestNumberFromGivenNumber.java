package InterviewPrograms;

public class LargestNumberFromGivenNumber {
	public static void main(String args[]) {
	int number=155;
	int digit=4;
	System.out.println("Number less than "+number+" which doesnot have "+digit+" is "+numberLessThan(number,digit));
	}
	
	
	static int numberLessThan(int number,int digit) {
		char d=Integer.toString(digit).charAt(0);
		for(int i=number-1;i>=0;i--) {
			if(Integer.toString(i).indexOf(d)==-1) {
				return i;
			}
		}
		return -1;
	}

}
