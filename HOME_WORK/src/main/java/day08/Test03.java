package day08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 使用异常捕获机制完成下述读取操作。
 * 使用缓冲流读取note.txt文件，并将每行字符串输出到控制台上
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileInputStream fis=new FileInputStream("note.txt");
			InputStreamReader isr=new InputStreamReader(fis,"gbk");
			br=new BufferedReader(isr);
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
