package cn.demo.WebdemoIn7.application;
/**
 * 测试java项目 in server 172.150.15.7
 * 本地使用git钩子检测 findbugs插件
 * gogs上自动推送
 * jenkins也检测然后自动部署到Docker容器中
 * @author Administrator
 *
 */

public class WebMain 
{
	//int a = 0;
	/**
	 *主方法
	 *@param args 接收用户运行时输入的参数
	 */
	public static void main(String[] args) 
	{
		System.out.println("************WebMain()************");
	}
	
	/**
	 *示例方法
	 *
	 */
	public void hello()
	{
		System.out.println("This method in webdemo.");
	}

}
