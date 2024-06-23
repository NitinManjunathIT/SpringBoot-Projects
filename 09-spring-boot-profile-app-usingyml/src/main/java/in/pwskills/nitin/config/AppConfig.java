package in.pwskills.nitin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value=PersistenceConfig.class)
public class AppConfig {

}
