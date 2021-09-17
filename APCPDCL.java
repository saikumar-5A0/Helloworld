package handsonprojects;


	import java.util.Scanner;

	public class APCPDCL {
		public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println(" ******* Welcome to APSPDCL ******* ");
		System.out.println(" # Enter the no of units # : ");
		int num=scan.nextInt();
		int payableAmount;
		
				if(num>100 && num<150) {
					payableAmount= num*2;
					System.out.println("The bill for your "+(num)+" consumption units  is : " + payableAmount);
			}
				else if(num>=150 && (num<200)) {
					payableAmount=num*3;
					System.out.println("The  bill for your " +(num)+" consumption units is : " + payableAmount  );
				}
				else if(num<=100 && (num!=0)){
					System.out.println("No need to pay its totally free");
					
				}
				else {
					System.out.println("No consumption");
				}

	}
	}

