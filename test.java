 class test extends Thread
 {
 public void run()
 {
 system.out.println("start");
 yield();
 resume();
 system.out.println("re start");
 stop();
 resume();
 system.out.println("not restart");
 }
 public static void main(String[] rk and sp)
 {
 test t=new test();
 t.start();
 }
 }