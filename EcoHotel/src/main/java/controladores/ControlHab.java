package controladores;
/* Autor: Juanes Cardona
 */
import dao.DaoHabitacion;
import dto.DtoHabitacion;
import java.util.ArrayList;

public class ControlHab {
    private DaoHabitacion daoHabitacion;

    public ControlHab() {
        daoHabitacion = new DaoHabitacion();
    }

    public ArrayList<DtoHabitacion> listarHabitaciones() {
        return daoHabitacion.listarHabitaciones();
    }

    public DtoHabitacion buscarHabitacionPorId(String id) {
        return daoHabitacion.obtenerHabitacionPorId(id);
    }

    public boolean guardarHabitacion(DtoHabitacion nuevaHabitacion) {
        return daoHabitacion.registrarNuevaHabitacion(nuevaHabitacion);
    }

    public boolean editarHabitacion(String id, DtoHabitacion datosActualizados) {
        return daoHabitacion.actualizarDatosHabitacion(id, datosActualizados);
    }

    public boolean eliminarHabitacion(String id) {
        return daoHabitacion.RemoverHabitacionPorId(id);
    }
}
