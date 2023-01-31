package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.agencia = 201;
		primeiraConta.numero = 120;
		primeiraConta.titular = "Cristian";
		System.out.println("Saldo " + primeiraConta.saldo);
		System.out.println("Agência " + primeiraConta.agencia);
		System.out.println("Número da conta " + primeiraConta.numero);
		System.out.println("Titular da conta " + primeiraConta.titular);
		System.out.println("\n");
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		segundaConta.agencia = 201;
		segundaConta.numero = 121;
		segundaConta.titular = "Fabiano";
		System.out.println("Saldo " + segundaConta.saldo);
		System.out.println("Agência " + segundaConta.agencia);
		System.out.println("Número da conta " + segundaConta.numero);
		System.out.println("Titular da conta " + segundaConta.titular);
		
		if(primeiraConta == segundaConta) {
			System.out.println("\r **** É a mesma conta **** ");
		}else {
			System.out.println("\r **** Conta diferente **** ");

	}
		System.out.println("mostrando a referencia da conta primeira conta - " + primeiraConta);
		System.out.println("mostrando a referencia da conta segunda conta - " + segundaConta);

}
}
