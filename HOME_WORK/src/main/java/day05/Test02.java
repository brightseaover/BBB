package day05;


import java.util.Stack;

/**
 * 创建一个栈，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Xiloer
 *
 */
public class Test02 {
	
	public static void main(String[] args) {
		Stack <Integer> st=new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		while(!st.empty()){
			Integer s=st.pop();
			System.out.println(s);
		}
	}
}
