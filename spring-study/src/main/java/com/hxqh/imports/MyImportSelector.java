package com.hxqh.imports;

import com.hxqh.dao.IndexDao2;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by Ocean lin on 2020/3/16.
 *
 * @author Ocean lin
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// importingClassMetadata.getMetaAnnotationTypes()
		// 此处可以通过在启动类上增加注解，决定是否注入IndexDao
		return new String[]{IndexDao2.class.getName()};
	}
}
