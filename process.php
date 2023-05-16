<?php
// Check if form is submitted
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Retrieve the form data
    $inputValue = $_POST['inputField'];

    // Database connection details
    $host = 'localhost';
    $username = 'root';
    $password = '';
    $database = 'test_db';

    // Create a database connection
    $conn = mysqli_connect($host, $username, $password, $database);

    // Check the connection
    if (!$conn) {
        die('Database connection failed: ' . mysqli_connect_error());
    }

    // Insert the form data into the database
    $query = "INSERT INTO your_table (column_name) VALUES ('$inputValue')";
    if (mysqli_query($conn, $query)) {
        echo "Form submitted and data inserted successfully.";
    } else {
        echo "Error: " . $query . "<br>" . mysqli_error($conn);
    }

    // Close the database connection
    mysqli_close($conn);
}
?>
