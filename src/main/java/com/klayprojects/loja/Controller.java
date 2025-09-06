package com.klayprojects.loja;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Bem vindo à primeira rota criada";
    }

}
