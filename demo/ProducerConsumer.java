package demo;

class SharedBuffer {
	  private Integer data = null;

	  public synchronized void produce(int value) throws InterruptedException {
	    while (data != null) wait();
	    data = value;
	    System.out.println("Produced: " + value);
	    notify();
	  }

	  public synchronized void consume() throws InterruptedException {
	    while (data == null) wait();
	    System.out.println("Consumed: " + data);
	    data = null;
	    notifyAll();
	  }
	}

	class Producer extends Thread {
	  private SharedBuffer buffer;

	  public Producer(SharedBuffer buffer) {
	    this.buffer = buffer;
	  }

	  public void run() {
	    try {
	      for (int i = 0; i < 10; i++) {
	        buffer.produce(i);
	        Thread.sleep(500);
	      }
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	  }
	}

	class Consumer extends Thread {
	  private SharedBuffer buffer;

	  public Consumer(SharedBuffer buffer) {
	    this.buffer = buffer;
	  }

	  public void run() {
	    try {
	      for (int i = 0; i < 10; i++) {
	        buffer.consume();
	        Thread.sleep(10);
	      }
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	  }
	}

	public class ProducerConsumer {
	  public static void main(String[] args) {
	    SharedBuffer buffer = new SharedBuffer();
	    Producer producer = new Producer(buffer);
	    Consumer consumer = new Consumer(buffer);

	    producer.start();
	    consumer.start();
	  }
	}