package br.com.fiap.ifome.repository;

import br.com.fiap.ifome.model.entity.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Long> {

    @Query("SELECT en " +
            "FROM EnderecoEntity en " +
            "WHERE en.id = :id")
    EnderecoEntity buscarporId(@Param("id")Long id);
}
