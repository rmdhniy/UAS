 import java.util.ArrayList;

public class belajararraylist {
    public static void main(String[] args) {

        ArrayList<Integer> number= new ArrayList<>();
        number.add(4);
        number.add(10);
        number.add(15);
        number.add(35);
        // comand int x and f  is useless
        int x = number.get(1);
        int f = number.get(3);
        // comad for print index
        for (int index = 0;index< number.size();index++) {
            System.out.println("Data dari index ke"+ index + "adalah :" + number.get(index));

        }






}
}
