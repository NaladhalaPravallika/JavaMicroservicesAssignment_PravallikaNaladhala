
public class MarksData {
	int Subject1;
	int Subject2;
	int Subject3;
	
	public MarksData(int sub1,int sub2,int sub3 ) {
		Subject1 = sub1;
		Subject2 = sub2;
		Subject3 = sub3;
	}
    
	public String GetResult() {
		if ((Subject1 > 60) && (Subject2 > 60) && (Subject3 > 60)) {
			return "Passed";
		}
		else if ((Subject1 > 60) && (Subject2 > 60) && (Subject3 <= 60)) {
			return "Promoted";
		}
		else if ((Subject1 > 60) && (Subject2 <= 60) && (Subject3 > 60)) {
			return "Promoted";
		}
		else if ((Subject1 <= 60) && (Subject2 > 60) && (Subject3 > 60)) {
			return "Promoted";
		}
		else if ((Subject1 <= 60) && (Subject2 <= 60) && (Subject3 > 60)) {
			return "Failed";
		}
		else if ((Subject1 <= 60) && (Subject2 > 60) && (Subject3 <= 60)) {
			return "Failed";
		}
		else if ((Subject1 > 60) && (Subject2 <= 60) && (Subject3 <= 60)) {
			return "Failed";
		}
		else {
			return "Failed";
		}
		
	}
}
