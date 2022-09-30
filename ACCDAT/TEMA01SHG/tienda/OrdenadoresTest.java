package entregashg.tienda;

public class OrdenadoresTest {
    
    public static void main(String[] args) {

        Sobremesas s1 = new Sobremesas("500SHO", 16, "Intel Core i7-11700K", 900, "ATX");
        Portatiles p1 = new Portatiles("90058A", 32, "AMD Rayzen 7", 1500, 7.3);

        System.out.println("Caracteristicas "+p1.getsCodigo()+ ":");
        System.out.println(p1.getCaracterísiticas());
        System.out.println("Caracteristicas "+s1.getsCodigo()+ ":");
        System.out.println(s1.getCaracterísiticas());
    }
}
