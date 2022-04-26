
public class SimpleCompoundIntrest {
	double principal;
	double rate;
	double time_years;
	
	public SimpleCompoundIntrest(double prip_val,double int_rate,double time_yrs) {
		principal = prip_val;
		rate = int_rate;
		time_years = time_yrs;
	}
	
	public double GetSimpleIntrest( ) {
		double interest = (principal * time_years * rate) / 100;
		return interest;
	}
	
    public double GetCompoundIntrest(int compound_count ) {
    	double interest = principal * (Math.pow((1 + rate/100), (time_years * compound_count))) - principal;
    	return interest;
    }

}
