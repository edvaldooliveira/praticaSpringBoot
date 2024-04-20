package edvaldooliveira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PraticandoApplication {

    @GetMapping("/hello")
    public String helloword(){
        return "Hello Word";
    }


    public static void main(String[] args) {
        SpringApplication.run(PraticandoApplication.class, args);
    }

}
