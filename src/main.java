public class main {
    public static void main(String[] args) {
     Stopwatch stopwatch=new Stopwatch();
     stopwatch.start();
     for (int i=0;i<1000;i++){
         for (int j=0;j<1000;j++){
             System.out.println(i);
         }
     }
     stopwatch.end();
        System.out.println(stopwatch.getElapsedTime());
    }
}
