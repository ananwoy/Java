
public class MyQue {
	Object que[];
	int cap, rear, front;

	MyQue(int cap) {
		this.cap = cap;
		que = new Object[cap];
		rear = front = -1;
	}

	public boolean enQue(Object obj) {
		if (rear == cap - 1) {
			System.out.println("Queue overflow");
			return false;
		}
		if (front == -1)
			front = 0;
		que[++rear] = obj;
		return true;
	}

	public Object deQue() {
		if (front == -1 || front > rear) {
			System.out.println("queue underflow");
			front = rear = -1;
			return null;
		}
		return que[front++];
	}

	public int size() {
		if (front == -1) {
			return 0;
		}
		return rear - front + 1;
	}

	public String toString() {
		String st = "[";
		for (int i = 0; i <= rear; i++) {
			st = st + que[i] + ",";
		}
		return st + "]";
	}
}