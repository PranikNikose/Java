interface IA {
	void ADisplay();
}

class A implements IA {
	public void ADisplay() {
		System.out.println("Display A");
	}
}

interface IB {
	void BDisplay();
}

class B implements IB {
	public void BDisplay() {
		System.out.println("Display B");
	}
}


class AB implements IA, IB 
{
	public void ADisplay() {
		System.out.println("Display A");
	}
	public void BDisplay() {
		System.out.println("Display B");
	}
}

class FirstCode {
	public static void main(String[] args) {
		AB obj = new AB();
		
		obj.ADisplay();
		obj.BDisplay();

	}
}
