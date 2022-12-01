package tech.reliab.course.gorodovss.bank.comparators.impl;

import tech.reliab.course.gorodovss.bank.comparators.BankComparator;
import tech.reliab.course.gorodovss.bank.entity.Bank;

public class BankComparatorImpl implements BankComparator {
    @Override
    public int compare(Bank a, Bank b) {
        int aCount = 0;
        int bCount = 0;
        // compare every object property
        if (a.getOfficeCount() > b.getOfficeCount()) {
            aCount++;
        } else if (b.getOfficeCount() > a.getOfficeCount()) {
            bCount++;
        }
        if (a.getAtmCount() > b.getAtmCount()) {
            aCount++;
        } else if (b.getAtmCount() > a.getAtmCount()) {
            bCount++;
        }
        if (a.getEmployeeCount() > b.getEmployeeCount()) {
            aCount++;
        } else if (b.getEmployeeCount() > a.getEmployeeCount()) {
            bCount++;
        }
        if (a.getClientCount() > b.getClientCount()) {
            aCount++;
        } else if (b.getClientCount() > a.getClientCount()) {
            bCount++;
        }
        if (a.getBankRating() > b.getBankRating()) {
            aCount++;
        } else if (b.getBankRating() > a.getBankRating()) {
            bCount++;
        }
        if (a.getMoney() > b.getMoney()) {
            aCount++;
        } else if (b.getMoney() > a.getMoney()) {
            bCount++;
        }
        // compare result of comparing all object properties
        if (a.getInterestRating() < b.getInterestRating()) {
            aCount++;
        } else if (a.getInterestRating() > b.getInterestRating()) {
            bCount++;
        }
        return Integer.compare(aCount, bCount);
    }
}
