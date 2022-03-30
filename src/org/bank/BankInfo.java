package org.bank;

public class BankInfo {
    private void saving() {
	 System.out.println("Saving 9%");

	}
    public void fixed() {
		System.out.println("fix amt 85%");

	}
   
    public void deposit() {
		 System.out.println("Deposit amount 99%");

	}
    public static void main(String[] args) {
		BankInfo B=new BankInfo();
		B.saving();
		B.fixed();
		B.deposit();
	}
}
