package day06;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
 * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
 * 在该目录中继续创建若干级目录和文件。
 * @author Xiloer
 *
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入文件名或目录名：");
		String name=sc.nextLine();
		delete(new File(name));
		System.out.println("Well done");
	}
	public static void delete(File file){
			if(file.isDirectory()){
				File[] files=file.listFiles();
				for(File f:files){
					if(f.isDirectory()){
						delete(f);
					}
				}
			}
			file.delete();
	}
}