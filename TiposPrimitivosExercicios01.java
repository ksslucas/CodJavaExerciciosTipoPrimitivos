package MainPrimitivos.TIPOS;

public class TiposPrimitivosExercicios01 {
    public static void main(String[] args) {
        String name = "Lucas Gabriel";
        int age = 17;
        String endereco = "Cidade Operára. U 201, R7";
        float salario = 2500.00f;
        double data = 20.11;
        String result = "Olá, Meu nome é " +
                name + ", tenho "+ age + " anos de idade. Moro no endereço: "
                + endereco + ". Meu primeiro salário na área foi de " + salario +
                " e eu recebi no dia " + data;
        System.out.println(result);
    }
}
