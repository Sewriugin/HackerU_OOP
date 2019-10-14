package com.company;

public class Airplane {
    int seatingCapacity;
    int flightRange;
    String company;

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public String getCompany() {
        return company;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    //TODO нужно переопределить метод equals, нажать alt + insert Выбрать Equals and hash code
    //TODO Выбрать нужные поля смыслу задачи все поля кроме company, так как мы их решили игнорить по смыслу задачи
    //TODO В итоге у вас сформируется код наподобие этого
    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;

        return this.seatingCapacity == airplane.seatingCapacity && this.flightRange == airplane.flightRange;
    }
    */



}
