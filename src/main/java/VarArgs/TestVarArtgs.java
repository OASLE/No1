package VarArgs;

public class TestVarArtgs {
    public static void main(String[] args) {
        TestVarArgs.print(2,3,4,5,1,12,42);
        int[] v1 = new int[]{10 ,15, 16};
        int[] v2 = new int[]{14, 10 ,20};

        int[] v = TestVarArgs.alipire2Vectori(v2 ,v2);
        for (int i= 0 ;i< v.length; i++){
            System.out.println("pozitia "+ (i+ 1)+ "in vectorul suma avem: "+ v[i]);
        }
    }
}
