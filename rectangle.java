import java.util.*;
class rect{
    int l,b,area;
    void show(){
        area=l*b;
        System.out.println("area="+area);
    }
    public static void main(String args[]){
        rect t = new rect();
        t.show();
    }
}