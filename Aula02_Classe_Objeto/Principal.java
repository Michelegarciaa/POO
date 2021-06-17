public class Principal {
  static public void main(String[] parametros)
	{

    Calendario calendario2021 = new Calendario(); // novo calendario
    calendario2021.material = "Plastico";
    calendario2021.folhas = 12;
    calendario2021.frenteVerso = false;
    calendario2021.capa = "Calendario 2021";

    Calendario calendario2022 = new Calendario(); // novo calendario
    calendario2022.material = "Papel";
    calendario2022.folhas = 6;
    calendario2022.frenteVerso = true;
    calendario2022.capa = "Calendario 2022";

    System.out.println(calendario2021.capa + "\t" + calendario2021.material);
    System.out.println(calendario2022.capa + "\t" + calendario2022.material);

  }
}
