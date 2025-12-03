package com.elias.evaluacion3.service;

import com.elias.evaluacion3.model.Venta;
import com.elias.evaluacion3.repository.VentaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    private final VentaRepository ventaRepository;

    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    public List<Venta> findAll() {
        return ventaRepository.findAll();
    }

    public Optional<Venta> findById(Long id) {
        return ventaRepository.findById(id);
    }

    public Venta create(Venta venta) {
        return ventaRepository.save(venta);
    }

    public boolean deleteById(Long id) {
        if (ventaRepository.existsById(id)) {
            ventaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<Venta> markAsPaid(Long id) {
        return ventaRepository.findById(id).map(venta -> {
            venta.setEstado("PAGADO");
            return ventaRepository.save(venta);
        });
    }
}
