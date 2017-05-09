package com.threads;

public class ThreadTest {

	private static Object lock = new Object();

	private volatile static boolean isPrinted = true;

	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();

		t.t1.start();
		t.t2.start();

	}

	Thread t1 = new Thread(() -> {

		synchronized (lock) {
			for (int i = 0; i <= 10; i = i + 2) {
				
					
					while (!isPrinted) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				}
					System.out.println(i);
					isPrinted = false;
					lock.notifyAll();


			}

		}

	});

	Thread t2 = new Thread(() -> {
		synchronized (lock) {
			for (int i = 1; i < 10; i = i + 2) {
				
					System.out.println(i);
					isPrinted = true;
					lock.notifyAll();

					while (isPrinted) {
						try {
							lock.wait();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					


				}
			}

		}

	});

}
