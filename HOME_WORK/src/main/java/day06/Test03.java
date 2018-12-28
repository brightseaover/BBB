package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入文件夹名：");
		String str=sc.nextLine();
		File file=new File(str);
		if(!file.exists()){
			file.mkdir();
		}else{
			int i=0;
			do{
				i++;
				if(!str.contains("副本")){
					str=str+"_副本"+i;
				}else{
					str=str.substring(0, str.indexOf("本")+1)+i;
				}
		
				file=new File(str);
			}while(file.exists());
			System.out.println(str);
			new File(str).mkdir();
		}
	}
}
