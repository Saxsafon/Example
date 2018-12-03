package webapp;


import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    // Этот класс нужен, чтобы запустить наше приложение
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}