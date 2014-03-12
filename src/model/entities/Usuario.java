package model.entities;
// Generated 23/01/2014 14:28:10 by Hibernate Tools 3.6.0

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Usuario implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer idUsuario;

    private String nombre;
    private String apellido;
    private String dni;
    private String legajo;
    private String mail;
    private String clave;
    private Boolean moderador;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFinSancion;

    private String avatar;
    @OneToMany(mappedBy = "usuarioComentador")
    private List<Comentario> comentarios;
    @OneToMany(mappedBy = "usuarioModerador")
    private List<Comentario> comentariosModerados;
    @OneToMany(mappedBy = "usuarioModerador")
    private List<Publicacion> publicacionesModeradas;
    @OneToMany(mappedBy = "usuario")
    private List<Voto> votos;
    @OneToMany(mappedBy = "usuarioPublicador")
    private List<Publicacion> publicaciones;
    @OneToMany(mappedBy = "usuario")
    private List<Evento> eventos;

    public Usuario() {
    }

    public Integer getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getLegajo() {
        return this.legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Boolean getModerador() {
        return this.moderador;
    }

    public void setModerador(Boolean moderador) {
        this.moderador = moderador;
    }

    public Date getFechaFinSancion() {
        return this.fechaFinSancion;
    }

    public void setFechaFinSancion(Date fechaFinSancion) {
        this.fechaFinSancion = fechaFinSancion;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Comentario> getComentariosModerados() {
        return comentariosModerados;
    }

    public void setComentariosModerados(List<Comentario> comentariosModerados) {
        this.comentariosModerados = comentariosModerados;
    }

    public List<Publicacion> getPublicacionesModeradas() {
        return publicacionesModeradas;
    }

    public void setPublicacionesModeradas(List<Publicacion> publicacionesModeradas) {
        this.publicacionesModeradas = publicacionesModeradas;
    }

    public List<Voto> getVotos() {
        return votos;
    }

    public void setVotos(List<Voto> votos) {
        this.votos = votos;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

}
