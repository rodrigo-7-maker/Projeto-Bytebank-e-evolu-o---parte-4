
public class Testegerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("Augustinho Carrara");
		g1.setCpf("222.226.234.45");
		g1.setSalario(5000);
		
		g1.setSenha(2222);
		
		boolean autenticou = g1.autentica(2222);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());

	}

}
