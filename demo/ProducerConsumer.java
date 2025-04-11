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
    notify();
  }
}

public class ProducerConsumer {
  public static void main(String[] args) {
    SharedBuffer buffer = new SharedBuffer();

    Runnable producerTask = () -> {
      try {
        for (int i = 0; i < 10; i++) {
          buffer.produce(i);
          Thread.sleep(500);
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    Runnable consumerTask = () -> {
      try {
        for (int i = 0; i < 10; i++) {
          buffer.consume();
          Thread.sleep(10);
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    new Thread(producerTask).start();
    new Thread(consumerTask).start();
  }
}