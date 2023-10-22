package InterviewPrograms5;

public class BLR_0005 {

	public static void main(String[] args) {
    int size=5;
    for(int i=1;i<=size;i++) {
    	for(int j=size-i;j>0;j--) {
    		System.out.print(" ");
    	}
    	for(int k=1;k<=i;k++) {
    		System.out.print("* ");
    	}
    	System.out.println();
    }

	}

}
