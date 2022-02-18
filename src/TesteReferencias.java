
public class TesteReferencias {

	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		g1.setNome("Tuco");
		g1.setSalario(5000.0);
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(2000.0);
			
		Funcionario f2 = new Funcionario();
		f2.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(f2);
		
		System.out.println(controle.getSoma());
		

	}

}
