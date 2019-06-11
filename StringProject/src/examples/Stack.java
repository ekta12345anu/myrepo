package examples;

import java.net.StandardSocketOptions;
import java.util.Arrays;

public class Stack {

	private static int top=-1;
	private static  int MAX = 5;
	static int stack[] = new int[MAX];
	public static void main(String[] args) {

		push(5);
		push(2);
		push(1);
		push(5);
		push(2);
		pop();
		pop();
		push(9);
		System.out.println(stack[4]);
	}
	
	public static void push(int num){
	
		if(top==MAX){
			System.out.println("Full stack");
		}else{
			stack[++top]= num;
		}		
	}
	
	public static void pop(){
		if(top==-1){
			System.out.println("Empty stack");
		}else{
			stack[top]=0;
			top--;
		}
		
	}


}
