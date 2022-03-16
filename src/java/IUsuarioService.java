
import java.util.List;
import src.entity.Usuario;


public interface IUsuarioService {
     public void crearRegistro(Usuario usuario);
    public void actualizaRegistro(Usuario usuario);
    public void eliminarRegistro(int idUsuario);
    public List<Usuario> obtenerRegistros(Usuario usuario);
    public Usuario obtenerRegistro(int idUsuario);
}
