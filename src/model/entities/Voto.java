package model.entities;
// Generated 23/01/2014 14:28:10 by Hibernate Tools 3.6.0

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Voto implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer idVoto;
    @ManyToOne
    private Publicacion publicacion;
    @ManyToOne
    private Usuario usuario;

    public Voto() {
    }

    public Voto(Publicacion publicacion, Usuario usuario) {
        this.publicacion = publicacion;
        this.usuario = usuario;
    }

    public Integer getIdVoto() {
        return this.idVoto;
    }

    public void setIdVoto(Integer idVoto) {
        this.idVoto = idVoto;
    }

    public Publicacion getPublicacion() {
        return this.publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
