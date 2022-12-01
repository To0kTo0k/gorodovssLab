package tech.reliab.course.gorodovss.bank.service.impl;

import tech.reliab.course.gorodovss.bank.comparators.impl.BankComparatorImpl;
import tech.reliab.course.gorodovss.bank.entity.*;
import tech.reliab.course.gorodovss.bank.exceptions.NoBankMoneyException;
import tech.reliab.course.gorodovss.bank.exceptions.NoOfficeMoneyException;
import tech.reliab.course.gorodovss.bank.service.BankService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankServiceImpl implements BankService {

    private final List<Bank> bankList = new ArrayList<>();

    public List<Bank> getBankList() {
        return bankList;
    }

    @Override
    public void create(int id, String name) {
        this.bankList.add(new Bank(id, name));
    }

    @Override
    public Bank get(int i) {
        return this.bankList.get(i);
    }

    @Override
    public Bank choose(int creditSize) {
        getBankList().sort(new BankComparatorImpl());
        System.out.println("\nВыберите банк, где хотите оформить кредит (отсортированы от худшего к лучшему):");
        for (int i = 0; i < getBankList().size(); i++) {
            System.out.println(i + 1 + " " + get(i).getName() + " " + get(i).getBankRating());
        }
        System.out.println("\nВведите номер выбранного банка:");
        Scanner in = new Scanner(System.in);
        int bankId = in.nextInt() - 1;
        try {
            System.out.println("\nВыбран банк:\n" + (bankId + 1) + " " + get(bankId).getName() + " " + get(bankId).getBankRating());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\n" + e.getMessage());
            return null;
        }
        try {
            if (get(bankId).getMoney() < creditSize) {
                throw new NoBankMoneyException("Банк не обладает требуемой суммой денег");
            }
        } catch (NoBankMoneyException e) {
            System.out.println("\n" + e);
        }
        try {
            for (int i = 0; i < get(bankId).getOfficeList().size(); i++) {
                if (get(bankId).getOffice(i).getBank().getMoney() > creditSize) {
                    return get(bankId);
                }
            }
            throw new NoOfficeMoneyException("Ни в одном офисе банка нет требуемой суммы денег");
        } catch (NoOfficeMoneyException e) {
            System.out.println("\n" + e);
            return null;
        }
    }

    @Override
    public void read(Bank bank) {
        System.out.println(bank);
    }

    @Override
    public void updateId(Bank bank, int id) {
        bank.setId(id);
    }

    @Override
    public void updateName(Bank bank, String name) {
        bank.setName(name);
    }

    @Override
    public void updateBankRating(Bank bank, byte bankRating) {
        bank.setBankRating(bankRating);
    }

    @Override
    public void updateInterestRating(Bank bank, float interestRating) {
        bank.setInterestRating(interestRating);
    }

    @Override
    public void addMoney(Bank bank, int money) {
        bank.setMoney(bank.getMoney() + money);
    }

    @Override
    public Boolean subMoney(Bank bank, int money) {
        if (bank.getMoney() < money)
            return Boolean.FALSE;
        bank.setMoney(bank.getMoney() - money);
        return Boolean.TRUE;
    }

    /*@Override
    public void delBank(Bank bank) {
        bank = null;
    }*/
}
