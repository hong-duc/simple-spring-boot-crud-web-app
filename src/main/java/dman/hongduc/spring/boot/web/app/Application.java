package dman.hongduc.spring.boot.web.app;

import dman.hongduc.spring.boot.web.app.domain.Post;
import dman.hongduc.spring.boot.web.app.domain.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author duc
 */
@SpringBootApplication
public class Application implements CommandLineRunner{
    
    @Autowired
    private PostRepo repo;
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        for(int i = 0;i<10;i++){
            repo.save(new Post("My post number #" + (i+1)));
        }
    }
}
