package designpatterns.creational.singleton;

class Client {

    public static void main(String[] args) throws InterruptedException {

        Thread foo = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Singleton instancee = Singleton.getInstance("foo");
            System.out.println(instancee.getValue());
        });

        Thread boo = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Singleton instancee = Singleton.getInstance("boo");
            System.out.println(instancee.getValue());
        });

        foo.start();
        boo.start();

        boo.join();
        foo.join();

    }
}
