package com.threads;

import java.util.Scanner;

public class ThreadOperations {

	public void operation1() {
		synchronized (this) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Operations1");
			while (true)

			{
				scanner.nextLine();
				scanner.close();
				return;

			}
		}

	}

	public void operation2() {
		synchronized (this) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Operations2");
			while (true)

			{
				scanner.nextLine();
				scanner.close();
				return;

			}
		}

	}
	public static void main(String[] args) {
		ThreadOperations operations= new ThreadOperations();
		Thread t1= new Thread(new RunnableImpl(operations, true)); 
		Thread t2= new Thread(new RunnableImpl(operations, false)); 
		t1.start();
		t2.start();
	}
	private static class RunnableImpl implements Runnable{
		
		ThreadOperations operations;
		boolean val;
		public RunnableImpl(ThreadOperations operations, boolean val) {
			this.operations=operations;
			this.val=val;
		}

		@Override
		public void run() {
			if(val){
				operations.operation1();
			}
			else{
				operations.operation2();
			}
			
		}
		
	}

}
