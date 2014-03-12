package model.entities;
// Generated 23/01/2014 14:28:10 by Hibernate Tools 3.6.0

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Publicacion implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer idPublicacion;
    private String titulo;
    private String descripcion;
    private String contenido;
    private Boolean habilitada;
    private Boolean comentariosHabilitados;
    private Integer vistas;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaSubida;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaBaja;

    @OneToOne
    private Evento evento;

    @OneToMany(mappedBy = "publicacion")
    private List<Tag> tags;
    @OneToMany(mappedBy = "publicacion")
    private List<Voto> votos;
    @OneToMany(mappedBy = "publicacion")
    private List<Comentario> comentarios;
    @ManyToOne
    private Usuario usuarioModerador;
    @ManyToOne
    private Usuario usuarioPublicador;

    public Publicacion() {
    }

    public Integer getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Boolean isHabilitada() {
        return habilitada;
    }

    public void setHabilitada(Boolean habilitada) {
        this.habilitada = habilitada;
    }

    public Boolean isComentariosHabilitados() {
        return comentariosHabilitados;
    }

    public void setComentariosHabilitados(Boolean comentariosHabilitados) {
        this.comentariosHabilitados = comentariosHabilitados;
    }

    public Integer getVistas() {
        return vistas;
    }

    public void setVistas(Integer vistas) {
        this.vistas = vistas;
    }

    public Date getFechaSubida() {
        return fechaSubida;
    }

    public void setFechaSubida(Date fechaSubida) {
        this.fechaSubida = fechaSubida;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Voto> getVotos() {
        return votos;
    }

    public void setVotos(List<Voto> votos) {
        this.votos = votos;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

}
