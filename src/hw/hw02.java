package hw;
import java.util.*;
 //*���ϥΪ̿�J�@�����n�A��X1+2+3+�K+m<=n���̤j���m=?



public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m =0;
    int sum = 0;
    for(int i =1;sum<=n;i++){
    	sum+=i;
           m++;  
    	}
   System.out.print(m-1);
	
	}

}
