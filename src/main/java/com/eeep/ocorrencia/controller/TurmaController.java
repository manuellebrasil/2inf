package com.eeep.ocorrencia.controller;

import com.eeep.ocorrencia.model.Turma;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TurmaController {

    private List<Turma> turmas = new ArrayList<>();
    private long id = 1;

    @GetMapping("/turma")
    public String abrirFormulario(Model model) {

        model.addAttribute("listaturmas", turmas);
        model.addAttribute("turma", new Turma());
        return "cadastro";
    }

    @PostMapping("/salvar")
    public String salvarTurma(@ModelAttribute Turma turma) {

        turma.setId(id++);
        turmas.add(turma);


        return "redirect:/turma";
    }
}