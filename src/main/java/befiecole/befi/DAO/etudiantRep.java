package befiecole.befi.DAO;

import befiecole.befi.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;



@CrossOrigin("*")
@RepositoryRestResource
public interface etudiantRep extends JpaRepository<etudiant,Long> {

}