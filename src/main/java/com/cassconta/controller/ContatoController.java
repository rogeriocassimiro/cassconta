package com.cassconta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cassconta.model.Contato;
import com.cassconta.repository.ContatoRepository;

@Controller
@RequestMapping(value = "/rs/contato/")
public class ContatoController {

	@Autowired
	ContatoRepository contatoRepository;
	
	
	@RequestMapping(value="/listarTodos")
	@ResponseBody
	public List<Contato> listarTodos(){
		return contatoRepository.findAll();
	}
	
	@RequestMapping("/salvar")
	public Contato salvar(Contato contato) {
		contatoRepository.save(contato);
		return contato;
	}
	
	@RequestMapping("/contatos")
	@ResponseBody
	public Page<Contato> getContatos(int page){
		return contatoRepository.findAll(new PageRequest(page, 5));
	}
}
