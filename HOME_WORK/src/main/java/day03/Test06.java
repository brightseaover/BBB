package day03;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 * @author Xiloer
 *
 */
public class Test06 {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("one");
		l.add("two");
		l.add("three");
		System.out.println(l.size());
		System.out.println(l.contains("four"));
		System.out.println(l.isEmpty());
		l.clear();
		System.out.println(l.size());
		System.out.println(l.isEmpty());
	}
}
