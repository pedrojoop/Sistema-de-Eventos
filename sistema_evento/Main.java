package sistema_evento;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sistema_evento.domain.Evento;

public class Main {

    public static void main(String[] args) {
        List<Evento> eventos = carregarEventos();

        if (eventos.isEmpty()) {
            LocalDateTime now = LocalDateTime.now();
            eventos.add(new Evento(1, "Festa de Aniversário", "Rua A, 123", "Festa", now.plusDays(2), "Venha comemorar conosco!"));
            eventos.add(new Evento(2, "Concerto de Rock", "Praça Central", "Show", now.plusDays(5), "As melhores bandas de rock da cidade!"));
            salvarEventos(eventos);
        }

        System.out.println("Eventos disponíveis:");
        for (Evento evento : eventos) {
            System.out.println(evento.getId() + ": " + evento.getNome() + " - " + evento.getHorario());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha o ID do evento que deseja participar: ");
        int eventId = scanner.nextInt();

        Evento eventoSelecionado = null;
        for (Evento evento : eventos) {
            if (evento.getId() == eventId) {
                eventoSelecionado = evento;
                break;
            }
        }

        if (eventoSelecionado != null) {
            System.out.println("Você selecionou o evento:");
            System.out.println(eventoSelecionado);
        } else {
            System.out.println("Evento não encontrado.");
        }
    }

    public static void salvarEventos(List<Evento> eventos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("events.data"))) {
            oos.writeObject(eventos);
            System.out.println("Eventos salvos com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Evento> carregarEventos() {
        List<Evento> eventos = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("events.data"))) {
            eventos = (List<Evento>) ois.readObject();
            System.out.println("Eventos carregados com sucesso.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return eventos;
    }
}
