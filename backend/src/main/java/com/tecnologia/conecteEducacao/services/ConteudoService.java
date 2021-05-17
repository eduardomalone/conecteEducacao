package com.tecnologia.conecteEducacao.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tecnologia.conecteEducacao.dto.ConteudoDTO;
import com.tecnologia.conecteEducacao.dto.DisciplinaDTO;
import com.tecnologia.conecteEducacao.entities.Conteudo;
import com.tecnologia.conecteEducacao.entities.ConteudoNivel;
import com.tecnologia.conecteEducacao.entities.Disciplina;
import com.tecnologia.conecteEducacao.repositories.ConteudoRepository;
import com.tecnologia.conecteEducacao.repositories.DisciplinaRepository;

@Service
public class ConteudoService {
	
	@Autowired
	private ConteudoRepository repository;
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	
	@Transactional(readOnly = true)
	public List<ConteudoDTO> findAll() {
		List<Conteudo> list = repository.findOrdersWithConteudos();
		return list.stream().map(x -> new ConteudoDTO(x)).collect(Collectors.toList());
	
	}
	
	@Transactional
	public ConteudoDTO insert(ConteudoDTO dto) {
		Conteudo conteudo = new Conteudo(null, dto.getTexto(), dto.getTitulo(), dto.getAssunto(),dto.getImageUri(), ConteudoNivel.MEDIO);
		for (DisciplinaDTO p : dto.getDisciplinas()) {
			Disciplina disciplina = disciplinaRepository.getOne(p.getId());
			conteudo.getDisciplinas().add(disciplina);
		}
		conteudo = repository.save(conteudo);
		return new ConteudoDTO(conteudo);
	}
	
	//@Transactional
	//public ConteudoDTO setDelivered(Long id) {
	//	Order order = repository.getOne(id);
	//	order.setStatus(OrderStatus.DELIVERED);
	//	order = repository.save(order);
	//	return new OrderDTO(order);
	//}

}
