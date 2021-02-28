package br.com;

import br.com.dip.ManagerDIP;
import br.com.dip.SuperWorker;
import br.com.dip.Worker;

public class Main {
	
	public static void main(String[] args) {
		
		// TODO: Execute DIP
		ManagerDIP dip = new  ManagerDIP();
		dip.setWorker(new Worker());
		dip.manage();
		
		ManagerDIP dip2 = new  ManagerDIP();
		dip2.setWorker(new SuperWorker());
		dip2.manage();
		
    }

}
