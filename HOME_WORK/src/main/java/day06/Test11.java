package day06;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * 编写一个程序，将当前目录下所有员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入集合。然后排序该集合，按照员工的年龄排序，年龄大的靠前，年龄小
 * 的靠后。排序完毕后输出结果。
 * @author Xiloer
 *
 */
public class Test11 {
	public static void main(String[] args) throws IOException, ParseException {
		List<Emp> emps=new ArrayList<Emp>();
		File[] files=new File(".").listFiles(f->f.getName().endsWith(".emp"));
		for(File f:files){
			FileInputStream fis=new FileInputStream(f);
			byte[] data=new byte[200];
			fis.read(data);
			String str=new String(data).trim();
			String[] strs=str.split(",");
			String name=strs[0];
			int age=Integer.parseInt(strs[1]);
			String gender=strs[2];
			int salary=Integer.parseInt(strs[3]);
			Date date=new SimpleDateFormat("yyyy-MM-dd").parse(strs[4]);
			emps.add(new Emp(name,age,gender,salary,date));
		}
		Collections.sort(emps,(e2,e1)->e1.getAge()-e2.getAge());
		System.out.println(emps);
	}
}
