package guru.springframework.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long description;

    @ManyToMany
    @JoinTable(name = "receipe_categories",
    joinColumns = @JoinColumn(name = "receipes"),
    inverseJoinColumns = @JoinColumn(name = "categories")
    )
    private Set<Receipe> receipes=new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDescription() {
        return description;
    }

    public void setDescription(Long description) {
        this.description = description;
    }

    public Set<Receipe> getReceipes() {
        return receipes;
    }

    public void setReceipes(Set<Receipe> receipes) {
        this.receipes= receipes;
    }
}
