public class Main{
    public static void main(String[]args) {
        Cliente cliente = new Cliente();
            cliente.age = 32;
            cliente.name = "dyamond";
            cliente.phone = 1234567;
            cliente.credito = 1;
        System.out.println(cliente.age);
        System.out.println(cliente.name);
        System.out.println(cliente.phone);
        System.out.println(cliente.credito);
        Trabajador trabajador = new Trabajador();
            trabajador.age = 33;
            trabajador.name = "yoyo";
            trabajador.phone = 987654321;
            trabajador.salario = 121212;
        System.out.println(trabajador.age);
        System.out.println(trabajador.name);
        System.out.println(trabajador.phone);
        System.out.println(trabajador.salario);    

    }
}

class Persona{
    int age, phone;
    String name;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}