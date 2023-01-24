public class EmpleadoService implements EmpleadoPort{

    IEmpleadoRepository repository = new EmpleadoRepository();

    @Override
    public void guardarEmpleado(EmpleadoRequest request) {
        Empleado empleado = new Empleado(1, request.getNombre());
        repository.guardarEmpleado(empleado);
    }
}
