package day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) {
		String str = "大家好！";
		StringBuilder b = new StringBuilder(str);
		
		b.append("，我是程序员！");
		str = b.toString();
		System.out.println(str);
		
		int num  = str.indexOf("程");
		b.insert(num, "优秀的");
		str = b.toString();
		System.out.println(str);
		
		b.replace(num, num+2, "牛牛");
		str = b.toString();
		System.out.println(str);
		
		int  a = str.indexOf("，")+1;
		b.delete(0, a); 
		str = b.toString();
		System.out.println(str);
	
	}
}
