package com.hxqh;

import com.hxqh.anno.EnableCustom;
import com.hxqh.dao.IndexDao;
import com.hxqh.imports.MyImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
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
}
