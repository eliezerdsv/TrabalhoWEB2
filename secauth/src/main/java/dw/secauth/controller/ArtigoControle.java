package dw.secauth.controller;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dw.secauth.model.Artigo;
import dw.secauth.repository.ArtigoRepository;

@Controller
public class ArtigoControle {
    private ArtigoRepository rep;
    
    public ArtigoControle(ArtigoRepository repository){
        this.rep = repository;
    }

    @GetMapping("/artigos")
    public String artigos(Model model){
        model.addAttribute("listaArtigos", rep.findAll());
        return "lista";
    }

    @GetMapping("/artigos/novo")
    public String novoArtigo(@ModelAttribute("artigo") Artigo artigo){
        return "formulario";
    }
        
    

    @GetMapping("/artigos/{id}")
    public String alterarArtigo(@PathVariable("id") long id, Model model){
        Optional<Artigo> a = rep.findById(id);
        if(!a.isPresent()){
            throw new IllegalArgumentException("Artigo invalido");

        }
        model.addAttribute("artigo", a.get());
        return "formulario";
    }
        
    

    @PostMapping("/artigos/salvar")
    public String salvarArtigo(@ModelAttribute("artigo") Artigo artigo){
        rep.save(artigo);    
        return "redirect:/artigos";
    }
    
}
