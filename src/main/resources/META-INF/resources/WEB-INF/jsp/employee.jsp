<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            padding: 20px;
        }

        h1 {
            color: #007bff;
            margin-bottom: 20px;
        }

        table {
            margin-top: 20px;
        }

        th, td {
            text-align: center;
            padding: 10px;
        }

        thead {
            background-color: #007bff;
            color: #ffffff;
        }

        tbody tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tbody tr:hover {
            background-color: #e2e6ea;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Users</h1>
        <table class="table table-bordered table-striped">
            <thead>
                <tr>
                    <th>UserName</th>
                    <th>Password</th>
                    <th>ID</th>
                    <th>Type</th>        
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${users}" var="user">
                    <tr>
                        <td>${user.userName}</td>
                        <td>${user.password}</td>
                        <td>${user.iD}</td>
                        <td>${user.type}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>