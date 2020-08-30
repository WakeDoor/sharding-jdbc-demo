package com.zhazhahui.web.config;

import com.google.common.collect.Maps;
import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Map;

@Configuration
@EnableConfigurationProperties(ShardingMasterSlaveConfig.class)
@ConditionalOnProperty({
        "sharding.jdbc.master-slave-rule.master-data-source-name" })
public class MybatisMapperScannerConfig {

    @Bean
    public DataSource masterSlaveDataSource(ShardingMasterSlaveConfig shardingMasterSlaveConfig) throws SQLException {
        Map<String, DataSource> dataSourceMap = Maps.newHashMap();
        dataSourceMap.putAll(shardingMasterSlaveConfig.getDataSources());
        // 创建 MasterSlave数据源
        DataSource dataSource = MasterSlaveDataSourceFactory.createDataSource(dataSourceMap,
                shardingMasterSlaveConfig.getMasterSlaveRule(), Maps.newHashMap());
//        log.info("masterSlaveDataSource config complete");
        return dataSource;
    }


}