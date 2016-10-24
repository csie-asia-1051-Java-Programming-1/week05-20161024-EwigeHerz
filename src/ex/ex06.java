package ex;
import java.util.*;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021027 陳宴湘
 */

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int data[] ={105021027,105079013,105097010,105012010,105034015};
        for(int i =0;i<5;i++){
        	 for(int j =i+1;j<5;j++){
        		if(data[i] < data[j]){
        			int a= data[j];
        			data[j]=data[i];
        			data[i]= a;
        		}
        	 }
        	 System.out.print(data[i]+" ");	     
        }
        
        
        
	}

}
