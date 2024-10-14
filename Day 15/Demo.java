public class Demo {
    public static void main(String[] args) {
        // int a[]={2,2,1,1,1,2,2};
        int a[]={3,2,3};
        int cand=0;
        int point=0;
        for(int i=0;i<a.length;i++){
            if(point==0)
            {
                cand=a[i];
            }
            if(a[i]==cand)
            {
                point++;
            }
            else{
                point--;
            }
        }
        System.out.println(cand);
    }
}
