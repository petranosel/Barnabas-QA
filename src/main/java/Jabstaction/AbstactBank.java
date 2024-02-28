package Jabstaction;

public class AbstactBank {
    public static void main(String[] args) {
        Bank bofa = new BOFA();
        bofa.getRate();
        Bank chase = new Chase();
        chase.getRate();
    }
}

abstract class Bank {
    abstract  int getRate();
}
class  BOFA extends Bank {
    int getRate() {
        return 7;
    }
}

class Chase extends Bank{
int getRate () {
    return 8;
}

}