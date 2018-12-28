package day10;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.util.Properties;

/**
 * 将聊天室服务端今天写的内容独立完成一次，
 * 完成后，修改代码，使得服务端可以一直读取
 * 客户端发送过来的每一条消息并输出到控制台。
 * 
 * 初始化服务端时，读取当前包中server-config.txt文件的第一行，用该端口进行
 * ServerSocket的初始化。
 * @author Xiloer
 *
 */
public class Server {
	private ServerSocket socket;
	InputStream in=Server.class.getClassLoader().getResourceAsStream("day10/server-config.txt");
	Properties prop=new Properties();
	public Server() throws IOException{
		System.out.println("正在等待连接<<<<<");
		prop.load(in);
		System.out.println(prop.getProperty("serverPort"));
		socket=new ServerSocket(Integer.parseInt(prop.getProperty("serverPort")));
		System.out.println("一个客户端已连接");
	}
	public static void main(String[] args) throws IOException {
		Server server=new Server();
		//server.start();
	}
	private void start() {
		
		
	}
}
