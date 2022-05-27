package homework.stage13.model.entity;

public class Artifact {
    String element; // элемент: воздух, вода, огонь, земля
    double recovery; // восстановление энергии
    double power; // сила
    double stamina; // выносливость
    boolean treatment; // хилл


    public Artifact() {
        element = "no element";
        recovery = 0.0;
        power = 0.0;
        stamina = 0;
        treatment = false;
    }

    public Artifact(String element, double recovery, double power, double stamina, boolean treatment) {
        this.element = element;
        this.recovery = recovery;
        this.power = power;
        this.stamina = stamina;
        this.treatment = treatment;
    }

    public Artifact(String element) {
        this(); // вызов конструктура
        this.element = element;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public double getRecovery() {
        return recovery;
    }

    public void setRecovery(double recovery) {
        this.recovery = recovery;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power > 0) {
            this.power = power;
        }
    }

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {
        if (stamina > 0) {
            this.stamina = stamina;
        }
    }
    
    public boolean isTreatment() {
        return treatment;
    }

    public void setTreatment(boolean treatment) {
        this.treatment = treatment;
    }

    public String toString() {
        return element + ": " + ", recovery = " + recovery +
                ", power = " + power + ", stamina = " + stamina + 
                ", treatment = " + treatment;
    }


}
