package com.chinasoft.servlet.login;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CaptchaServlet")
public class CaptchaServlet extends HttpServlet {

	

	private static final long serialVersionUID = 1L;

  @Override
  protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
		throws ServletException, IOException {
	//定义验证图片大小
	BufferedImage image = new BufferedImage(80,20,BufferedImage.TYPE_INT_BGR);
	//创建一个画笔
			Graphics g = image.getGraphics();
			//创建随机数
			Random random = new Random();
			//设置随机数的字体
			g.setFont(new Font("楷体",Font.PLAIN,18));
			//给一个字符串
			String str = null;
			//把随机数拿进来进行循环
			for(int i=0;i<4;i++)
			{
				//把随机数转换成字符串
				String rand = String.valueOf(random.nextInt(10));
				str =str+rand;
				//把随机数拼接画到图片上
				g.drawString(rand, 13*i+16, 16);
			}
			//关闭画笔
			g.dispose();
			//设置共享数据
			arg0.getSession().setAttribute("str", str);
			
			ImageIO.write(image, "jpeg", arg1.getOutputStream());
	
}

}
