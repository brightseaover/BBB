package day08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 使用异常捕获机制完成下述读取操作
 * 读取emp.txt文件，并将每个员工信息读取出来，以一个Emp实例保存，然后将
 * 这些Emp实例存入到一个Map集合中。其中key为字符串，是该员工名字，而value
 * 是该Emp实例。
 * 存入后，要求用户输入一个员工的名字,如:张三
 * 若该员工存在则输出该员工所有信息(Emp的toString方法返回的字符串)
 * 输入的员工名若是英文，不要求区分大小写。
 * 若输入的员工名字不存在，则显示"查无此人"
 * 
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Map<String,Emp> mp=new HashMap<String, Emp>();
		BufferedReader br = null;
		try {
			File file=new File(Test04.class.getClassLoader().getResource("day08/emp.txt").toURI());
			FileInputStream fis=new FileInputStream(file);
			InputStreamReader isr=new InputStreamReader(fis,"utf-8");
			br=new BufferedReader(isr);
			String line=null;
			while((line=br.readLine())!=null){
				String s[]=line.split(",");
				String name=s[0];
				int age=Integer.parseInt(s[1]);
				String gender=s[2];
				int salary=Integer.parseInt(s[3]);
				Date date=new SimpleDateFormat("yyyy-MM-dd").parse(s[4]);
				mp.put(name, new Emp(name,age,gender,salary,date));
			}
	
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(mp);
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入员工姓名：");
		String ename=sc.nextLine();
		char[] ch=ename.toCharArray();
		if(ename.matches("[a-z A-Z]+")){
			for(int i=0;i<ch.length;i++){
				if(ch[i]<97){
					ch[i]+=32;
				}
			}
			ch[0]-=32;
			ename=new String(ch);
		}
		Emp emp=mp.get(ename);
		if(emp!=null){
			System.out.println(emp.toString());
		}else{
			System.out.println("查无此人");
		}
	}
}
