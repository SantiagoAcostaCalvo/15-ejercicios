package HotelPersona;

public class PrincipalPersonaHotel {
    public static void main(String[] args) {
        PersonaHotel p = new PersonaHotel("Mario Gómez", 5);
        System.out.println(p.getInfo());

        ClienteVIP vip = new ClienteVIP("Laura Martínez", 7, "Desayuno gratis, acceso al spa");
        System.out.println(vip.getInfo());
    }
}
