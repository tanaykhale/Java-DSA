class Information {
    int blockNo;
    int floorNo;
    int roomNo;
    int bedNo;

    Information(int blockNo, int floorNo, int roomNo, int bedNo) {
        this.blockNo = blockNo;
        this.floorNo = floorNo;
        this.roomNo = roomNo;
        this.bedNo = bedNo;
    }
}

class Payment {
    double admFees;
    double regFees;
    double balAmt;

    Payment(double admFees, double regFees, double balAmt) {
        this.admFees = admFees;
        this.regFees = regFees;
        this.balAmt = balAmt;
    }
}

class Patient {
    String patientName;
    int patientAge;
    String doa;
    String disease;
    Information information;
    Payment payment;

    Patient(String patientName, int patientAge, String doa, String disease, Information information, Payment payment) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.doa = doa;
        this.disease = disease;
        this.information = information;
        this.payment = payment;
    }

    void patientDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Age: " + patientAge);
        System.out.println("Date of Arrival: " + doa);
        System.out.println("Disease: " + disease);
        System.out.println("Block No: " + information.blockNo);
        System.out.println("Floor No: " + information.floorNo);
        System.out.println("Room No: " + information.roomNo);
        System.out.println("Bed No: " + information.bedNo);
        System.out.println("Admission Fees: " + payment.admFees);
        System.out.println("Registration Fees: " + payment.regFees);
        System.out.println("Balance Amount: " + payment.balAmt);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Information info = new Information(1, 2, 101, 3);
        Payment payment = new Payment(5000.0, 200.0, 2500.0);

        Patient patient = new Patient("John Doe", 30, "2023-08-05", "Malaria", info, payment);
        patient.patientDetails();
    }
}
