class SwapVar{
    static int a = 20;
    static int b = 15;
    static void swapVar(){
        int temp =a;
        a = b;
        b = temp;
    }
    public static void main(String[] args){
        swapVar();
        System.out.println(a + " "+ b);
        swapVar();
        System.out.println(a + " "+ b);
    }
}