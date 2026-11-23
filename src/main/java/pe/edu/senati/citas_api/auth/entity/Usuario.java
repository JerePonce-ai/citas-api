package pe.edu.senati.citas_api.auth.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/** Representa una cuenta de la tabla usuarios. */
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    // En esta primera versión, la guía compara la contraseña en texto plano.
    @Column(nullable = false, length = 60)
    private String password;

    @Column(name = "rol_id", nullable = false)
    private Long rolId;

    @Column(nullable = false)
    private Boolean activo;

    @Column(name = "creado_en")
    private LocalDateTime creadoEn;

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Long getRolId() {
        return rolId;
    }

    public Boolean getActivo() {
        return activo;
    }

    public LocalDateTime getCreadoEn() {
        return creadoEn;
    }
}