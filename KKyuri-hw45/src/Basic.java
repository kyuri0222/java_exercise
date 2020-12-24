class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends TV {
	private int color;
	
	public int getColor() {return color;}
	public ColorTV (int size, int color) {
		super(size);
		this.color=color;
	}
	
	public void printProperty() {
		System.out.println(getSize()+"��ġ "+getColor()+"�÷�");
	}
}

class IPTV extends ColorTV {
	String IP;
	
	public IPTV(String IP, int size, int color) {
		super(size, color);
		this.IP = IP;
	}
	
	public void printProperty() {
		System.out.print("���� IPTV�� "+IP+" �ּ��� "+getSize()+"��ġ "+getColor()+"�÷�");
	}
}

public class Basic {
	public static void main(String args[]) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 
		iptv.printProperty();
	}
}
