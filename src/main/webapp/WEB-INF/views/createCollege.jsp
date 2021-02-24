<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add College</title>
    <%@ include file="header.jsp"%>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-8 jumbotron">
                <form action="save_college" method="post">
                    <div class="form-row">
                        <div class="form-group col-md-12">
                            <label>College Name</label>
                            <input type="text" class="form-control" name="collegeName" required>
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
                        <div class="form-group col-md-6">
                            <label>Email</label>
                            <input type="email" class="form-control" name="email" required>
                        </div>
                        <div class="form-group col-md-6">
                            <label>Contact Number</label>
                            <input type="number" class="form-control" name="contactNo" required>
                        </div>
                        <div class="form-group col-md-7">
                            <label>Course Name</label>
                            <input type="text" class="form-control" name="courses.courseName" required>
                        </div>
                        <div class="form-group col-md-3">
                            <label>Course Period(months)</label>
                            <input type="number" class="form-control" name="courses.coursePeriod" required>
                        </div>
                        <div class="form-group col-md-2">
                            <label>Course Cost($)</label>
                            <input type="number" class="form-control" name="courses.courseCost" required>
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