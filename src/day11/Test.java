package day11;

public class Test implements Intr{

    @Override
    public int[] display(int p) {
        int[] ans=new int[p+1];

        for(int i=2;i<=p;i++){
            int count=0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==1){
                ans[i]=i;

            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        Test t1=new Test();
        int[] a=(t1.display(17));

        for(int i=0;i<a.length;i++){
            if(a[i]!=0) {
                System.out.println(a[i]);
            }
        }

    }
}
