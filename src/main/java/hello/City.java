package hello;

import org.hibernate.mapping.Collection;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class City {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    public Long id;

    @Column(nullable = false)
    public String name;

    @OneToMany(mappedBy="city")
    private List<Person> persons;


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
