
public class ArmstrongNumber {
    int input_number;
    
    public ArmstrongNumber(int input) {
    	input_number = input;
    }
    
    boolean IsArmStrongNumber() {
    	int sum = 0;
    	int number = input_number;
    	int digit = 0;
    	while(number > 0)  
    	{  
    	    //finds the last digit of the given number    
    	    digit = number % 10;  
    	    //adds last digit to the variable sum  
    	    sum = sum + (digit*digit*digit);  
    	    //removes the last digit from the number  
    	    number = number / 10;  
    	}
    	if (sum == input_number) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}
