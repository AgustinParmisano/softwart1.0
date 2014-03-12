package model.entities;
// Generated 23/01/2014 14:28:10 by Hibernate Tools 3.6.0

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Comentario implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    Integer idComentario;

    @ManyToOne
    private Usuario usuarioComentador;

    @ManyToOne
    private Usuario usuarioModerador;
    @OneToOne
    private Publicacion publicacion;
    private String titulo;
    private String contenido;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaSubida;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaBaja;

    private Set sancions = new HashSet(0);

    public Comentario() {
    }

    public Integer getIdComentario() {
        return this.idComentario;
    }

    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
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

    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaSubida() {
        return this.fechaSubida;
    }

    public void setFechaSubida(Date fechaSubida) {
        this.fechaSubida = fechaSubida;
    }

    public Date getFechaBaja() {
        return this.fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Set getSancions() {
        return this.sancions;
    }

    public void setSancions(Set sancions) {
        this.sancions = sancions;
    }
    
    public Usuario getUsuarioComentador() {
        return usuarioComentador;
    }

    public void setUsuarioComentador(Usuario usuarioComentador) {
        this.usuarioComentador = usuarioComentador;
    }

    public Usuario getUsuarioModerador() {
        return usuarioModerador;
    }

    public void setUsuarioModerador(Usuario usuarioModerador) {
        this.usuarioModerador = usuarioModerador;
    }

}
