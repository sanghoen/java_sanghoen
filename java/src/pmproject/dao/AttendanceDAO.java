package pmproject.dao;

import java.util.List;

public interface AttendanceDAO {
    void recordAttendance(int employeeId, String dateTime);
    void recordLeave(int employeeId, String dateTime);
    String viewAttendance(int employeeId);
    void changeAttendance(int employeeId, String newStatus);
    void applyLeave(int employeeId, String leaveType, String startDate, String endDate);
    String viewLeave(int employeeId);
}