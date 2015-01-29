package skivcirkeln;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.mangofactory.swagger.plugin.EnableSwagger;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableMongoRepositories
@Import(RepositoryRestMvcConfiguration.class)
@EnableSwagger
public class SkivcirkelnServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkivcirkelnServiceApplication.class, args);
    }
}
