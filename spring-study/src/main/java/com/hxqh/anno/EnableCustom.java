package com.hxqh.anno;

import com.hxqh.imports.MyImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Ocean lin on 2020/3/16.
 *
 * @author Ocean lin
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyImportSelector.class)
public @interface EnableCustom {


}
