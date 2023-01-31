package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaCristian = new Conta();
		contaCristian.saldo = 100;
		contaCristian.deposita(50);
		System.out.println(contaCristian.saldo);
		boolean conseguiuRetirar = contaCristian.saca(20);
		System.out.println(contaCristian.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaCristian);
		if(sucessoTransferencia){
			System.out.println("Transferencia com Sucesso!!");
		}else {
			System.out.println("Saldo insuficiente!!");
		}
		
		contaDaMarcela.transfere(300, contaCristian);
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaCristian.saldo);
		contaCristian.titular = "Cristian Fabiano";
		System.out.println(contaCristian.titular);
		
		
		
	}
}
