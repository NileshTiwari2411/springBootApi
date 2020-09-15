package couture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class EmployeeConfig {
    @Bean(name = "dsIgnite")
    @Primary
    @ConfigurationProperties(prefix="spring.datasourceignite")
    public DataSource igniteDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "jdbcIgnite")
    @Autowired
    public JdbcTemplate igniteJdbcTemplate(@Qualifier("dsIgnite") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}