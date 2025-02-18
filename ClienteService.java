package com.examplojpa.projetoJpa2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplojpa.projetoJpa2.Entity.Cliente;
import com.examplojpa.projetoJpa2.Repository.ClienteRepository;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository = null;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente getClienteById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public List<Cliente> getAllCliente() {
        return clienteRepository.findAll();
    }

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
