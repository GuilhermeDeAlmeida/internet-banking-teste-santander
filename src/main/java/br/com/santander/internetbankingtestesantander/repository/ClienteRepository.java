package br.com.santander.internetbankingtestesantander.repository;

import br.com.santander.internetbankingtestesantander.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
