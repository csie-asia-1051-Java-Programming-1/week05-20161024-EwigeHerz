package ex;
import java.util.*;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021027 陳宴湘
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int sum = 1;
     int w=1;
     while(w<=n){
    	 sum=sum*w;
    	 
    	 w++;
     }
     System.out.print(sum);
	}

}
