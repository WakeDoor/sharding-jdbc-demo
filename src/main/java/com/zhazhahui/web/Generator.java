package com.zhazhahui.web;

import java.util.List;
import java.util.ArrayList;
import java.io.InputStream;

import lombok.extern.slf4j.Slf4j;

import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.generator.config.xml.ConfigurationParser;

/**
 * @author ZhaYongchao
 * @PackageName com.zhazhahui.web
 * @Description mybatis生成器 必须配合使用application.properties
 * @create 2020-07-12 18:09
 */
@Slf4j
public class Generator {

    public static void main(String[] args) throws Exception {
        //MBG 执行过程中的警告信息
        List<String> warnings = new ArrayList<>();

        ConfigurationParser cp = new ConfigurationParser(warnings);
        //读取配置文件
        InputStream is = Generator.class.getResourceAsStream("/generator/generatorConfig.xml");
        Configuration config = cp.parseConfiguration(is);
        is.close();

        //当生成的代码重复时，覆盖原代码
        boolean overWrite = true;
        DefaultShellCallback callback = new DefaultShellCallback(overWrite);
        //创建 MBG
        MyBatisGenerator generator = new MyBatisGenerator(config, callback, warnings);
        //执行生成代码
        generator.generate(null);
        //输出警告信息
        for (String warning : warnings) {
            log.warn(warning);
        }
    }
}
