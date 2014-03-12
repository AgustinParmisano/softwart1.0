package model.entities;
// Generated 23/01/2014 14:28:10 by Hibernate Tools 3.6.0

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Evento implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer idEvento;
    @ManyToOne
    private Usuario usuario;
    @OneToOne
    private Publicacion publicacion;
    private String titulo;
    private String descripcion;
    private String contenido;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaSubido;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;

    public Evento() {
    }

    public Evento(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evento(Usuario usuario, Publicacion publicacion, String titulo, String descripcion, String contenido, Date fechaSubido, Date fechaInicio, Date fechaFin) {
        this.usuario = usuario;
        this.publicacion = publicacion;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.contenido = contenido;
        this.fechaSubido = fechaSubido;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Integer getIdEvento() {
        return this.idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Publicacion getPublicacion() {
        return this.publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaSubido() {
        return this.fechaSubido;
    }

    public void setFechaSubido(Date fechaSubido) {
        this.fechaSubido = fechaSubido;
    }

    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return this.fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setEventoByUsuarioPublicador(Usuario usuarioPublicador) {
        this.usuario = usuarioPublicador;
    }

    public Usuario getEventoByUsuarioPublicador() {
        return this.usuario;
    }

}
