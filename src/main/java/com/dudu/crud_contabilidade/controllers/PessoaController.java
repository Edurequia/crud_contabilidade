package com.dudu.crud_contabilidade.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.dudu.crud_contabilidade.entities.Pessoa;
import com.dudu.crud_contabilidade.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/listarPessoas")
    public String listarPessoas(Model model) {
        model.addAttribute("pessoa", pessoaRepository.findAll());
        return "listaPessoas";
    }

    @GetMapping("/deletar/{codigo}")
    public String deletar(@PathVariable Long codigo) {
        pessoaRepository.deleteById(codigo);

        return "redirect:/pessoa/listarPessoas";
    }

    @GetMapping("/editar/{codigo}")
    public String editar(@PathVariable Long codigo, Model model) {
        Pessoa pessoa = pessoaRepository.findById(codigo).get();
        model.addAttribute("pessoa", pessoa);

        return "editarPessoa";
    }
}
