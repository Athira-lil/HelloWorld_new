package com.athira_Company;

import com.athira_Company.memento.Editor;
import com.athira_Company.memento.History;

public class Main {

    public static void main(String[] args) {
//        User user = new User("Athira");
//        user.sayHello();
//        ************* end

        /*TaxCalculator calculator = new TaxCalculator2019();
        System.out.println(calculator.calculateTax());*/

//        ******** OR **********

       /* TaxCalculator calculator = getCalculator();
        System.out.println(calculator.calculateTax());
        **********end
        */
        var editor = new Editor();
        var history = new History();
        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restoreState(history.pop());

        editor.setContent("d");
        editor.restoreState(history.pop());

        System.out.println(editor.getContent());

    }
       /* public static TaxCalculator getCalculator(){
            return new TaxCalculator2019();
        }*/
}
