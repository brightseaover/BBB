package day11;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * 将聊天室服务端内容独立完成一次
 * 下面内容可以选做:
 * 配合客户端实现支持昵称与私聊功能
 * @author Xiloer
 *
 */
public class Server {
	private ServerSocket server;
	public Server(){
		System.out.println("等待连接");
		try {
			server=new ServerSocket(8088);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("一个客户端已连接");
	}
	public static void main(String[] args) {
		Server s=new Server();
	}
}
