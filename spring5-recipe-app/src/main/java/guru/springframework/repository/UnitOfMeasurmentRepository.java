package guru.springframework.repository;

import guru.springframework.domain.UnitOfMeasuremment;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasurmentRepository extends CrudRepository<UnitOfMeasuremment,Long> {
}
