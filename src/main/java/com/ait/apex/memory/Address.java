package com.ait.apex.memory;

public class Address {

    private int pageNumber;
    private int address;

    public Address() {
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int pageNumber, int address){
        this.address = address;
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pageNumber=" + pageNumber +
                ", address=" + address +
                '}';
    }
}
