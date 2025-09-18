<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>MEIS Dashboard</title>
  <style>
    body {
      margin: 0;
      font-family: "Poppins", Arial, sans-serif;
      background: #f4f7fa;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    /* Header */
    header {
      position: absolute;
      top: 0;
      left: 0;
      width: 100%;
      background: #fff;
      padding: 10px 20px;
      display: flex;
      align-items: center;
      box-shadow: 0 2px 5px rgba(0,0,0,0.1);
    }
    header img {
      height: 45px;
      margin-right: 15px;
    }
    header h1 {
      font-size: 20px;
      color: #333;
      margin: 0;
    }

    /* Card container */
    .container {
      background: #fff;
      text-align: center;
      padding: 40px;
      border-radius: 16px;
      box-shadow: 0 4px 20px rgba(0,0,0,0.1);
      width: 500px;
    }

    .container h2 {
      font-size: 28px;
      margin-bottom: 10px;
      color: #222;
    }

    .container p {
      color: #666;
      margin-bottom: 30px;
    }

    /* Button group */
    .btn-group {
      display: flex;
      justify-content: center;
      gap: 15px;
      flex-wrap: wrap;
    }

    .btn {
      padding: 12px 20px;
      border-radius: 8px;
      border: none;
      font-size: 15px;
      font-weight: 500;
      color: #fff;
      cursor: pointer;
      transition: transform 0.2s, background 0.3s;
    }

    .btn:hover {
      transform: translateY(-2px);
      opacity: 0.9;
    }

    .btn-sp { background: #6c63ff; }
    .btn-program { background: #00bcd4; }
    .btn-project { background: #4caf50; }
    .btn-finance { background: #ff9800; }

    .btn span {
      margin-right: 6px;
    }
  </style>
</head>
<body>

  <!-- Header -->
  <header>
    <img src="assets/img/logo-header.png" alt="Logo">
    <h1>LODA - Monitoring & Evaluation Information System</h1>
  </header>

  <!-- Main card -->
  <div class="container">
    <h2>Welcome to MEIS Dashboard!</h2>
    <p>To get started, please click one of the options below:</p>

    <div class="btn-group">
      <button class="btn btn-sp"><span>👥</span> Social Protection</button>
      <button class="btn btn-program"><span>📑</span> Program</button>
      <button class="btn btn-project"><span>🚀</span> Project</button>
      <button class="btn btn-finance"><span>💰</span> Finance</button>
    </div>
  </div>

</body>
</html>
/html>