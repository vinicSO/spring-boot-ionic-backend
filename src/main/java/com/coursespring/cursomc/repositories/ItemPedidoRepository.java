package com.coursespring.cursomc.repositories;

import com.coursespring.cursomc.domain.ItemPedido;
import com.coursespring.cursomc.domain.ItemPedidoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
