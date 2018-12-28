package day10;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Properties;

/**
 * 将聊天室客户端今天写的内容独立完成一次，
 * 完成后，修改代码，使聊天室可以实现用户
 * 随意在控制台输入内容并发送给服务端。
 * 
 * 在构造方法中初始化Socket时，服务端的地址与端口通过读取当前包中的config.txt
 * 文件的两行内容得到，并依读取到的值初始化Socket。
 * @author Xiloer
 *
 */
public class Client {
	private Socket socket;
	InputStream in=this.getClass().getClassLoader().getResourceAsStream("day10/config.txt");
	Properties prop=new Properties();
	public Client(){
		try {
			prop.load(in);
			System.out.println("正在连接服务器>>>>>");
			int port=Integer.parseInt(prop.getProperty("serverPort"));
			String ip=prop.getProperty("serverHost");
			System.out.println(ip);
			System.out.println(port);
			socket=new Socket(ip,port);
			System.out.println("服务器已连接");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Client client=new Client();
		
	}
}
