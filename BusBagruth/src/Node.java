//המחלקה  חוליה 
public class Node<T> {
	private T value;
	private Node<T> next;

	// ט.יציאה: הפעולה בונה ומחזירה חוליה שהערך שלה הוא והשדה מקבל ערך ריק המציין
	// שאין לה חוליה עוקבת
	public Node(T value) {
		this.value = value;
		this.next = null;
	}

	// ט.יציאה: הפעולה בונה ומחזירה חוליה, שהערך שלה הוא והחוליה העוקבת לה היא
	// החוליה
	public Node(T value, Node<T> next) {
		this.value = value;
		this.next = next;
	}

	// ט.יציאה: הפעולה מחזירה את הערך של החוליה הנוכחית
	public T getValue() {
		return this.value;
	}

	// ט.יציאה: הפעולה מחזירה את החוליה העוקבת לחוליה הנוכחית
	public Node<T> getNext() {
		return this.next;
	}

	// ט.יציאה: הפעולה מחזירה אמת אם יש לחוליה הנוכחית חוליה עוקבת אחרת
	// מחזירה שקר
	public boolean hasNext() {
		return this.next != null;
	}

	// ט.כניסה: הפעולה מקבלת ערך שלם
	// ט.יציאה: הפעולה קובעת את ערך החוליה הנוכחית להיות
	public void setValue(T value) {
		this.value = value;
	}

	// ט.כניסה: הפעולה מקבלת חוליה
	// ט.יציאה: הפעולה קובעת את החוליה העוקבת לחוליה הנוכחית להיות החוליה
	public void setNext(Node<T> next) {
		this.next = next;
	}

	// ט.יציאה: הפעולה מחזירה מחרוזת המתארת את החוליה הנוכחית
	public String toString() {
		return this.value + " --> " + this.next;
	}
}
