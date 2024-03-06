package sistema_evento.Service;

import java.util.ArrayList;
import java.util.List;

import sistema_evento.domain.Usuario;;

public class CadastroDeUsuarios {
    private List<Usuario> usuarios;

    public CadastroDeUsuarios() {
        this.usuarios = new ArrayList<>();
    }
    
    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
