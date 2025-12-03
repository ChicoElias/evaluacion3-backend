package com.elias.evaluacion3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;

@Entity
@Table(name = "ventas")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_cliente", nullable = false, length = 150)
    private String nombreCliente;

    @Column(name = "email_vendedor", nullable = false, length = 150)
    private String emailVendedor;

    @Column(name = "detalle_compra", nullable = false, length = 255)
    private String detalleCompra;

    @Column(name = "fecha", nullable = false, length = 50)
    private String fecha;

    @Column(name = "monto", nullable = false, length = 50)
    private String monto;

    @Column(name = "estado", nullable = false, length = 20)
    private String estado;

    public Venta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEmailVendedor() {
        return emailVendedor;
    }

    public void setEmailVendedor(String emailVendedor) {
        this.emailVendedor = emailVendedor;
    }

    public String getDetalleCompra() {
        return detalleCompra;
    }

    public void setDetalleCompra(String detalleCompra) {
        this.detalleCompra = detalleCompra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @PrePersist
    public void prePersist() {
        if (estado == null || estado.isBlank()) {
            estado = "PENDIENTE";
        }
    }
}
