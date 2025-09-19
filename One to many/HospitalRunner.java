public class HospitalRunner {
    public static void main(String[] args) {
        Room sharedRoom = new Room(101, "ICU");

        Hospital hospital = new Hospital("City Hospital", "Downtown", sharedRoom);
        Doctor doctor = new Doctor("Dr. Smith", "Cardiology", sharedRoom);
        Patient patient = new Patient("John Doe", 45, sharedRoom);
        Department department = new Department("Emergency", 1, sharedRoom);
        Appointment appointment = new Appointment("2025-09-20", "10:30 AM", sharedRoom);

        hospital.displayHospitalDetails();
        doctor.displayDoctorDetails();
        patient.displayPatientDetails();
        department.displayDepartmentDetails();
        appointment.displayAppointmentDetails();
    }
}