package br.com.fiap.ifome.repository;

import br.com.fiap.ifome.model.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {


    @Query("SELECT us " +
            "FROM UsuarioEntity us " +
            "WHERE us.id = :id")
    UsuarioEntity buscarPorId(@Param("id") Long id);

}
