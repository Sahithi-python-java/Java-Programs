const mysql = require('mysql');
const dotenv = require('dotenv');

// Load environment variables from .env file
dotenv.config();

const db = mysql.createConnection({
  host: process.env.DB_HOST,        // From .env
  user: process.env.DB_USER,        // From .env
  password: process.env.DB_PASSWORD, // From .env
  database: process.env.DB_NAME     // From .env
});

db.connect((err) => {
  if (err) {
    console.error('Error connecting to the database: ', err);
    process.exit(1); // Exit the app if DB connection fails
  } else {
    console.log('Connected to MySQL database');
  }
});

module.exports = db;  // Export the connection object to be used in other files
