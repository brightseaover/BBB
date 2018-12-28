package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 * @author Xiloer
 *
 */
public class Test07 {
	public static void main(String[] args) {
		List list=new ArrayList();
		Random ran=new Random();
		for(int i=0;i<10;i++){
			list.add(ran.nextInt(1000));
		}
		Collections.sort(list);
		System.out.println(list);
	}
}
