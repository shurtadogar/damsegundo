package clase.lambda;

import java.util.Comparator;

public class ClienteEdadComparator implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        /* Si A > B devolver 1, si A = B devuelve 0*/
        return o1.getiEdad() > o2.getiEdad() ? 1 : -1; //OPERADORES CONDICIONALES
    }
}
