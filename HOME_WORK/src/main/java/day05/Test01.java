package day05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 创建一个队列，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Queue <Integer> queue=new LinkedList();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		//Iterator it=queue.iterator();
		while(queue.size()>0){
			Integer i=queue.poll();
			System.out.println(i);
		}
	}
}
