package ru.geekbrains;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneDictionary {

    private final HashMap<String, ArrayList<String>> phoneDictionary;

    public PhoneDictionary() {
        this.phoneDictionary = new HashMap<>();
    }

    public HashMap<String, ArrayList<String>> getPhoneDictionary() {
        return phoneDictionary;
    }

    public ArrayList<String> get(String lastName) {
        if (phoneDictionary.containsKey(lastName)) {
            return this.phoneDictionary.get(lastName);
        }
        return new ArrayList<String>();
    }

    public void add(String lastName, @NotNull String phoneNumber) {
        if (!phoneNumber.matches("^\\d\\(\\d{3,5}\\)\\d{5,7}$")) {
            throw new WrongPhoneNumberFormatException("Телефон указан не по формату d(3-5)5-7!");
        }
        ArrayList<String> phones;
        phones = this.get(lastName);
        phones.add(phoneNumber);
        this.phoneDictionary.put(lastName, phones);
    }

}
