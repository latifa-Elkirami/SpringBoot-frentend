package net.guides.springbootfrentend;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
@Data
public class MyProperties {
   // @Bean
    //@Primary
   // @ConfigurationProperties(prefix="spring.datasourcefirst")
   // public DataSource primaryDataSource() {
        //return DataSourceBuilder.create().build();
    //}

    //@Bean
   // @Primary
   // @ConfigurationProperties(prefix="spring.datasourcesecond")
    //public DataSource secondaryDataSource() {
       // return DataSourceBuilder.create().build();
    //}

}
