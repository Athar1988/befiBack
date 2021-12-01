package befiecole.befi.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "reddit_entreprise")
public class entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String civilite;
    private String nom;
    private String prenom;
    private String fonction;
    private String telephone;
    private String modile;
    private String activite;
    private String email;
    private String message;
}
