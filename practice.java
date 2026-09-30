import java.util.Scanner;

public class practice {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
        
	int reversed = 0;
	int temp = Math.abs(n);

 	while(temp >0){
	  int last = temp % 10;//3
	  reversed = reversed* 10 + last ;
          temp /= 10; //12

	}

	System.out.println(reversed);
    
    }


}
