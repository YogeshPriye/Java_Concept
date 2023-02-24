
public class MyThreadSync extends Thread{
	DisplayMessage dm;
	String name;
	
	MyThreadSync(DisplayMessage dm, String name) {
		this.dm = dm;
		this.name = name;
	}
	
	public void run() {
		dm.sayHello(name);
	}
}
