package com.dudu.crud_contabilidade.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.dudu.crud_contabilidade.entities.Pessoa;
import com.dudu.crud_contabilidade.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/cadastrarPessoa")
    public String cadastrarPessoaForm(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "cadastrarPessoa";
    }

    @PostMapping
    public String salvarPessoa(@ModelAttribute Pessoa pessoa) {
        pessoaRepository.save(pessoa);
        return "redirect:/pessoa/listarPessoas";
    }

    @GetMapping
    public String listarPessoas(Model model) {
        model.addAttribute("pessoa", pessoaRepository.findAll());
        return "listaPessoas";
    }


}
