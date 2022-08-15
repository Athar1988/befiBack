package befiecole.befi.DAO;
import befiecole.befi.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface loginRep extends JpaRepository<login,Long> {
}
