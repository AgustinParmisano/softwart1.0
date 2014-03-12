package model.entities;
// Generated 23/01/2014 14:28:10 by Hibernate Tools 3.6.0

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Sistema implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer idSistema;
    @OneToOne
    private Usuario usuario;
    private String tituloDelSitio;
    private String descripcionDelSitio;
    private String tagsDelSitio;
    private String urisSemanticas;
    private String banner;
    private String estilo;
    private Boolean hablitado;
    private Boolean moderarPublicaciones;
    private Integer puntosParaSancionar;
    private Integer tiempoDeSancion;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaModificacion;

    public Sistema() {
    }

    public Sistema(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sistema(Usuario usuario, String tituloDelSitio, String descripcionDelSitio, String tagsDelSitio, String urisSemanticas, String banner, String estilo, Boolean hablitado, Boolean moderarPublicaciones, Integer puntosParaSancionar, Integer tiempoDeSancion, Date fechaModificacion) {
        this.usuario = usuario;
        this.tituloDelSitio = tituloDelSitio;
        this.descripcionDelSitio = descripcionDelSitio;
        this.tagsDelSitio = tagsDelSitio;
        this.urisSemanticas = urisSemanticas;
        this.banner = banner;
        this.estilo = estilo;
        this.hablitado = hablitado;
        this.moderarPublicaciones = moderarPublicaciones;
        this.puntosParaSancionar = puntosParaSancionar;
        this.tiempoDeSancion = tiempoDeSancion;
        this.fechaModificacion = fechaModificacion;
    }

    public Integer getIdSistema() {
        return this.idSistema;
    }

    public void setIdSistema(Integer idSistema) {
        this.idSistema = idSistema;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTituloDelSitio() {
        return this.tituloDelSitio;
    }

    public void setTituloDelSitio(String tituloDelSitio) {
        this.tituloDelSitio = tituloDelSitio;
    }

    public String getDescripcionDelSitio() {
        return this.descripcionDelSitio;
    }

    public void setDescripcionDelSitio(String descripcionDelSitio) {
        this.descripcionDelSitio = descripcionDelSitio;
    }

    public String getTagsDelSitio() {
        return this.tagsDelSitio;
    }

    public void setTagsDelSitio(String tagsDelSitio) {
        this.tagsDelSitio = tagsDelSitio;
    }

    public String getUrisSemanticas() {
        return this.urisSemanticas;
    }

    public void setUrisSemanticas(String urisSemanticas) {
        this.urisSemanticas = urisSemanticas;
    }

    public String getBanner() {
        return this.banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getEstilo() {
        return this.estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public Boolean getHablitado() {
        return this.hablitado;
    }

    public void setHablitado(Boolean hablitado) {
        this.hablitado = hablitado;
    }

    public Boolean getModerarPublicaciones() {
        return this.moderarPublicaciones;
    }

    public void setModerarPublicaciones(Boolean moderarPublicaciones) {
        this.moderarPublicaciones = moderarPublicaciones;
    }

    public Integer getPuntosParaSancionar() {
        return this.puntosParaSancionar;
    }

    public void setPuntosParaSancionar(Integer puntosParaSancionar) {
        this.puntosParaSancionar = puntosParaSancionar;
    }

    public Integer getTiempoDeSancion() {
        return this.tiempoDeSancion;
    }

    public void setTiempoDeSancion(Integer tiempoDeSancion) {
        this.tiempoDeSancion = tiempoDeSancion;
    }

    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

}
