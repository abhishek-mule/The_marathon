import java.util.Scanner;

public class CompositeCheck {
        public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
           System.out.println("Enter the Number: ");
	   int n = sc.nextInt();
	   boolean isComposite= false;

		for(int i=2; i<=n-1; i++){
	         if(n % i ==0){
		    isComposite = true;
		    break;
		 }
		
		}
	
		System.out.println((isComposite && n>1) ? "It is composite !" : "it is not composite!");
	}


}
