import java.util.Scanner;
public class tip{
	public static void main(String args[]){
		Scanner service=new
		Scanne(System.in);
		System.out.println("Enter the total price of meal");
		int Bill=service.nextlnt();
		System.out.println("Enter the marks for service 0 to 10");
		int marks=service.nextlnt();
		 	 if (marks<=3) {
		  			System.out.println("The total amount:"+ Bill);
		  }
		 	 if (marks>3 && marks<=7) {
		  		System.out.println("The total amount:" + Bill+0.1*Bill);
		  }
		  	if (marks>8){
		  		System.out.println("The total amount:"+ Bill+0.15*Bill);
		  	}
		  	service.close();
		  	System.out.println("thanks for your support");
	}

}
