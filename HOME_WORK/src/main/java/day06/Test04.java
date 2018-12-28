package day06;

import java.io.File;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args) {
		printname(new File("."));
	}
	public static void printname(File file){
		File[] files=file.listFiles();
		for(File f:files){
			System.out.println(f.getName());
			if(f.isDirectory()){
				printname(f);
			}
		}
	}
}
