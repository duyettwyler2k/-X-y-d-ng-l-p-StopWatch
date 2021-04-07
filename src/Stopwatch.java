public class Stopwatch {
   double startTime;
   double endTime;
   public Stopwatch(){}
   void start(){
       this.startTime=System.currentTimeMillis();
   }
   void end(){
       this.endTime=System.currentTimeMillis();
   }
   double getElapsedTime(){
       return this.endTime-this.startTime;
   }
}
