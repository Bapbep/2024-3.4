public class Student {
    private String studentID;
    private String studentName;
    private String[] extraActivities;

    public Student(String studentID, String studentName, int numExtraActivities) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new String[numExtraActivities];
    }

    public void addExtraActivity(String activity) {
        for (int i = 0; i < extraActivities.length; i++) {
            if (extraActivities[i] == null) {
                extraActivities[i] = activity;
                return;
            }
        }
        throw new IllegalStateException("No more extra activities can be added.");
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String[] getExtraActivities() {
        return extraActivities;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student ID: ").append(studentID).append("\n");
        sb.append("Student Name: ").append(studentName).append("\n");
        sb.append("Extra Activities: ");
        for (String activity : extraActivities) {
            if (activity != null) {
                sb.append(activity).append(", ");
            }
        }
        return sb.toString();
    }
}

