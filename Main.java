
public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello world");
		// Code for Question 1 & 2
		ArmstrongNumber a = new ArmstrongNumber(143);
		if(a.IsArmStrongNumber()) {
			System.out.println("Given number is Armstrong number");
		}
		else {
			System.out.println("Given number is not Armstrong number");
		}
		
		for (int i = 100; i <= 999; i++) {
			ArmstrongNumber a1 = new ArmstrongNumber(i);
			if(a1.IsArmStrongNumber()) {
				System.out.println("Given number " + i + " is Armstrong number");
			}
			else {
				System.out.println("Given number " + i + " is not Armstrong number");
			}
		}
		  // End of Question 1 & 2
		
		// Code for Question 3
		SimpleCompoundIntrest s = new SimpleCompoundIntrest(10000,10,2);
		System.out.println("Simple intrest = " + s.GetSimpleIntrest());
		System.out.println("Compound intrest = " + s.GetCompoundIntrest(1));
		 //End of Question 3
		
		 //Code for Question 4
		MarksData md = new MarksData(79,80,61);
		System.out.println("Result = " + md.GetResult());
		 // End of Question 4
		
		 //Code for Question 5
		TaxCalculator tc = new TaxCalculator(550000);
		long tax = tc.CalculateTax();
		System.out.println("Tax = " + tax);
		 // End of Question 5
		
		//Code for Question 6
		CLIUserIdPassword cli = new CLIUserIdPassword("Pravallika","Pravallika");
		cli.ValidateCredentials();
		 //End of Question 6
		
		//Code for Question 7
		int[] array = new int[15];
		array[0] = 5;
		array[1] = 12;
		array[2] = 14;
		array[3] = 6;
		array[4] = 78;
		array[5] = 19;
		array[6] = 1;
		array[7] = 23;
		array[8] = 26;
		array[9] = 35;
		array[10] = 37;
		array[11] = 7;
		array[12] = 52;
		array[13] = 86;
		array[14] = 47;
		int number = 19;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				System.out.println("Given number " + number + " present at index " + (i));
				break;
			}
		}
	 //End of Question 7
		
		
		//Code for Question 8
		BubbleSort ob = new BubbleSort();
        int arr[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47, 19 };
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
         //End of Question 8
		
        
        //code for Qestion 9
		Subjects student1 = new Subjects(35,40,45);
		Subjects student2 = new Subjects(35,35,45);
		Subjects student3 = new Subjects(25,40,45);
		System.out.println("Student1 Total marks = " + student1.GetTotalMarks() + " Average = " + student1.GetAvgmarks());
		System.out.println("Student2 Total marks = " + student2.GetTotalMarks() + " Average = " + student2.GetAvgmarks());
		System.out.println("Student3 Total marks = " + student3.GetTotalMarks() + " Average = " + student3.GetAvgmarks());
		//End of Question 9
		}
	

}
