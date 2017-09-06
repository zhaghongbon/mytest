package cn.itcast.springboot.datasource;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration//代表此类是个配置类
public class DataSourceConfiguration {
	
	@Bean(name="dataSource")
	@Primary  //代表以此类为主
	@ConfigurationProperties(prefix="spring.datasource.c3p0")  //配置属性
	public DataSource getDataSource(){
		DataSource dataSource = DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
		return dataSource;
	}
}
