package com.upiiz.ORM.Models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "clientes")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 3, message = "El nombre de cliente debe tener minimo 3 carcteres")
    @Column(name = "nombre_cliente")
    private String nombre;
    @NotBlank(message = "Se debe de ingresarn apelldo")
    private String apellido;
    @NotBlank
    @Email
    @Column(unique = true)
    private String email;
    @NotBlank
    @Pattern(regexp = "")
    private String telefono;
    @NotBlank
    private String direccion;
    @Min(18)
    private int edad;
    @NotBlank
    @Pattern(regexp = "")
    private String rfc;

    /*
     * public ClienteEntity(long id, String nombre, String apellido) {
     * this.id = id;
     * this.nombre = nombre;
     * this.apellido = apellido;
     * }
     * 
     * public Long getId() {
     * return id;
     * }
     * 
     * public void setId(Long id) {
     * this.id = id;
     * }
     * 
     * public String getNombre() {
     * return nombre;
     * }
     * 
     * public void setNombre(String nombre) {
     * this.nombre = nombre;
     * }
     * 
     * public String getapellido() {
     * return apellido;
     * }
     * 
     * public void setapellido(String apellido) {
     * this.apellido = apellido;
     * }
     */
}
