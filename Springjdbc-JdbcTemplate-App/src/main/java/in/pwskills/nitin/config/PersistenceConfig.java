package in.pwskills.nitin.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class PersistenceConfig {

	@Bean
	public DataSource dataSource() {
		String location = "D:\\weekend_springBoot\\Springjdbc-JdbcTemplate-App\\src\\main\\java\\in\\pwskills\\nitin\\config\\application.properties";
		HikariDataSource dataSource = new HikariDataSource(new HikariConfig(location));
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(@Autowired DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public NamedParameterJdbcTemplate nmJdbcTemplate(@Autowired DataSource dataSource) {
		return new NamedParameterJdbcTemplate(dataSource);
	}
}
