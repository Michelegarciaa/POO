public class Principal {
  static public void main(String[] parametros)
	{
    Produto prod = new Produto();
    prod.setCodigo(1);
    prod.setNome("Sabao craca");
    prod.setPreco(1.50);
    System.out.println(prod.getCodigo() + "\t" + prod.getNome() + "\t" + prod.getPreco());
  }
}

