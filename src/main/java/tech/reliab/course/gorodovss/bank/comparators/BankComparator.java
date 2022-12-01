package tech.reliab.course.gorodovss.bank.comparators;

import tech.reliab.course.gorodovss.bank.entity.Bank;

import java.util.Comparator;

public interface BankComparator extends Comparator<Bank>{
    @Override
    int compare(Bank o1, Bank o2);

}
