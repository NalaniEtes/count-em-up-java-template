package org.example;

class GroceryCounter {
    private int count;
    private int overflowCount;

    public GroceryCounter() {
        count = 0;
        overflowCount = 0;
    }

    public void tens() {
        add(100);
    }

    public void ones() {
        add(1000);
    }

    public void tenths() {
        add(10);
    }

    public void hundreths() {
        add(1);
    }

    private void add(int amount) {
        count += amount;
        if (count > 9999) {
            count = count - 10000;
            overflowCount++;
        }
    }

    public String total() {
        int dollars = count / 100;
        int cents = count % 100;

        if (cents < 10) {
            return "$" + dollars + ".0" + cents;
        } else {
            return "$" + dollars + "." + cents;
        }
    }

    public int overflows() {
        return overflowCount;
    }

    public void clear() {
        count = 0;
        overflowCount = 0;
    }
}
