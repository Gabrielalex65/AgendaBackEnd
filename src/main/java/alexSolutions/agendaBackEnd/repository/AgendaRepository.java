package alexSolutions.agendaBackEnd.repository;

import alexSolutions.agendaBackEnd.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long> {

}
