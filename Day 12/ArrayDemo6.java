public class ArrayDemo6 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 1, 2,3 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            boolean isrepeat = false;
            for (int j = 0; j <i; j++) {
                if(a[i]==a[j])
                {
                    isrepeat=true;
                    break;
                }
            }
            if(!isrepeat){
                boolean isrepeated=false;
                for(int k=i+1;k<a.length;k++)
                {
                    if(a[i]==a[k])
                    {
                        isrepeated=true;
                        break;
                    }
                }
                if(!isrepeated)
                {
                    sum=sum+a[i];
                }
            }

        }
        System.out.println(sum);
    }
}
