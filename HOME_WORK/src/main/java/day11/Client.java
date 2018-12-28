package day11;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 将聊天室客户端内容独立完成一次.
 * 下面内容可以选做:
 * 修改代码，使聊天室可以实现用户自定义昵称，
 * 以及私聊功能。
 * 
 * 参考思路:
 * 客户端连接服务端后，要求用户输入一个昵称，
 * 然后将改昵称发送给服务端，服务端那边读取到
 * 客户端发送的第一个字符串认为是昵称。
 * 
 * 私聊功能可以定义格式，例如:
 * @张三:你好
 * 服务端在读取客户端发送过来的昵称时，需要进行
 * 解析，分解出昵称与聊天内容，然后将该聊天内容
 * 单独发送给指定昵称的用户。
 * 服务端的输出流需要使用Map进行维护，而不能再
 * 使用List，Map的key可以是该用户昵称，value
 * 为该用户输出流。
 * 
 * 
 * @author Xiloer
 *
 */
public class Client {
	private Socket socket;
	public Client(){
		System.out.println("正在连接服务器");
		try {
			socket=new Socket("localhost",8088);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("已连接");
	}
	public static void main(String[] args) {
		Client c=new Client();
	}
}
