package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) throws IOException {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入文件名：");
		String str=sc.nextLine();
		String[] strs=new File(".").list();
		File file=new File(str);
		if(!file.exists()){
			file.createNewFile();
			System.out.println("文件已创建");
		}else{
			System.out.println("文件已存在");
			int x;
			if(str.contains("副本")){
				x=Integer.parseInt(str.substring(str.indexOf("本")+1,str.indexOf(".")));
			}else{
				x=1;
				str=str.substring(0,str.indexOf("."))+"_副本1"+str.substring(str.indexOf("."));
			}
			str=check(str,strs,x);
			System.out.println(str);
			new File(str).createNewFile();
			System.out.println("副本已创建");
		}
	}
	public static String check(String str,String[] names,int a){
		for(int i=0;i<names.length;i++){
			if(str.equals(names[i])){
				a++;
				str=str.substring(0,str.indexOf("本")+(a+"").length())+a+str.substring(str.indexOf("."));
				//System.out.println(str);
				check(str,names,a);
			}
		}
		return str;
	}
}
