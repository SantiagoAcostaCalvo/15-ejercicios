package EmpresaPersona;

public class PrincipalEmpresaPersona {
    public static void main(String[] args) {
        PersonaEmpresa p = new PersonaEmpresa("Ana Martínez", "Gerente de Ventas");
        System.out.println(p.getInfo());

        Gerente g = new Gerente("Carlos Pérez", "Director General", 5000.00);
        System.out.println(g.getInfo());
    }
}
