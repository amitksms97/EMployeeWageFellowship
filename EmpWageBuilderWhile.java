public class EmpWageBuilderWhile {
		//Constants
		public static final int IS_PART_TIME=1;
		public static final int IS_FULL_TIME=2;
		public static final int EMP_RATE_PER_HOUR=20;
		public static final int NUM_OF_WORKING_DAYS=20;
		public static final int MAX_HRS_IN_MONTH=100;
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Problem");
		//Variables
		int empHrs=0, empWage=0, totalEmpWage=0, totalEmpHrs=0, totalWorkingDays=0;
		//Conputation
		while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS){
			int empCheck= (int) Math.floor(Math.random()*10)%3;
			totalWorkingDays++;
			switch(empCheck){
				case IS_FULL_TIME:
					empHrs=8;
					break;
				case IS_PART_TIME:
					empHrs=4;
					break;
				default :
					empHrs=0;
}
			empWage=empHrs*EMP_RATE_PER_HOUR;
			totalEmpWage+=empWage;
			totalEmpHrs+=empHrs;
			System.out.println("Emp Wage: "+empWage);
}
		System.out.println("Total Employee Wage: "+totalEmpWage);
}
}
