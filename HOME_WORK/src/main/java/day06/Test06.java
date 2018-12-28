package day06;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Xiloer
 *
 */
public class Test06 {
	static List list=new ArrayList();
	public static void main(String[] args) {
		list=getnames(new File("."));
		System.out.println(list);
	}
	public static List<String> getnames(File file){
		
		File[] files=file.listFiles();
		for(File f:files){
			if(!f.isDirectory()){
				String name=f.getName();
				list.add(name);
			}else{
				getnames(f);
			}
		}
		return list;
	}
}
