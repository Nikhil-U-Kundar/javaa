
public class object {
    void multiply(int a,int b){
        int c=a*b;
        System.out.println("the multiple of "+ c +" id"+c);
    }
    void Khushi(String a){
        System.out.println("my name is "+a);
    }

    void add(int a,int b){
        int c=a+b;
        System.out.println("the sum is "+c);
    }
  public static void main(String[] args) {
    object o1=new object();
    o1.add(23,34);
    o1.multiply(450, 0100);
    o1.Khushi("khushi");
  }  
}
