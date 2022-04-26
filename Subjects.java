
public class Subjects {
    int SubA;
    int SubB;
    int SubC;
    
    public Subjects(int Amarks,int Bmarks,int Cmarks) {
    	SubA = Amarks;
    	SubB = Bmarks;
    	SubC = Cmarks;
    }
    
    int GetTotalMarks() {
    	return (SubA+SubB+SubC);
    }
    
    int GetAvgmarks() {
    	return (SubA+SubB+SubC)/3;
    }
}
