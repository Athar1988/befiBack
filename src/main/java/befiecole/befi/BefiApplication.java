package befiecole.befi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import befiecole.befi.Entity.*;
import befiecole.befi.DAO.*;
@SpringBootApplication
public class BefiApplication implements CommandLineRunner {
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;
    @Autowired
    private  loginRep replogin;


    public static void main(String[] args) {
        SpringApplication.run(BefiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(
                entreprise.class,
                contact.class,
                etudiant.class,
                evenement.class,
                login.class);
        // replogin.save(new login(null,"befi","befi"));

    }
}
