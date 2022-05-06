<#import "/spring.ftl" as spring/>

<html>
<head>
    <title>Student List</title>
    <link rel="stylesheet"
          type="text/css"
          href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<h3>Student List</h3>
<a href="addStudent">Add Student</a>
<br><br>
<div>

    <table border="1">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>
    </table>

</div>
</body>
</html>