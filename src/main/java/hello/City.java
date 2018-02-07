package hello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class City {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    public Long id;

    @Column(nullable = false)
    public String name;


    protected City() {
    }

    public City(String name) {
        super();
        this.name = name;
    }

    public String toString() {
        return "sample.data.jpa.domain.City(name=" + this.name;
    }

    //setters city's fields
    public void setName(String name) {
        this.name = name;
    }


    //getters city's fields
    public String getName() {
        return this.name;
    }

}
