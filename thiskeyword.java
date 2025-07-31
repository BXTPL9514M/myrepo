class demo{
    int a , b;
    void set(int a , int b){
        this.a=a;
        this.b=b;
    }
    void get(){
        System.out.println(a);
           System.out.println(b);
    }
    public static void main(String[] args) {
        demo d1 = new demo();
        d1.set(10,20);
        d1.get();
    }
}