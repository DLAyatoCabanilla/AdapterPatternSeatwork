public class CentralHub {
    public static void main(String[] args){

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        AttendanceSystemAdapter attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);
        GradingSystemAdapter gradingAdapter = new GradingSystemAdapter(gradingSystem);
        LibrarySystemAdapter libraryAdapter = new LibrarySystemAdapter(librarySystem);

        attendanceAdapter.integrateSystem();
        gradingAdapter.integrateSystem();
        libraryAdapter.integrateSystem();
    }
}
