package xier2;

public class ChinesePastoralDog extends Animal{

    private boolean isVaccineInjected;


    public ChinesePastoralDog(boolean isVaccineInjected) {
        this.isVaccineInjected = isVaccineInjected;
    }

    public ChinesePastoralDog(String name, int age, String gender, double price, boolean isVaccineInjected) {
        super(name, age, gender, 100);
        this.isVaccineInjected = isVaccineInjected;
    }
    @Override
    public String toString() {
        return null;
    }
}
