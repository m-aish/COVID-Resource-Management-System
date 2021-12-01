// This program creates a custom exception type.
class InvalidVaccineException extends Exception {
    private int dose;
    private String company;

    InvalidVaccineException(int dose) {
        this.dose = dose;
    }

    InvalidVaccineException(String company) {
        this.company = company;
    }

    public String toString() {
    if(company==null)
    return "InvalidVaccineException[Dose=" + dose + "]";
    else
    return "InvalidVaccineException[Company="+ company + "]";
    }
}