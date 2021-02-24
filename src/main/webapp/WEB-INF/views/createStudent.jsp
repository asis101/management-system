<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>
    <%@ include file="header.jsp"%>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-8 jumbotron">
                <form action="save_student" method="post">
                    <div class="form-row">
                        <div class="form-group col-md-12">
                            <label>Student Name</label>
                            <input type="text" class="form-control" name="studentName" required>
                        </div>
                        <div class="form-group col-md-6">
                            <label>DOB</label>
                            <input type="date" name="dob" class="form-control">
                        </div>
                        <div class="form-group col-md-6">
                            <label style="display: block">Gender</label>
                            <div class="form-check" style="display: inline-block">
                                <input  class="form-check-input" type="radio" name="gender" value="Male">
                                <label class="form-check-label"> Male </label>
                            </div>
                            <div class="form-check" style="display: inline-block">
                                <input  class="form-check-input" type="radio" name="gender" value="Female">
                                <label class="form-check-label"> Female </label>
                            </div>

                        </div>
                        <div class="form-group col-md-6">
                            <label>Email</label>
                            <input type="email" name="email" class="form-control">
                        </div>
                        <div class="form-group col-md-6">
                            <label>Contact No</label>
                            <input type="number" name="contactNo" class="form-control">
                        </div>
                        <div class="form-group col-md-4">
                            <label>City</label>
                            <input type="text" class="form-control" name="address.city" required>
                        </div>
                        <div class="form-group col-md-4">
                            <label>State</label>
                            <input type="text" class="form-control" name="address.state" required>
                        </div>
                        <div class="form-group col-md-4">
                            <label>Country</label>
                            <input type="text" class="form-control" name="address.country" required>
                        </div>
                        <div class="form-group col-md-4">
                            <label>Course Name</label>
                            <input type="text" class="form-control" name="course.courseName" required>
                        </div>
                        <div class="form-group col-md-4">
                            <label>Course Period in months</label>
                            <input type="number" class="form-control" name="course.coursePeriod" required>
                        </div>
                        <div class="form-group col-md-4">
                            <label>Course Cost in $</label>
                            <input type="number" class="form-control" name="course.courseCost" required>
                        </div>
                        <button type="submit" class="btn btn-primary">Save</button>
                    </div>
                </form>
            </div>
            <div class="col-md-2"></div>
        </div>
    </div>
</body>
</html>