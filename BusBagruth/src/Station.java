
public class Station {
	private int x, y;

	public Station(int x, int y) {
		setX(x);
		setY(y);
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}

	public Node<Station> toNode() {
		return new Node<Station>(this);
	}

	public double distance(Station a) {
		return Math.sqrt(Math.pow(this.x - a.getX(), 2) + Math.pow(this.y - a.getY(), 2));
	}
}
