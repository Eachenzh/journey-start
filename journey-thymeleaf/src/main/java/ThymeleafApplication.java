import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by chen on 2018/4/8.
 */
@ComponentScan("com.journey.thymeleaf")
@SpringBootApplication
public class ThymeleafApplication {


    public static void main(String[] args) {
        SpringApplication.run(ThymeleafApplication.class, args);
    }
}
