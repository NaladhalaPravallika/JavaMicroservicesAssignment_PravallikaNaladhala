
public class TaxCalculator {
	
	long income;
	
	public TaxCalculator(long my_income) {
		income = my_income;
	}
	long CalculateTax() {
		long tax;
		if (income < 180000) {
			tax = 0;
		}
		else if ((income > 180000) && (income < 300000)) {
			tax = (income/100)*10;
		}
        else if ((income > 300000) && (income < 500000)) {
        	tax = (income/100)*20;
		}
        else if ((income > 500000) && (income < 1000000)) {
        	tax = (income/100)*30;
		}
        else {
        	tax = 0;
        }
		return tax;
		
	}

}
