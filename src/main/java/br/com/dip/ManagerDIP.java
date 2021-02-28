package br.com.dip;

public class ManagerDIP {
	IWorker worker;

	public void setWorker(IWorker w) {
		this.worker = w;
	}

	public void manage() {
		this.worker.work();
	}
}
