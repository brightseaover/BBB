package day07;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 要求用户控制台输入想输入的员工人数（至少5个），然后依序输入员工信息，每行为
 * 一条员工信息，格式如:张三,25,男,5000,2006-3-18
 * 然后将该对象写入到文件<name>.obj并保存到当前项目根目录中，例如:张三.obj。
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) throws NumberFormatException, ParseException, IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入员工人数（至少5个）：");
		int num=Integer.parseInt(sc.nextLine());
		for(int i=0;i<num;i++){
			System.out.println("请输入员工信息：");
			String str=sc.nextLine();
			String[] s=str.split(",");
			Emp emp=new Emp(s[0],Integer.parseInt(s[1]),s[2],Integer.parseInt(s[3]),new SimpleDateFormat("yyyy-MM-dd").parse(s[4]));
			FileOutputStream fos=new FileOutputStream(new File(s[0]+".obj"));
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(emp);
		}
	}
}
