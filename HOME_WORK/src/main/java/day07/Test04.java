package day07;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 读取当前项目根目录下所有后缀为.obj的文件，将这些Emp对象读取出来
 * 并存入到一个List集合中，然后按照员工工资从多到少的顺序依次输出员工信息
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File[] files=new File(".").listFiles(q->q.getName().endsWith(".obj"));
		List<Emp> list=new ArrayList<Emp>();
		
		for(File f:files){
			FileInputStream fis=new FileInputStream(f);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Emp e=(Emp) ois.readObject();
			list.add(e);
		}
		Collections.sort(list,(e1,e2)->e2.getSalary()-e1.getSalary());
		for(Emp e:list){
			System.out.println(e.toString());
		}
	}
}
