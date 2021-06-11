package introduction;
import java.util.Scanner;

public class employee {

	public static void main(String args[]) {
		float monthlySalary=1;
		float annualSalary;
		annualSalary= monthlySalary*12;
		  double increment;
		  try (Scanner in = new Scanner(System.in)) {
			  System.out.print("Enter Your Monthly Salary:");
			 monthlySalary =in.nextFloat();
			
			}
		  if (monthlySalary <100000)

		  {annualSalary= monthlySalary*12;
		   increment=(15 * annualSalary)/100;
		   System.out.println("\nPercentage increment is: " + increment + "\n");
		  }
		  else if ((monthlySalary >=100000) && (monthlySalary <=200000))
		  {annualSalary= monthlySalary*12;
			  increment=(10*annualSalary)/100;
		   System.out.println("\nPercentage increment is: " + increment + "\n");
		  }
		  else if (monthlySalary >=200000)
		  {annualSalary= monthlySalary*12;
			  increment=(5*annualSalary)/100;
		   System.out.println("\nPercentage increment is: " + increment + "\n");
		  }
		  else
		  System.out.println("\nNo More Increment For This Salary\n");

	}

}
