package OOPIntro.enumPractice.demo01;

public enum  Numbers {
    I(1),V(5),X(10),L(50),C(100),D(500),M(1000),k(100);

    public final int number;
    public final int number1;
    Numbers(int number){
        this.number = number;
        this.number1 = number+ordinal();
    }

    @Override
    public String toString() {
        return "Index: "+ordinal()+" ,name: "+name()+" ,value: "+number;
    }

    public static void main(String[] args) {
        for(Numbers number: Numbers.values()){
            System.out.println(number);
        }

        int value = Enum.valueOf(Numbers.class,"M").number1;
        System.out.println(value);
    }
}
