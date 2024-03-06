package sistema_evento.Service;

import java.util.ArrayList;
import java.util.List;
import sistema_evento.domain.Evento;

public class CadastroDeEventos {
    private List<Evento> eventos;

    public CadastroDeEventos() {
        this.eventos =new ArrayList<>();
    }

    public void CadastrarEventos(Evento evento) {
        eventos.add(evento);
    }

    public void ListarEventos() {
        for (Evento evento : eventos) {
            System.out.println(evento);
        }
    }
}
