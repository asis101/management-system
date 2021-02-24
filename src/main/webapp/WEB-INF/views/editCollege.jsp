<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Registration Form</title>
    <%@ include file="header.jsp"%>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8 jumbotron">
            <form action="update_college" method="post">
                <div class="form-row">
                    <div class="form-group col-md-12">
                        <label>College Id</label>
                        <input type="text" class="form-control" name="id" value="${college.id}" required readonly>
                    </div>
                    <div class="form-group col-md-12">
                        <label>College Name</label>
                        <input type="text" class="form-control" name="collegeName" value="${college.collegeName}" required>
                    </div>
                    <div class="form-group col-md-4">
                        <label>City</label>
                        <input type="text" class="form-control" name="address.city" value="${college.address.city}" required>
                    </div>
                    <div class="form-group col-md-4">
                        <label>State</label>
                        <input type="text" class="form-control" name="address.state" value="${college.address.state}" required>
                    </div>
                    <div class="form-group col-md-4">
                        <label>Country</label>
                        <input type="text" class="form-control" name="address.country" value="${college.address.country}" required>
                    </div>
                    <div class="form-group col-md-12">
                        <label>Contact Number</label>
                        <input type="number" class="form-control" name="contactNo" value="${college.contactNo}" required>
                    </div>
                    <div class="form-group col-md-7">
                        <label>Course Name</label>
                        <input type="text" class="form-control" name="courses.courseName" value=""  required>
                    </div>
                    <div class="form-group col-md-3">
                        <label>Course Period(months)</label>
                        <input type="number" class="form-control" name="courses.coursePeriod" value="" required>
                    </div>
                    <div class="form-group col-md-2">
                        <label>Course Cost($)</label>
                        <input type="number" class="form-control" name="courses.courseCost" value=""required>
                    </div>
                    <button type="submit" class="btn btn-primary">Update</button>
                </div>
            </form>
        </div>
        <div class="col-md-2"></div>
    </div>
</div>
</body>
</html>