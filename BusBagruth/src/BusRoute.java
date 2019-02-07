
public class BusRoute {
	private Node<Station> route;

	public BusRoute(Station first, Station second) {
		setRoute(first.toNode());
		route.setNext(second.toNode());
	}

	public void addStation(Station newStation) {
		Node<Station> temp = route;
		while (temp.hasNext())
			temp = temp.getNext();
		temp.setNext(newStation.toNode());
	}

	public double RouteLength() {
		double dis = 0;
		Node<Station> temp = route;
		while (temp.hasNext()) {
			dis += temp.getValue().distance(temp.getNext().getValue());
			temp = temp.getNext();
		}
		return dis;
	}

	public String toString() {
		return route.toString();
	}

	public void setRoute(Node<Station> route) {
		this.route = route;
	}

}
