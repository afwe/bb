/*package backend.afwe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AfweApplication {

    public static void main(String[] args) {
        SpringApplication.run(AfweApplication.class, args);
    }

}*/
package backend.afwe;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AfweApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(AfweApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AfweApplication.class);
    }
}
