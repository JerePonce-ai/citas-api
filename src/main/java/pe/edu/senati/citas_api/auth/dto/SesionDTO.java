package pe.edu.senati.citas_api.auth.dto;

/** Respuesta del login; no incluye la contraseña. */
public record SesionDTO(Long usuarioId, String email, String rol) {
}