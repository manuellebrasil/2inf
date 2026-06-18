package com.eeep.ocorrencia.controller;

import com.eeep.ocorrencia.model.Turma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TurmaController {
    @GetMapping("/turma")
    public String abrirFormulario(Model model) {
        model.addAttribute("turma", new Turma());
        return "cadastro";

    }
    @PostMapping("/turma/salvar")
    public String salvarTurma(Turma turma){
        System.out.println(turma.getCodigo());
        System.out.println(turma.getDescricao());
        return "cadastro";
    }

}



