import java.util.Scanner;
public class Main {
    public static long gcd(long p,long k){
        if(k==0) return p;
        return myGcd(k, p%k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),r=sc.nextInt();
        long p=1,k=1;
        if(n-r<r) r=n-r;
        if(r!=0){
            while(r>0){
                p*=n;
                k*=r;
                long gcdrd=gcd(p,k);
                p/=gcdrd; k/=gcdrd;
                n--; r--;
            }
        }
        System.out.print(p);
    }
}
