
import java.util.*;

import javax.swing.plaf.synth.SynthStyle;
class bank{
    int accno=5001;
    int bal;
    bank(int accno,int bal){
        this.accno=accno;
        this.bal=bal;
    }
    void deposit(int a){
        bal=bal+a;
        //  System.out.println("balance ++" + bal);

    }
    void withdraw(int b){
        if(b<bal){
            bal=b-bal;
            System.out.println("done");
        }
        else{

            System.out.println("eroor");
        }

    }

    void show(){
        System.out.println("ACC_NO "+" "+ accno);

        System.out.println("balance is "+"  "+bal);


    }

}

