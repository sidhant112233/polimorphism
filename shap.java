

public class  shap {
    public static void main(String[] args) {
        traingal t = new traingal();
        t.calcualate();
    }

}
class raktangal{
        int a = 10;
        int b = 5;
        public void calcualate(){
            System.out.println("raktangal area = "+(a*b));
        }
}
class traingal extends raktangal{
    int a = 50;
    int b = 20;
    
    public void calcualate(){
        super.calcualate();
        System.out.println("traingal area = "+(a*b/2));
    }
}
