public class MinhaConta {
    public static void main(String[] args) {

        ContaBanco c1 = new ContaBanco(1,"cc", "James");
        System.out.println(c1.isStatus());
        System.out.println(c1.getSaldo());

        c1.abrirConta();

        System.out.println(c1.isStatus());
        System.out.println(c1.getSaldo());

        c1.sacar(100);
        System.out.println(c1.getSaldo());

        c1.fecharConta();


    }
}
