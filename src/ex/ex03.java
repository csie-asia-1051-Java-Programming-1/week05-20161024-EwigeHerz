package ex;
import java.util.*;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 105021027 陳宴湘
 */

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sum = 0;
    for(int i =1;i<=n;i++){
    	sum+=i*2;
    }
    	System.out.print(sum);
	}

}
