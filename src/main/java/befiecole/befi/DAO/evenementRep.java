package befiecole.befi.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import befiecole.befi.Entity.*;


@CrossOrigin("*")
@RepositoryRestResource
public interface evenementRep extends JpaRepository<evenement, Long> {
}
