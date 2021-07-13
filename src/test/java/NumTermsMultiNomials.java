public class NumTermsMultiNomials {

    //start: F(1,k)=1; F(n,0)=1
    //general: F(n,k)=F(n-1, k)+F(n,k-1)
    public static int F(int n, int k){
        if(n==1|| k==0){
            return 1;
        }else{
            return F(n-1,k)+F(n,k-1);
        }
    }
    public static int f(int n, int k){
        return (n==1|| k==0)? 1:f(n-1,k)+f(n,k-1);

    }

    public static void main(String[] args) {
        System.out.println("F(6, 9) = " + F(6, 9));
    }

}
