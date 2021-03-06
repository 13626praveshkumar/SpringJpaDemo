package guru.springframework.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    @ManyToOne
    private Receipe receipe;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasuremment unitOfMeasuremment;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Receipe getReceipe() {
        return receipe;
    }

    public void setReceipe(Receipe receipe) {
        this.receipe = receipe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UnitOfMeasuremment getUnitOfMeasuremment() {
        return unitOfMeasuremment;
    }

    public void setUnitOfMeasuremment(UnitOfMeasuremment unitOfMeasuremment) {
        this.unitOfMeasuremment = unitOfMeasuremment;
    }
}
