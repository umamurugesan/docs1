package lockdemo;

import java.util.concurrent.locks.*;

class LockDemo {
	public static void main(String args[]) {
		ReentrantLock lock = new ReentrantLock();
		new LockThread(lock, "A");
		new LockThread(lock, "B");
	}
}

//A shared resource.
class Shared {
	static int count = 0;
}

//A thread of execution that increments count.
class LockThread implements Runnable {
	String name;
	ReentrantLock lock;

	LockThread(ReentrantLock lk, String n) {
		lock = lk;
		name = n;
		new Thread(this).start();
	}

	public void run() {
		System.out.println("Starting " + name);
		try {
//First, lock count.
			System.out.println(name + " is waiting to lock count.");
			lock.lock();
			System.out.println(name + " is locking count.");
			for(int i=0;i<5;i++)
			{
			 Shared.count++;
			 System.out.println("inside for:"+Shared.count);
				Thread.sleep(1000);
			}
			System.out.println(name + ": " + Shared.count);
//Now, allow a context switch -- if possible.
			System.out.println(name + " is sleeping.");
		
		} catch (InterruptedException exc) {
			System.out.println(exc);
		} finally {
//Unlock
			System.out.println(name + " is unlocking count.");
			lock.unlock();
		}
	}
}
