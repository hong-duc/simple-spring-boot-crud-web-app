package dman.hongduc.spring.boot.web.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author duc
 */
@Entity
public class Post {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String message;

    public Post() {
    }

    public Post(String message) {
        this.message = message;
    }
    
    

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}
