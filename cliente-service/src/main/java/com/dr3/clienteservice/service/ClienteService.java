package com.dr3.clienteservice.service;

import com.dr3.clienteservice.model.Cliente;
import com.dr3.clienteservice.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> findAllClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findClienteById(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente updateCliente(Long id, Cliente cliente) {
        if(clienteRepository.findById(id).isPresent()) {
            cliente.setId(id);
            return clienteRepository.save(cliente);
        } else {
            return cliente;
        }
    }


    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
