package cn.itcast.springboot;


import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootApplication扫描的包根据以下
 * SpringApplication application = new SpringApplication(Application.class)
 * Application.class:可以得到扫描的包在该类所在目录下
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
		//设置banner横幅为关闭模式
		application.setBannerMode(Mode.OFF);
		application.run(args);
	}
}
