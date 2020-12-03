import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        String streng = "hallo";

        Parameter parameter = new Parameter();
        parameter.tmp(arrayList,streng);
        Collections.sort(arrayList);
    }

}