import java.util.Scanner;
class GradeCalculator 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name=sc.nextLine();
		System.out.println("You have Five subjects:Physics,Chemistry,Math,Computer,English");
        System.out.println();
		
		System.out.println("Enter the obtained marks of Physics(out of 100)");
		int phy=sc.nextInt();
		System.out.println("Enter the obtained marks of Chemistry(out of 100)");
        int che=sc.nextInt();
        System.out.println("Enter the obtained marks of Maths(out of 100)");
        int math=sc.nextInt();
        System.out.println("Enter the obtained marks of Computer(out of 100)");
        int comp=sc.nextInt();
        System.out.println("Enter the obtained marks of English(out of 100)");
        int eng=sc.nextInt();
        
        int total=0;
        total+=(phy+che+math+comp+eng);
        
        double avg=(total/5);
		System.out.println("Total Marks are:" +total);
		System.out.println("Average Percentage is:" +avg+ "%");
		
		if(avg>=90){
			System.out.println("Your grade is A");
		}
		else if(avg>=75){
			System.out.println("Your grade is B");
		}
		else if(avg>=55){
			System.out.println("Your grade is C");
		}
		else if(avg>=33){
			System.out.println("Your grade is D");
		}
		else if(avg<33){
			System.out.println("You are Failed");
		}
		else{
			System.out.println("Please check again");
		}
	}
}
	