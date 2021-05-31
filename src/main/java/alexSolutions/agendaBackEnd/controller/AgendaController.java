package alexSolutions.agendaBackEnd.controller;

import alexSolutions.agendaBackEnd.repository.AgendaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping({"/agenda"})
public class AgendaController {
    private AgendaRepository repository;

    AgendaController(AgendaRepository agendaRepository) {
        this.repository = agendaRepository;
    }
}
