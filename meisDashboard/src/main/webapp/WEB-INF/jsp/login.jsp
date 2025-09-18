<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Student Enrollment Login</title>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

    <!-- Bootstrap CSS -->
    <link href="assets/css/bootstrap-united.css" rel="stylesheet" />

    <style>
        .error {
            color: #ff0000;
            font-size: 0.9em;
            font-weight: bold;
        }
        .errorblock {
            color: #000;
            background-color: #ffeeee;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
	

    <!-- JS Libraries -->
    <script src="jquery-1.8.3.js"></script>
    <script src="bootstrap/js/bootstrap.js"></script>
    
    
    <!-- Navbar -->
    <div class="navbar navbar-default">
        <div class="navbar-header">
            <img src="assets/img/logo-header.png" 
                 alt="Header Image" 
                 style="width: 100%; height: auto;">
        </div>
    </div>

    <!-- Main Content -->
    <div class="container">
        <div class="jumbotron">
        
          <canvas id="userChart" ></canvas>   
            
            
    <!--         <script>
        const ctx = document.getElementById('userChart').getContext('2d');
        const userChart = new Chart(ctx, {
            type: 'bar',
            data: {
                labels: ['Male', 'Female'],
                datasets: [{
                    label: 'User Count',
                    data: [12, 19], // Replace with dynamic data from JSP
                    backgroundColor: ['#36A2EB', '#FF6384']
                }]
            }
        });
    </script> -->
    
	   <script>
	     // Get values from the model (JSP EL)
	    // Safe defaults (0 if null)
    	var numberOfSectors = ${indicatorsCPW.numberOfSectorsCovered != null ? indicatorsCPW.numberOfSectorsCovered : 0};
    	var workingDays = ${indicatorsCPW.allWDays != null ? indicatorsCPW.allWDays : 0};
    	var maleAllWDays =  ${indicatorsCPW.maleAllWDays != null ? indicatorsCPW.maleAllWDays : 0}
	
	    var ctx = document.getElementById('userChart').getContext('2d');
	    new Chart(ctx, {
	        type: 'bar',
	        data: {
	            labels: ['Number of Sectors Covered', 'Working Days per HH','Working days per HH headed by Male	'],
	            datasets: [{
	                label: 'Indicators',
	                data: [numberOfSectors, workingDays,maleAllWDays],
	                backgroundColor: ['rgba(75, 192, 192, 0.6)', 'rgba(255, 159, 64, 0.6)']
	            }]
	        },
	        options: {
	            responsive: true,
	            plugins: {
	                legend: { display: false }
	            }
	        }
	    });
		</script>
	            
       </div>
    </div>
    
    


</body>
</html>
