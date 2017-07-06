package loader;

import loader.QueueAb;

public class MyQueue extends QueueAb {
	public static int[] queue = new int[10];
	static int num = 0, max = 10, first = 0, last = -1;

	public static void main(String[] args) {

	}

	public void Enqueue(int element) {
		if (num == max) {
			int[] newqueue = new int[max + 1];
			int count = 0;
			for (int i = first; i <= last; i++) {
				newqueue[i] = queue[i];
				count++;
			}
			queue = newqueue;
			num = count;
			last = count - 1;
		}
		num++;
		last++;
		queue[last] = element;
	}

	public int Dequeue() {
		int requeue = queue[first];
		int count = 0;
		first++;
		if ((last - first + 1) == (max - 1)) {
			max -= 1;
			int[] newqueue = new int[max];
			for (int i = first; i <= last; i++) {
				newqueue[i] = queue[i];
				count++;
			}
			last = count - 1;
			num = count;
			first = 0;
			queue = newqueue;
		}
		return requeue;
	}
}