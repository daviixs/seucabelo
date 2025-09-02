package controllers;

import com.seucabelo.seucabelo.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepo;

    @GetMapping({"", "/"})
    public String clientes(Model model) {
        var clientes = clienteRepo.findAll(Sort.by(Sort.Direction.DESC, "primeiroNome"));
        model.addAttribute("clientes", clientes);
        return "clientes";

    }
}