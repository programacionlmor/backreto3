package grupo17_04_11.spring11.modelo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



//@Getter  @Setter @AllArgsConstructor  @NoArgsConstructor
//@Data

@Entity
@Table(name = "planetas")
public class Planeta {

    @Id
    @Column(length = 5)
    private Integer codigoP;

    @Column(length = 20)
    private String  nombreP;

    public Integer getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(Integer codigoP) {
        this.codigoP = codigoP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

      
}