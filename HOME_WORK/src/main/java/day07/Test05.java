package day07;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URISyntaxException;

/**
 * 使用字符流复制当前程序的源文件到当前项目根目录下。
 * @author Xiloer
 *
 */
public class Test05 {
	public static void main(String[] args) throws URISyntaxException, IOException {
		File file=new File("src/main/java/day07/Test05.java");
		FileInputStream fis=new FileInputStream(file);
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		BufferedReader br=new BufferedReader(isr);
		
		FileOutputStream fos=new FileOutputStream(new File("Test05.txt"));
		OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
		BufferedWriter bw=new BufferedWriter(osw);
		PrintWriter pw=new PrintWriter(bw);
		
		String line=null;
		while((line=br.readLine())!=null){
			pw.write(line);
		}
		System.out.println("Copy Over");
		bw.close();
		br.close();
	}
}
