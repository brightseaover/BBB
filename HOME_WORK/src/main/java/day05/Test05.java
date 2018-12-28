package day05;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 有下列字符串:
 * 销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice
 * 分析上述字符串然后统计每个职位总共多少人?
 * 使用Map保存统计的结果，其中key:职位,value为该职位人数
 * 然后分别输出各职位的名称(keySet),各职位人数(entrySet)
 * @author Xiloer
 *
 */
public class Test05 {
	 public static void main(String[] args) {
		Map<String,Integer> m=new HashMap();
		String str="销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice";
		String[] strs=str.split(";");
		for(int i=0;i<strs.length;i++){
			String[] s=strs[i].split(":");
			String ss=s[0];
			if(m.containsKey(ss)){
				m.put(ss, m.get(ss)+1);
			}else{
				m.put(ss, 1);
			}
		}
		Set<Entry<String, Integer>>set=m.entrySet();
		for(Entry e:set){
			System.out.println(e);
		}
	 }
}
