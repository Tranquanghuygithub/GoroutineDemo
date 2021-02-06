package com.demo.goroutine;

public class Demo implements AsyncUtils{
    public void test(String msg) {
        //BlockingQueue<String> chanell= new LinkedBlockingQueue<>();
        async(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(msg + " : " + i);

            }
        });
    }

    public static void main(String[] args) throws InterruptedException {
        Demo demo = new Demo();
        demo.test("Hello");
        demo.test("Hi");
        demo.test("Hello");
        demo.test("Hi");

        int count = Thread.activeCount();
//        int count = Runtime.getRuntime().availableProcessors();
        System.out.println("Số luồng đang chạy " + count);
        Thread.sleep(1000);

    }
}
