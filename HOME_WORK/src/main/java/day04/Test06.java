package day04;

import java.util.Arrays;
import java.util.List;

/**
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 * @author Xiloer
 *
 */
public class Test06 {
	public static void main(String[] args) {
		String[] str={"one","two","three"};
		List list=Arrays.asList(str);
		System.out.println(list);
	}
}
