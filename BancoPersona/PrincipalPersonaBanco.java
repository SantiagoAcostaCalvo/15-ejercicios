package BancoPersona;

public class PrincipalPersonaBanco {
    public static void main(String[] args) {
        PersonaBanco p = new PersonaBanco("Carlos López", "12345678");
        System.out.println(p.getInfo());
    }
}
