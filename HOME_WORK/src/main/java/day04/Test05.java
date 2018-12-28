package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 * @author Xiloer
 *
 */
public class Test05 {
	public static void main(String[] args) {
		List list=new ArrayList();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		Integer[] iar=(Integer[]) list.toArray(new Integer[list.size()]);
		System.out.println(Arrays.toString(iar));
	}
}
