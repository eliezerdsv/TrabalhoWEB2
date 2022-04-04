package dw.secauth.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dw.secauth.repository.ArtigoRepository;

@Controller
public class ArtigoControle {
    private ArtigoRepository rep;
    
    public ArtigoControle(ArtigoRepository repository){
        this.rep = repository;
    }

    @GetMapping("/artigos")
    public String artigos(Model model){
        model.addAttribute("listaArtigos",rep.findAll());
        return "lista";
    }
}
