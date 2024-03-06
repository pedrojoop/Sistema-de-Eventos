package sistema_evento.Repository;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

import sistema_evento.domain.Evento;

public class Utilidades {
        public static void ordenarEventosPorData(List<Evento> eventos) {
        eventos.sort(Comparator.comparing(Evento::getHorario));
    }

    public static boolean isEventoOcorrendoAgora(Evento evento) {
        LocalDateTime agora = LocalDateTime.now();
        return evento.getHorario().isBefore(agora) && evento.getHorario().plusHours(1).isAfter(agora);
    }
}
