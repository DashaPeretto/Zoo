package company;

public class Animals{
 String name;
 String breathe;
 String move;
 //int age;

public Animals (String name, String breathe, String move){
    this.name=name;
    this.breathe=breathe;
    this.move=move;
   // this.age=age;
}
    public void howBreathe () {
     System.out.println(this.breathe);
 }
    public void howMove (){
        System.out.println(this.move);
     }
    public void showName() {
        System.out.println (" This is" + this.name);
    }

    //public void setAge(int age) {
    //    this.age = age;
    }

    //public int getAge() {
     //   return age;
    //}






