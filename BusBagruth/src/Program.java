
public class Program {

	public static void main(String[] args) {
		BusRoute b = new BusRoute(new Station(0, 2), new Station(1, 4));
		b.addStation(new Station(5, 4));
		b.addStation(new Station(3, 1));
		b.addStation(new Station(5, 0));
		System.out.println(b);
		System.out.println(b.RouteLength());
	}

}
