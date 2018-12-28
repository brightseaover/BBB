package day08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * 使用异常捕获机制完成下述读取操作，并在finally中有关闭RandomAccessFile操作。
 * 将emp.dat文件中所有员工解析出来，并创建为若干Emp实例存入一个
 * 集合，然后按照员工入职从晚到早的顺序依次输出员工信息。
 * 
 * 该文件560字节，每56个字节为一个员工的信息。
 * 其中:
 * 	 name为字符串，长度为32个字节，编码为:UTF-8
 *   age为short,长度为2个字节
 * 	 gender为字符串，长度为10个字节，编码为:UTF-8
 * 	 salary为int,长度为4个字节
 * 	 hiredate为long，长度为8个字节
 * 格式可参考当前包中emp.jpg图
 * @author Xiloer
 *
 */
public class Test05 {
	public static void main(String[] args) {
		List <Emp>list=new ArrayList<Emp>();
		RandomAccessFile raf=null;
		try {
			File file=new File(Test04.class.getClassLoader().getResource("day08/emp.dat").toURI());
			raf=new RandomAccessFile(file, "r");
			for(int i=0;i<raf.length()/56;i++){
				//raf.seek(i*56);
				byte[] data=new byte[32];
				raf.read(data);
				String name=new String(data,"utf-8").trim();
				int age=raf.readShort();
				data=new byte[10];
				raf.read(data);
				String gender=new String(data,"utf-8").trim();
				int salary=raf.readInt();
				long dates=raf.readLong();
				Date date=new Date();
				date.setTime(dates);
				list.add(new Emp(name,age,gender,salary,date));
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Collections.sort(list,(e1,e2)->e1.getHiredate().compareTo(e2.getHiredate()));
		for(Emp e:list){
			System.out.println(e);
		}
	
	}
}
