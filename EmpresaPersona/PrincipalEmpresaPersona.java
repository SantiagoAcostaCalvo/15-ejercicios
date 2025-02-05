package EmpresaPersona;

public class PrincipalEmpresaPersona {
    public static void main(String[] args) {
        PersonaEmpresa p = new PersonaEmpresa("Ana Martínez", "Gerente de Ventas");
        System.out.println(p.getInfo());
    }
}
