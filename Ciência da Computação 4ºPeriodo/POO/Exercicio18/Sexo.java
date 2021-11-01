package Exercicio18;

public enum Sexo {
    F((short) 1, "F"), M((short) 2, "M");
    //Iago Antunes Ferreira
    private short sexo;
    private String nomeS;
  
    private Sexo(short sexo, String nomeS) {
      this.sexo = sexo;
      this.nomeS = nomeS;
    }

    public String getnomeS() {
        return this.nomeS;
      }
    //Iago Antunes Ferreira
    public short getValue() {
      return this.sexo;
    }

}