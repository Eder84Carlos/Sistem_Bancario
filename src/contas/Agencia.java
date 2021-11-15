package contas;

import java.util.ArrayList;

import modelo.conta.ContaPoupanca;
import modelo.contas.ContaCorrente;

@SuppressWarnings("unused")
public class Agencia {
	
	private int numeroAgencia;	
	
	@SuppressWarnings("unused")
	private ArrayList <ContaCorrente> contaCorrente = new ArrayList<ContaCorrente>();
	@SuppressWarnings("unused")
	private ArrayList <ContaPoupanca> contaPoupanca = new ArrayList<ContaPoupanca>();
	
		
	public Agencia(int id) {
		this.numeroAgencia = id;		
	}
	
	public int getNumeroAgencia() {
		return this.numeroAgencia;
	}		
}