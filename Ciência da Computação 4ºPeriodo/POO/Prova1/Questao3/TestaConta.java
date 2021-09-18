package Prova1.Questao3;

class TestaConta {
    public static void main(String [] args) {
    conta conta = new conta();

    conta.setTitular("jose");
    conta.setNumero(6);
    conta.setSaldo(30.50);
    //conta.titular="jose";
    //conta.numero=6;
    //conta.saldo=30.50;
    System.out.println("Olá "+conta.getTitular()+", seu saldo é de "+conta.getSaldo());
    //System.out.println("Olá "+conta.titular+", seu saldo é de "+conta.saldo);
    }
}
   