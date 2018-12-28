package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Map<String,Integer> mp=new HashMap<String, Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入学生成绩（科目:成绩;科目:成绩;...）");
		String scores=sc.nextLine();
		String[] scoress=scores.split(";");
		for(int i=0;i<scoress.length;i++){
			String[] s=scoress[i].split(":");
			String subject=s[0];
			Integer score=Integer.parseInt(s[1]);
			mp.put(subject, score);
		}
		System.out.println(mp.get("物理"));
		mp.replace("化学", 96);
		mp.remove("英语");
		Set<String> sub=mp.keySet();
		for(String su:sub){
			System.out.println(su);
		}
		Collection<Integer> sco=mp.values();
		for(Integer so:sco){
			System.out.println(so);
		}
		Set<Entry<String, Integer>> en=mp.entrySet();
		for(Entry e:en){
			System.out.println(e);
		}
	}
}
