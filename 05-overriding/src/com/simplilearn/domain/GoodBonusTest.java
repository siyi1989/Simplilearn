package com.simplilearn.domain;

import com.simplilearn.domain.Employee;
import com.simplilearn.domain.GoodBonus;
import com.simplilearn.domain.Manager;
import com.simplilearn.domain.Engineer;

public class GoodBonusTest {
    public static void main(String[] args) {
        
        GoodBonus bonus = new GoodBonus();
        Employee e = new Employee(101, "Jim Smith", "111-11-1111", 2000);
        System.out.println(e.getDetails());
        System.out.println(e.calcBonus());
        //System.out.println("Bonus: " + bonus.calcBonus(e));
        
        Manager m = new Manager(102, "Joe Smith", "222-22-2222", 4000, "Marketing");
        System.out.println(m.getDetails());
        System.out.println(m.calcBonus());
       // System.out.println("Bonus: " + bonus.calcBonus(m));
        
        Engineer eng = new Engineer(103, "Yi Sheng", "222-22-2222", 6000);
        System.out.println(eng.getDetails());
        System.out.println(eng.calcBonus());
        //System.out.println("Bonus: " + bonus.calcBonus(eng));
    }
}

