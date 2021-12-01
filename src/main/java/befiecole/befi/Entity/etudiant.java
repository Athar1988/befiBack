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
@Table(name = "reddit_etudiants")
public class etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String filiere;
    private String  nom ;
    private String  prenom;
    private String  telephone;
    private String  datenaissance;
    private String  lieudenaissance;
    private String   nationalite;
    private String adresse;
    private String  ville;
    private String  pays;
    private String niveauetude;
    private String  message ;
    private String  email;
}
