public class EmpleadoRepository implements IEmpleadoRepository{
    @Override
    public void guardarEmpleado(Empleado empleado) {
        System.out.println("El empleado " + empleado.getNombre() + " con id " + empleado.getId() + " se guardo de forma exitosa.");
    }
}
