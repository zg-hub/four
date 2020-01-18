public class GenericMethod {
    private static <T> boolean isEqual(GenericClass<T> g1, GenericClass<T> g2){
        return g1.getItem().equals(g2.getItem());
    }

    private static <T extends  Comparable<T>> int compare(
            T t1,T t2
    ){
        return t1.compareTo(t2);
    }
    public static void main(String[]args){
        GenericClass<String> g1=new GenericClass<>();
        g1.setItem("xi an");

        GenericClass<String> g2=new GenericClass<>();
        g1.setItem("xi an");

        boolean isEqual=GenericMethod.isEqual(g1,g2);
        System.out.println(isEqual);


        int compareResult=GenericMethod.compare(9,12);
        System.out.println(compareResult);
    }
}
