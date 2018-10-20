import java.util.*;

class MonkAndLuckyMinimum {
    public static void main(String args[] ) throws Exception {
        //Scanner
    	try(Scanner s = new Scanner(System.in)){
            int remainingTest = s.nextInt();
            while(remainingTest > 0){
            	long min=Long.MAX_VALUE,count=0;
            	for(int sizeOfTest = s.nextInt(); sizeOfTest > 0; sizeOfTest--){
            		long current = s.nextInt();
            		if(current<min){
            			min = current;
            			count = 1;
            		}else if (current == min){
            			count++;
            		}
            	}
            	System.out.println((count%2!=0)?"Lucky":"Unlucky");
            	remainingTest--;
            }
    	}
    }
}