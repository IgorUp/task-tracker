package tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by igor
 */
@SpringBootApplication
@ComponentScan
public class ApplicationTracker {
    public static void main( String[] args )
    {
        SpringApplication.run(ApplicationTracker.class, "--debug");
    }
}
