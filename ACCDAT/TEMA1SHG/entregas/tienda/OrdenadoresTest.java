package entregas.tienda;

public class OrdenadoresTest {
     public static void main(String[] args) {

        Sobremesas s1 = new Sobremesas("500SHO", 16, "Intel Core i7-11700K", 900, "ATX");
        Portatiles p1 = new Portatiles("90058A", 32, "AMD Rayzen 7", 1500, 7.3);
        
        p1.getCarateristicas();
        s1.getCarateristicas();
    }
    
}
