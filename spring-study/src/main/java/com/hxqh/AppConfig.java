package com.hxqh;

import com.hxqh.anno.EnableCustom;
import com.hxqh.dao.IndexDao;
import com.hxqh.dao.IndexDao3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 加@Configuration会进行cglib代理，不加不会进行cglib代理
 * <p>
 * <p>
 * Created by Ocean lin on 2020/2/25.
 *
 * @author Ocean lin
 */

@Configuration
@ComponentScan("com.hxqh")
//@Import(MyImportSelector.class)
@EnableCustom
public class AppConfig {

	@Bean
	public IndexDao indexDao() {
		return new IndexDao();
	}

	@Bean
	public IndexDao3 indexDao3() {
		indexDao();
		return new IndexDao3();
	}
}
