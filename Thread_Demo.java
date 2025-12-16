class Thread1 extends Thread {
public void run() {
		while (true) {
			try {
				System.out.println("Good morning");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Good Morning Thread interrupted.");
				break;
			}
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		while (true) {
			try {
				System.out.println("Hello");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Hello Thread interrupted.");
				break;
			}
		}
	}
}

class Thread3 extends Thread {
	public void run() {
		while (true) {
			try {
				System.out.println("Welcome");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Welcome Thread interrupted.");
				break; 
			}
		}
	}
}

public class Thread_Demo {
	public static void main(String[] args) {
		Thread1 ob1 = new Thread1();
		Thread2 ob2 = new Thread2();
		Thread3 ob3 = new Thread3();

		ob1.start();
		ob2.start();
		ob3.start();
	}
}
