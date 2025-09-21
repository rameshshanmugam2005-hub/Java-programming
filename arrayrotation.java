public class arrayrotation {
    public static void main(String args[]){
    Scanner kb=new Scanner(System.in);
    int arr[]=new Int[size];
   for(int i=0;i<size;i++){
   arr[i]=kb.nextInt();
   System.out.print(Arrays.to.String(arr));
   
   int leftr=kb.nextInt();
   for(int j=1;j<=leftr;j++){
    int temp=arr[0];
    for(int i=0;i<size-1;i++)
    arr[i]=arr[i+1];
    arr[size-1]=temp;

   }
    System.out.print(Array.toString(arr));
}

    }
}